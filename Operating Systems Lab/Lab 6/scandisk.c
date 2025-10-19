#include <stdio.h>
#include <stdlib.h>
#include <string.h>

int cmpfunc(const void *a, const void *b) {
    return (*(int*)a - *(int*)b);
}

int main() {
    int n, i, head, totalSeek = 0, disk_size = 199;
    char direction[10];
    int requests[20], left[20], right[20], seekSequence[40];
    int leftCount = 0, rightCount = 0, idx = 0;

    printf("Enter number of disk requests (max 20): ");
    scanf("%d", &n);

    printf("Enter the disk requests (space separated): ");
    for (i = 0; i < n; i++)
        scanf("%d", &requests[i]);

    printf("Enter initial head position (0-199): ");
    scanf("%d", &head);

    printf("Enter direction (left/right): ");
    scanf("%s", direction);

    // Fill left and right arrays
    for (i = 0; i < n; i++) {
        if (requests[i] < head)
            left[leftCount++] = requests[i];
        else
            right[rightCount++] = requests[i];
    }

    // Sort the left in descending and the right in ascending
    qsort(left, leftCount, sizeof(int), cmpfunc);
    qsort(right, rightCount, sizeof(int), cmpfunc);

    // SCAN algorithm
    if (strcmp(direction, "left") == 0) {
        // service left requests
        for (i = leftCount - 1; i >= 0; i--) {
            seekSequence[idx++] = left[i];
            totalSeek += abs(head - left[i]);
            head = left[i];
        }
        // Move head to 0
        if (head != 0) {
            totalSeek += abs(head - 0);
            head = 0;
            seekSequence[idx++] = 0;
        }
        // service right requests
        for (i = 0; i < rightCount; i++) {
            if (right[i] == 0) continue; // already serviced at 0
            seekSequence[idx++] = right[i];
            totalSeek += abs(head - right[i]);
            head = right[i];
        }
    } else {
        // service right requests
        for (i = 0; i < rightCount; i++) {
            seekSequence[idx++] = right[i];
            totalSeek += abs(head - right[i]);
            head = right[i];
        }
        // Move head to disk end (199)
        if (head != disk_size) {
            totalSeek += abs(head - disk_size);
            head = disk_size;
            seekSequence[idx++] = disk_size;
        }
        // service left requests
        for (i = leftCount - 1; i >= 0; i--) {
            if (left[i] == disk_size) continue; // already serviced at end
            seekSequence[idx++] = left[i];
            totalSeek += abs(head - left[i]);
            head = left[i];
        }
    }

    printf("Total Seek Operations: %d\n", totalSeek);
    printf("Seek Sequence: ");
    for (i = 0; i < idx; i++)
        printf("%d ", seekSequence[i]);
    printf("\n");
    return 0;
}
