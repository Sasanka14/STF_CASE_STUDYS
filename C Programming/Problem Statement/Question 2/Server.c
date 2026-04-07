#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <unistd.h>
#include <netinet/in.h>
#include <sys/socket.h>
#include <arpa/inet.h>

#define PORT 8080
#define MAX 1024

int main() {
    int sockfd, connfd, len;
    struct sockaddr_in servaddr, cli;
    char buffer[MAX];

    // 1. Create socket
    sockfd = socket(AF_INET, SOCK_STREAM, 0);
    if (sockfd == -1) {
        perror("Socket creation failed");
        exit(1);
    }
    printf("✅ Socket created successfully\n");

    // 2. Assign IP, PORT
    servaddr.sin_family = AF_INET;
    servaddr.sin_addr.s_addr = INADDR_ANY;
    servaddr.sin_port = htons(PORT);

    // 3. Bind socket
    if (bind(sockfd, (struct sockaddr*)&servaddr, sizeof(servaddr)) != 0) {
        perror("Bind failed");
        exit(1);
    }
    printf("✅ Socket bound to port %d\n", PORT);

    // 4. Listen for client
    if (listen(sockfd, 5) != 0) {
        perror("Listen failed");
        exit(1);
    }
    printf("👂 Server listening...\n");

    len = sizeof(cli);

    // 5. Accept client connection
    connfd = accept(sockfd, (struct sockaddr*)&cli, (socklen_t*)&len);
    if (connfd < 0) {
        perror("Server accept failed");
        exit(1);
    }
    printf("✅ Client connected\n");

    // 6. Chat loop
    while (1) {
        memset(buffer, 0, sizeof(buffer));
        int n = read(connfd, buffer, sizeof(buffer));
        if (n <= 0) {
            printf("❌ Client disconnected\n");
            break;
        }
        printf("📩 From client: %s\n", buffer);

        // Exit if client says "exit"
        if (strncmp("exit", buffer, 4) == 0) {
            printf("👋 Server closing connection\n");
            break;
        }

        // Send response
        printf("💬 Enter server message: ");
        memset(buffer, 0, sizeof(buffer));
        fgets(buffer, MAX, stdin);

        write(connfd, buffer, strlen(buffer));
    }

    close(connfd);
    close(sockfd);
    return 0;
}
