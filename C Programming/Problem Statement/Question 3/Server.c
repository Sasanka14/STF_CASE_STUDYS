#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <unistd.h>
#include <arpa/inet.h>
#include <signal.h>

#define PORT 8080
#define MAX 1024

// Function to reverse a string
void reverseString(char *str) {
    int n = strlen(str);
    for (int i = 0; i < n/2; i++) {
        char temp = str[i];
        str[i] = str[n - i - 1];
        str[n - i - 1] = temp;
    }
}

// To prevent zombie processes
void handle_sigchld(int sig) {
    while (waitpid(-1, NULL, WNOHANG) > 0);
}

int main() {
    int sockfd, new_sock;
    struct sockaddr_in serverAddr, clientAddr;
    socklen_t addr_size;
    char buffer[MAX];

    signal(SIGCHLD, handle_sigchld); // handle child termination

    // 1. Create TCP socket
    sockfd = socket(AF_INET, SOCK_STREAM, 0);
    if (sockfd < 0) {
        perror("Socket creation failed");
        exit(1);
    }

    // 2. Bind socket
    serverAddr.sin_family = AF_INET;
    serverAddr.sin_port = htons(PORT);
    serverAddr.sin_addr.s_addr = INADDR_ANY;

    if (bind(sockfd, (struct sockaddr*)&serverAddr, sizeof(serverAddr)) < 0) {
        perror("Bind failed");
        exit(1);
    }

    // 3. Listen for connections
    if (listen(sockfd, 5) < 0) {
        perror("Listen failed");
        exit(1);
    }

    printf("Server listening on port %d...\n", PORT);

    while (1) {
        addr_size = sizeof(clientAddr);
        new_sock = accept(sockfd, (struct sockaddr*)&clientAddr, &addr_size);
        if (new_sock < 0) {
            perror("Accept failed");
            continue;
        }

        printf("Client connected.\n");

        // Fork a child to handle client
        if (fork() == 0) {
            close(sockfd); // child doesn't need listening socket

            while (1) {
                memset(buffer, 0, sizeof(buffer));
                int n = recv(new_sock, buffer, sizeof(buffer), 0);
                if (n <= 0) {
                    printf("Client disconnected.\n");
                    break;
                }

                printf("Received: %s\n", buffer);
                reverseString(buffer);
                send(new_sock, buffer, strlen(buffer) + 1, 0);
                printf("Reversed string sent.\n");
            }

            close(new_sock);
            exit(0);
        } else {
            close(new_sock); // parent closes this socket, handles others
        }
    }

    close(sockfd);
    return 0;
}
