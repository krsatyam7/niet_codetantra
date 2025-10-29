#include <stdio.h>
#include <stdlib.h>

#define MAX_BLOCKS 100

int blocks[MAX_BLOCKS] = {0}; // 0 = free, 1 = allocated

void sequential_allocation(int file_size) {
    int start = -1, count = 0;

    for (int i = 0; i < MAX_BLOCKS; i++) {
        if (blocks[i] == 0) {
            count++;
            if (count == 1) start = i;
            if (count == file_size) {
                printf("Sequential Allocation:\n");
                printf("File blocks: ");
                for (int j = start; j < start + file_size; j++) {
                    blocks[j] = 1;
                    printf("%d ", j);
                }
                printf("\n");
                return;
            }
        } else {
            count = 0;
            start = -1;
        }
    }

    printf("Sequential Allocation Failed: Not enough contiguous space\n");
}

void indexed_allocation(int file_size) {
    int index_block;
    printf("Enter index block (0-99): ");
    if (scanf("%d", &index_block) != 1) {
        printf("Invalid index block\n");
        return;
    }
    if (index_block < 0 || index_block >= MAX_BLOCKS) {
        printf("Invalid index block\n");
        return;
    }
    if (blocks[index_block] == 1) {
        printf("Indexed Allocation Failed: Index block already in use\n");
        return;
    }

    int free_blocks = 0;
    for (int i = 0; i < MAX_BLOCKS; i++)
        if (blocks[i] == 0 && i != index_block)
            free_blocks++;

    if (free_blocks < file_size) {
        printf("Indexed Allocation Failed: Not enough space\n");
        return;
    }

    printf("Indexed Allocation:\n");
    printf("Index Block: %d\n", index_block);
    printf("File Blocks: ");
    blocks[index_block] = 1;
    int allocated = 0;
    for (int i = 0; i < MAX_BLOCKS && allocated < file_size; i++) {
        if (blocks[i] == 0 && i != index_block) {
            blocks[i] = 1;
            printf("%d ", i);
            allocated++;
        }
    }
    printf("\n");
}

void linked_allocation(int file_size) {
    int free_blocks = 0;
    for (int i = 0; i < MAX_BLOCKS; i++)
        if (blocks[i] == 0) free_blocks++;

    if (free_blocks < file_size) {
        printf("Linked Allocation Failed: Not enough space\n");
        return;
    }

    printf("Linked Allocation:\n");
    printf("File blocks (linked list): ");
    int allocated = 0;
    int first = 1;
    for (int i = 0; i < MAX_BLOCKS && allocated < file_size; i++) {
        if (blocks[i] == 0) {
            blocks[i] = 1;
            if (!first) printf("-> ");
            printf("%d ", i);
            first = 0;
            allocated++;
        }
    }
    printf("-> NULL\n");
}

int main() {
    int choice, file_size;

    while (1) {
        printf("File Allocation Strategies Simulation\n");
        printf("1. Sequential Allocation\n");
        printf("2. Indexed Allocation\n");
        printf("3. Linked Allocation\n");
        printf("4. Exit\n");
        printf("Enter your choice: ");
        if (scanf("%d", &choice) != 1) {
            printf("Invalid input\n");
            while (getchar() != '\n'); // clear invalid input
            continue;
        }

        if (choice == 4)
            break;

        switch (choice) {
            case 1:
                printf("Enter file size (in blocks): ");
                if (scanf("%d", &file_size) != 1) {
                    printf("Invalid file size\n");
                    while (getchar() != '\n');
                    continue;
                }
                if (file_size <= 0 || file_size > 100) {
                    printf("Invalid file size\n");
                    continue;
                }
                sequential_allocation(file_size);
                break;

            case 2:
                printf("Enter file size (in blocks): ");
                if (scanf("%d", &file_size) != 1) {
                    printf("Invalid file size\n");
                    while (getchar() != '\n');
                    continue;
                }
                if (file_size <= 0 || file_size > 100) {
                    printf("Invalid file size\n");
                    continue;
                }
                indexed_allocation(file_size);
                break;

            case 3:
                printf("Enter file size (in blocks): ");
                if (scanf("%d", &file_size) != 1) {
                    printf("Invalid file size\n");
                    while (getchar() != '\n');
                    continue;
                }
                if (file_size <= 0 || file_size > 100) {
                    printf("Invalid file size\n");
                    continue;
                }
                linked_allocation(file_size);
                break;

            default:
                printf("Invalid input\n");
        }
    }

    return 0;
}
