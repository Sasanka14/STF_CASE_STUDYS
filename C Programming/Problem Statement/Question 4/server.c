#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <unistd.h>
#include <arpa/inet.h>

#define PORT 8080

int main() {
    int server_fd, new_socket;
    struct sockaddr_in address;
    int addrlen = sizeof(address);
    char buffer[1024];
    char result[1024];

    // Create socket
    server_fd = socket(AF_INET, SOCK_STREAM, 0);
    if (server_fd == 0) {
        perror("Socket failed");
        exit(EXIT_FAILURE);
    }

    // Define address
    address.sin_family = AF_INET;
    address.sin_addr.s_addr = INADDR_ANY; 
    address.sin_port = htons(PORT);

    // Bind socket
    if (bind(server_fd, (struct sockaddr *)&address, sizeof(address)) < 0) {
        perror("Bind failed");
        exit(EXIT_FAILURE);
    }

    // Listen for client
    if (listen(server_fd, 3) < 0) {
        perror("Listen");
        exit(EXIT_FAILURE);
    }
    printf("Server is listening on port %d...\n", PORT);

    // Accept connection
    new_socket = accept(server_fd, (struct sockaddr *)&address, (socklen_t*)&addrlen);
    if (new_socket < 0) {
        perror("Accept");
        exit(EXIT_FAILURE);
    }

    while (1) {
        memset(buffer, 0, sizeof(buffer));
        memset(result, 0, sizeof(result));

        int valread = read(new_socket, buffer, sizeof(buffer) - 1);
        if (valread <= 0) break; // client disconnected
        buffer[valread] = '\0';

        // Exit condition
        if (strcmp(buffer, "bye") == 0 || strcmp(buffer, "stop") == 0) {
            printf("Client requested to close connection.\n");
            break;
        }

        printf("Received expression: %s\n", buffer);

        int a, b, res = 0;
        char op;

        if (sscanf(buffer, "%d %c %d", &a, &op, &b) == 3) {
            switch (op) {
                case '+': res = a + b; break;
                case '-': res = a - b; break;
                case '*': res = a * b; break;
                case '/': 
                    if (b != 0) res = a / b;
                    else sprintf(result, "Error: Division by zero");
                    break;
                default: sprintf(result, "Invalid operator");
            }

            if (strlen(result) == 0) {
                sprintf(result, "Result = %d", res);
            }
        } else {
            sprintf(result, "Invalid input format. Use: <num1> <op> <num2>");
        }

        send(new_socket, result, strlen(result), 0);
        printf("Sent back: %s\n", result);
    }

    close(new_socket);
    close(server_fd);
    return 0;
}
