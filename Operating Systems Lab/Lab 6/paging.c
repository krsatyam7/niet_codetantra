#include <stdio.h>
#define LOGICAL_SPACE 1024
#define PAGE_SIZE 128
#define NUM_PAGES 8
#define NUM_FRAMES 8

int main() {
    int pageTable[NUM_PAGES] = {3, 5, 1, 7, 2, 6, 0, 4};
    int logicalAddress;

    printf("Logical Address Space = 1024 bytes\n");
    printf("Page Size = 128 bytes\n");
    printf("Number of Pages = 8\n");
    printf("Number of Frames = 8\n");
    printf("Page Table:\n");
    for (int i = 0; i < NUM_PAGES; i++)
        printf("Page %d -> Frame %d\n", i, pageTable[i]);
    printf("Enter a logical address (0 - 1023): ");
    scanf("%d", &logicalAddress);

    if (logicalAddress < 0 || logicalAddress >= LOGICAL_SPACE) {
        printf("Invalid logical address\n");
        return 0;
    }

    int pageNum = logicalAddress / PAGE_SIZE;
    int offset = logicalAddress % PAGE_SIZE;
    int frameNum = pageTable[pageNum];
    int physicalAddress = frameNum * PAGE_SIZE + offset;

    printf("Logical Address %d is in:\n", logicalAddress);
    printf("Page Number = %d\n", pageNum);
    printf("Offset = %d\n", offset);
    printf("Frame Number from Page Table = %d\n", frameNum);
    printf("Physical Address = (Frame %d * 128) + %d = %d\n", frameNum, offset, physicalAddress);

    return 0;
}
