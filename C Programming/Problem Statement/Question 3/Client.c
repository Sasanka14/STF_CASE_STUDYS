#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <unistd.h>
#include <arpa/inet.h>

#define PORT 8080
#define MAX 1024

int main() {
    int sockfd;
    struct sockaddr_in serverAddr;
    char buffer[MAX];

    // 1. Create TCP socket
    sockfd = socket(AF_INET, SOCK_STREAM, 0);
    if (sockfd < 0) {
        perror("Socket creation failed");
        exit(1);
    }

    // 2. Configure server address
    serverAddr.sin_family = AF_INET;
    serverAddr.sin_port = htons(PORT);
    serverAddr.sin_addr.s_addr = inet_addr("127.0.0.1");

    // 3. Connect to server
    if (connect(sockfd, (struct sockaddr*)&serverAddr, sizeof(serverAddr)) < 0) {
        perror("Connection failed");
        exit(1);
    }

    printf("Connected to server. Type messages (type 'exit' to quit)\n");

    while (1) {
        printf("Enter a string: ");
        fgets(buffer, MAX, stdin);
        buffer[strcspn(buffer, "\n")] = '\0'; // remove newline

        if (strcmp(buffer, "exit") == 0)
            break;

        send(sockfd, buffer, strlen(buffer) + 1, 0);

        memset(buffer, 0, sizeof(buffer));
        recv(sockfd, buffer, sizeof(buffer), 0);
        printf("Reversed string from server: %s\n", buffer);
    }

    close(sockfd);
    return 0;
}
