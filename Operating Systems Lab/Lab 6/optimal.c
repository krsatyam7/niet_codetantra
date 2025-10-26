#include <stdio.h>

int main() {
    int n, frames;

    printf("Enter number of pages: ");
    scanf("%d", &n);

    int pages[n];
    printf("Enter the page reference string: ");
    for (int i = 0; i < n; i++) {
        scanf("%d", &pages[i]);
    }

    printf("Enter number of frames: ");
    scanf("%d", &frames);

    int frame[frames];
    for (int i = 0; i < frames; i++)
        frame[i] = -1;

    int pageFaults = 0;

    for (int i = 0; i < n; i++) {
        int page = pages[i];
        int found = 0;

        // Check if page is already in frame
        for (int j = 0; j < frames; j++) {
            if (frame[j] == page) {
                found = 1;
                break;
            }
        }

        // If not found, replace a page
        if (!found) {
            int replaceIndex = -1;
            int farthest = -1;

            // Find the page to be replaced
            for (int j = 0; j < frames; j++) {
                int k;
                for (k = i + 1; k < n; k++) {
                    if (frame[j] == pages[k])
                        break;
                }
                if (k == n) { // page not used again
                    replaceIndex = j;
                    break;
                }
                if (k > farthest) {
                    farthest = k;
                    replaceIndex = j;
                }
            }

            // Replace or fill if there's empty space
            if (replaceIndex == -1) {
                for (int j = 0; j < frames; j++) {
                    if (frame[j] == -1) {
                        replaceIndex = j;
                        break;
                    }
                }
            }

            frame[replaceIndex] = page;
            pageFaults++;
        }
    }

    printf("Total Page Faults = %d\n", pageFaults);
    return 0;
}
