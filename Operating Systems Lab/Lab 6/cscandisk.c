#include <stdio.h>
#include <stdlib.h>

int cmpfunc(const void *a, const void *b) {
    return (*(int*)a - *(int*)b);
}

int main() {
    int n, i, head, disk_size, totalSeek = 0;
    int requests[100], left[100], right[100];
    int leftCount = 0, rightCount = 0;

    printf("Enter number of disk requests: ");
    scanf("%d", &n);

    printf("Enter the disk requests (space separated): ");
    for (i = 0; i < n; i++)
        scanf("%d", &requests[i]);

    printf("Enter initial head position: ");
    scanf("%d", &head);

    printf("Enter disk size (max cylinder number): ");
    scanf("%d", &disk_size);

    // Disk heads move only in right direction as per sample, then jump to end, then jump to start, then left requests
    for (i = 0; i < n; i++) {
        if (requests[i] >= head)
            right[rightCount++] = requests[i];
        else
            left[leftCount++] = requests[i];
    }

    qsort(left, leftCount, sizeof(int), cmpfunc);
    qsort(right, rightCount, sizeof(int), cmpfunc);

    // Print Seek Sequence
    printf("Seek Sequence: %d", head);

    // Move right
    for (i = 0; i < rightCount; i++) {
        printf(" -> %d", right[i]);
        totalSeek += abs(head - right[i]);
        head = right[i];
    }

    // Jump to disk end
    if (head != disk_size) {
        printf(" -> %d (Jump to end)", disk_size);
        totalSeek += abs(head - disk_size);
        head = disk_size;
    }

    // Jump to disk start
    if (head != 0) {
        printf(" -> 0 (Jump to start)");
        totalSeek += head;
        head = 0;
    }

    // Move left
    for (i = 0; i < leftCount; i++) {
        printf(" -> %d", left[i]);
        totalSeek += abs(head - left[i]);
        head = left[i];
    }
    printf("\n");
    printf("Total Seek Operations: %d\n", totalSeek);
    return 0;
}
