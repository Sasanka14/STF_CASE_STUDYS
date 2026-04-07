// server.c - UDP Server
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
    char buffer[MAXLINE];
    char *message = "Hello from server";
    int sockfd;
    socklen_t len;
    struct sockaddr_in servaddr, cliaddr;

    // Create UDP socket
    if ((sockfd = socket(AF_INET, SOCK_DGRAM, 0)) < 0) {
        perror("socket creation failed");
        exit(EXIT_FAILURE);
    }

    memset(&servaddr, 0, sizeof(servaddr));
    memset(&cliaddr, 0, sizeof(cliaddr));

    // Server information
    servaddr.sin_family = AF_INET; // IPv4
    servaddr.sin_addr.s_addr = INADDR_ANY;
    servaddr.sin_port = htons(PORT);

    // Bind the socket with the server address
    if (bind(sockfd, (const struct sockaddr *)&servaddr, sizeof(servaddr)) < 0) {
        perror("bind failed");
        close(sockfd);
        exit(EXIT_FAILURE);
    }

    len = sizeof(cliaddr); // length of client address

    // Receive message from client
    int n = recvfrom(sockfd, (char *)buffer, MAXLINE, 0,
                     (struct sockaddr *) &cliaddr, &len);
    buffer[n] = '\0';
    printf("Client : %s\n", buffer);

    // Send message back to client
    sendto(sockfd, (const char *)message, strlen(message), 0,
           (const struct sockaddr *) &cliaddr, len);
    printf("Message sent to client.\n");

    close(sockfd);
    return 0;
}
