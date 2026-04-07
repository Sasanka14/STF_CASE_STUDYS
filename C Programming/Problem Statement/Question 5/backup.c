#include <stdio.h>
#include <stdlib.h>
#include <fcntl.h>
#include <unistd.h>
#include <sys/stat.h>

#define BUFFER_SIZE 4096   // Larger buffer for efficiency

// Function to display copy progress
void showProgress(off_t copied, off_t total) {
    if (total > 0) {
        int percent = (int)((copied * 100) / total);
        printf("\rProgress: %d%%", percent);
        fflush(stdout);
    }
}

int main(int argc, char *argv[]) {
    int inputFd, backupFd;
    ssize_t bytesRead, bytesWritten;
    char buffer[BUFFER_SIZE];
    struct stat fileStat;
    off_t totalSize, copiedSize = 0;

    // Check arguments
    if (argc != 3) {
        fprintf(stderr, "Usage: %s <input_file> <backup_file>\n", argv[0]);
        exit(1);
    }

    // Open input file in read-only mode
    inputFd = open(argv[1], O_RDONLY);
    if (inputFd < 0) {
        perror("Error opening input file");
        exit(1);
    }

    // Get file size
    if (fstat(inputFd, &fileStat) == -1) {
        perror("Error getting file info");
        close(inputFd);
        exit(1);
    }
    totalSize = fileStat.st_size;

    // Create backup file (overwrite if exists)
    backupFd = open(argv[2], O_WRONLY | O_CREAT | O_TRUNC, 0644);
    if (backupFd < 0) {
        perror("Error creating backup file");
        close(inputFd);
        exit(1);
    }

    printf("Creating backup...\n");

    // Copy data in chunks
    while ((bytesRead = read(inputFd, buffer, BUFFER_SIZE)) > 0) {
        bytesWritten = write(backupFd, buffer, bytesRead);
        if (bytesWritten != bytesRead) {
            perror("Error writing to backup file");
            close(inputFd);
            close(backupFd);
            exit(1);
        }
        copiedSize += bytesRead;
        showProgress(copiedSize, totalSize);
    }

    if (bytesRead < 0) {
        perror("Error reading input file");
    }

    // Close files
    close(inputFd);
    close(backupFd);

    printf("\nBackup created successfully!\n");
    printf("Original file size: %lld bytes\n", (long long) totalSize);
    printf("Backup file: %s\n", argv[2]);

    return 0;
}
