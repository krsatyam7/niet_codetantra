#include <stdio.h>

#define N 5

enum { THINKING, HUNGRY, EATING } state[N];
int chopstick[N] = {0, 0, 0, 0, 0};

void printStates() {
    printf("States:\n");
    for (int i = 0; i < N; i++) {
        printf("Philosopher %d: ", i);
        if (state[i] == THINKING) printf("Thinking\n");
        else if (state[i] == HUNGRY) printf("Hungry\n");
        else printf("Eating\n");
    }
    printf("Chopsticks:\n");
    for (int i = 0; i < N; i++)
        printf("Chopstick %d: %s\n", i, chopstick[i] ? "Taken" : "Free");
}

void pickup(int phil) {
    printf("Philosopher %d is now hungry\n", phil);

    if (state[(phil + N - 1) % N] != EATING && state[(phil + 1) % N] != EATING && chopstick[phil] == 0 && chopstick[(phil + 1) % N] == 0) {
        state[phil] = EATING;
        chopstick[phil] = chopstick[(phil + 1) % N] = 1;
        printf("Philosopher %d starts eating\n", phil);
    } else {
        state[phil] = HUNGRY;
        printf("Philosopher %d cannot eat now\n", phil);
    }
    printStates();
}

void putdown(int phil) {
    if (state[phil] != EATING) {
        printf("Philosopher %d is not eating, cannot put down chopsticks\n", phil);
    } else {
        state[phil] = THINKING;
        chopstick[phil] = chopstick[(phil + 1) % N] = 0;
        printf("Philosopher %d stops eating and starts thinking\n", phil);
    }
    printStates();
}

int main() {
    int choice, phil;
    for (int i = 0; i < N; i++)
        state[i] = THINKING;

    printf("Choices:\n1. Philosopher hungry\n2. Philosopher puts down chopsticks\n3. Exit\n");
    while (1) {
        printf("Enter choice: ");
        scanf("%d", &choice);
        if (choice == 3)
            break;
        if (choice == 1) {
            printf("Which philosopher (0-%d) is hungry: ", N - 1);
            scanf("%d", &phil);
            if (phil < 0 || phil >= N) { printf("Invalid philosopher number\n"); continue; }
            pickup(phil);
        } else if (choice == 2) {
            printf("Which philosopher (0-%d) puts down chopsticks: ", N - 1);
            scanf("%d", &phil);
            if (phil < 0 || phil >= N) { printf("Invalid philosopher number\n"); continue; }
            putdown(phil);
        } else {
            printf("Invalid choice\n");
        }
    }
    return 0;
}
