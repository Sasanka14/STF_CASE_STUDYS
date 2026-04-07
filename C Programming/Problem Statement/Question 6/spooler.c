#include <stdio.h>
#include <stdlib.h>
#include <pthread.h>
#include <semaphore.h>
#include <unistd.h>
#include <fcntl.h>
#include <sys/stat.h>

#define MAX_JOBS 5      // Queue size
#define USERS 3         // Number of users
#define JOBS_PER_USER 2 // Jobs per user

int jobQueue[MAX_JOBS], front = 0, rear = 0;
pthread_mutex_t mutex;
sem_t *emptySlots, *fullSlots;

void *userProcess(void *arg) {
    int userId = *((int *)arg);
    for (int i = 1; i <= JOBS_PER_USER; i++) {
        int jobId = (userId * 100) + i;

        sem_wait(emptySlots);
        pthread_mutex_lock(&mutex);

        jobQueue[rear] = jobId;
        rear = (rear + 1) % MAX_JOBS;
        printf("User %d submitted Job %d\n", userId, jobId);

        pthread_mutex_unlock(&mutex);
        sem_post(fullSlots);

        sleep(1); // delay between jobs
    }
    return NULL;
}

void *printerProcess(void *arg) {
    while (1) {
        sem_wait(fullSlots);
        pthread_mutex_lock(&mutex);

        int jobId = jobQueue[front];
        front = (front + 1) % MAX_JOBS;
        pthread_mutex_unlock(&mutex);
        sem_post(emptySlots);

        printf("Printer started Job %d\n", jobId);
        sleep(1); // simulate printing
        printf("Printer completed Job %d\n", jobId);
    }
}

int main() {
    pthread_t users[USERS], printer;
    int userIds[USERS];

    pthread_mutex_init(&mutex, NULL);
    sem_unlink("/emptySlots"); sem_unlink("/fullSlots");
    emptySlots = sem_open("/emptySlots", O_CREAT, 0644, MAX_JOBS);
    fullSlots  = sem_open("/fullSlots", O_CREAT, 0644, 0);

    pthread_create(&printer, NULL, printerProcess, NULL);

    for (int i = 0; i < USERS; i++) {
        userIds[i] = i + 1;
        pthread_create(&users[i], NULL, userProcess, &userIds[i]);
    }
    for (int i = 0; i < USERS; i++) pthread_join(users[i], NULL);

    sleep(5); // let printer finish
    sem_close(emptySlots); sem_close(fullSlots);
    sem_unlink("/emptySlots"); sem_unlink("/fullSlots");

    printf("\n✅ Simulation finished.\n");
    return 0;
}
