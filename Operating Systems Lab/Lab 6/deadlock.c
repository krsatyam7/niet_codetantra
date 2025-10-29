#include <stdio.h>

int main() {
    int P, R;
    printf("Enter processes and resources: ");
    scanf("%d %d", &P, &R);

    int allocation[P][R], max[P][R], available[R];
    int need[P][R], finish[P];
    int safeSeq[P], count = 0;

    printf("Enter Allocation matrix:\n");
    for (int i = 0; i < P; i++) {
        for (int j = 0; j < R; j++) {
            scanf("%d", &allocation[i][j]);
        }
        finish[i] = 0;
    }

    printf("Enter Max matrix:\n");
    for (int i = 0; i < P; i++) {
        for (int j = 0; j < R; j++) {
            scanf("%d", &max[i][j]);
            need[i][j] = max[i][j] - allocation[i][j];
        }
    }

    printf("Enter Available vector:\n");
    for (int i = 0; i < R; i++) {
        scanf("%d", &available[i]);
    }

    int changed = 1;
    while (changed) {
        changed = 0;
        for (int i = 0; i < P; i++) {
            if (!finish[i]) {
                int canProceed = 1;
                for (int j = 0; j < R; j++) {
                    if (need[i][j] > available[j]) {
                        canProceed = 0;
                        break;
                    }
                }
                if (canProceed) {
                    for (int j = 0; j < R; j++)
                        available[j] += allocation[i][j];
                    safeSeq[count++] = i;
                    finish[i] = 1;
                    changed = 1;
                }
            }
        }
    }

    int deadlock = 0;
    for (int i = 0; i < P; i++) {
        if (!finish[i]) {
            if (!deadlock) printf("Deadlock: ");
            printf("P%d ", i);
            deadlock = 1;
        }
    }

    if (!deadlock) {
        printf("No deadlock\n");
        printf("Safe sequence: ");
        for (int i = 0; i < count; i++) {
            printf("P%d ", safeSeq[i]);
        }
    }

    printf("\n");
    return 0;
}
