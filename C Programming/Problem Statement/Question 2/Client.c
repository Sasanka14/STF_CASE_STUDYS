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
    int sockfd;
    struct sockaddr_in servaddr;
    char buffer[MAX];

    // 1. Create socket
    sockfd = socket(AF_INET, SOCK_STREAM, 0);
    if (sockfd == -1) {
        perror("Socket creation failed");
        exit(1);
    }
    printf("✅ Socket created successfully\n");

    servaddr.sin_family = AF_INET;
    servaddr.sin_port = htons(PORT);
    servaddr.sin_addr.s_addr = inet_addr("127.0.0.1"); // Localhost

    // 2. Connect to server
    if (connect(sockfd, (struct sockaddr*)&servaddr, sizeof(servaddr)) != 0) {
        perror("Connection with server failed");
        exit(1);
    }
    printf("✅ Connected to server\n");

    // 3. Chat loop
    while (1) {
        printf("💬 Enter client message: ");
        memset(buffer, 0, sizeof(buffer));
        fgets(buffer, MAX, stdin);

        write(sockfd, buffer, strlen(buffer));

        // Exit if client says "exit"
        if (strncmp("exit", buffer, 4) == 0) {
            printf("👋 Client closing connection\n");
            break;
        }

        memset(buffer, 0, sizeof(buffer));
        int n = read(sockfd, buffer, sizeof(buffer));
        if (n > 0)
            printf("📩 From server: %s\n", buffer);
        else {
            printf("❌ Server disconnected\n");
            break;
        }
    }

    close(sockfd);
    return 0;
}
