#include <stdio.h>

int main() {
    int n, pages[1000], frames;
    int frameSet[100], used[100], pageFaults = 0, time = 0;
    int i, j, k, found, minIdx, minTime;

    printf("Enter number of pages: ");
    scanf("%d", &n);
    printf("Enter the page reference string: ");
    for (i = 0; i < n; i++)
        scanf("%d", &pages[i]);
    printf("Enter number of frames: ");
    scanf("%d", &frames);

    for (i = 0; i < frames; i++) {
        frameSet[i] = -1;
        used[i] = 0;
    }

    for (i = 0; i < n; i++) {
        found = 0;
        for (j = 0; j < frames; j++) {
            if (frameSet[j] == pages[i]) {
                found = 1;
                used[j] = time++;
                break;
            }
        }
        if (!found) {
            pageFaults++;
            for (j = 0; j < frames; j++) {
                if (frameSet[j] == -1) {
                    frameSet[j] = pages[i];
                    used[j] = time++;
                    break;
                }
            }
            if (j == frames) {
                minTime = used[0];
                minIdx = 0;
                for (k = 1; k < frames; k++) {
                    if (used[k] < minTime) {
                        minTime = used[k];
                        minIdx = k;
                    }
                }
                frameSet[minIdx] = pages[i];
                used[minIdx] = time++;
            }
        }
    }
    printf("Total Page Faults = %d\n", pageFaults);
    return 0;
}
