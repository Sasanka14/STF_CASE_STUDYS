#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <unistd.h>
#include <arpa/inet.h>

#define PORT 8080

int main() {
    int sock = 0;
    struct sockaddr_in serv_addr;
    char buffer[1024];
    char expression[100];

    // Create socket
    sock = socket(AF_INET, SOCK_STREAM, 0);
    if (sock < 0) {
        printf("\n Socket creation error \n");
        return -1;
    }

    serv_addr.sin_family = AF_INET;
    serv_addr.sin_port = htons(PORT);

    // Convert IPv4 addresses
    if (inet_pton(AF_INET, "127.0.0.1", &serv_addr.sin_addr) <= 0) {
        printf("\nInvalid address/ Address not supported \n");
        return -1;
    }

    // Connect to server
    if (connect(sock, (struct sockaddr *)&serv_addr, sizeof(serv_addr)) < 0) {
        printf("\nConnection Failed \n");
        return -1;
    }

    while (1) {
        printf("\nEnter arithmetic expression (e.g. 10 + 5) or 'bye' to exit: ");
        fgets(expression, sizeof(expression), stdin);

        // Remove newline
        expression[strcspn(expression, "\n")] = 0;

        // Send to server
        send(sock, expression, strlen(expression), 0);

        // Exit condition
        if (strcmp(expression, "bye") == 0 || strcmp(expression, "stop") == 0) {
            printf("Closing connection...\n");
            break;
        }

        // Receive result
        int valread = read(sock, buffer, sizeof(buffer) - 1);
        buffer[valread] = '\0';
        printf("Server response: %s\n", buffer);
    }

    close(sock);
    return 0;
}
