#include <stdio.h>
#include <stdlib.h>

int main() {
    int n, i, j, head, direction;
    printf("Enter the number of disk requests: ");
    scanf("%d", &n);

    int requests[n];
    printf("Enter the disk requests (in track numbers):\n");
    for (i = 0; i < n; i++)
        scanf("%d", &requests[i]);

    printf("Enter the initial head position: ");
    scanf("%d", &head);

    printf("Enter the direction (1 for right, 0 for left): ");
    scanf("%d", &direction);

    // Sort the requests in ascending order
    for (i = 0; i < n - 1; i++) {
        for (j = 0; j < n - i - 1; j++) {
            if (requests[j] > requests[j + 1]) {
                int temp = requests[j];
                requests[j] = requests[j + 1];
                requests[j + 1] = temp;
            }
        }
    }

    int seek_time = 0, index = 0;

    // Find the location of head in the sorted list
    for (i = 0; i < n; i++) {
        if (head < requests[i]) {
            index = i;
            break;
        }
    }

    printf("Seek sequence:\n");
    printf("%d -> ", head);

    // Move in the specified direction first
    if (direction == 1) { // moving right
        for (i = index; i < n; i++) {
            seek_time += abs(head - requests[i]);
            head = requests[i];
            printf("%d -> ", head);
        }
        for (i = index - 1; i >= 0; i--) {
            seek_time += abs(head - requests[i]);
            head = requests[i];
            printf("%d -> ", head);
        }
    } else { // moving left
        for (i = index - 1; i >= 0; i--) {
            seek_time += abs(head - requests[i]);
            head = requests[i];
            printf("%d -> ", head);
        }
        for (i = index; i < n; i++) {
            seek_time += abs(head - requests[i]);
            head = requests[i];
            printf("%d -> ", head);
        }
    }

    printf("End\n");
    printf("Total seek time: %d\n", seek_time);

    return 0;
}
