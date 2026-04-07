// client.c - UDP Client
#include <stdio.h>
#include <string.h>
#include <stdlib.h>
#include <unistd.h>
#include <arpa/inet.h>
#include <sys/socket.h>
#include <netinet/in.h>

#define PORT 5000
#define MAXLINE 1024

int main() {
    int sockfd;
    char buffer[MAXLINE];
    char *message = "Hello from client";
    struct sockaddr_in servaddr;

    // Create UDP socket
    if ((sockfd = socket(AF_INET, SOCK_DGRAM, 0)) < 0) {
        perror("socket creation failed");
        exit(EXIT_FAILURE);
    }

    memset(&servaddr, 0, sizeof(servaddr));

    // Server information
    servaddr.sin_family = AF_INET;
    servaddr.sin_port = htons(PORT);
    servaddr.sin_addr.s_addr = INADDR_ANY; // server IP address

    // Send message to server
    sendto(sockfd, (const char *)message, strlen(message), 0,
           (const struct sockaddr *) &servaddr, sizeof(servaddr));
    printf("Message sent to server.\n");

    // Receive message from server
    socklen_t len = sizeof(servaddr);
    int n = recvfrom(sockfd, (char *)buffer, MAXLINE, 0,
                     (struct sockaddr *) &servaddr, &len);
    buffer[n] = '\0';
    printf("Server : %s\n", buffer);

    close(sockfd);
    return 0;
}
