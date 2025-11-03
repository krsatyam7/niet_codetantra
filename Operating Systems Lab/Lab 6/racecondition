#include <stdio.h>

int main() {
    int inc1, inc2;
    int counter = 0;

    printf("Enter how many times Process 1 should increment the counter: ");
    scanf("%d", &inc1);
    printf("Enter how many times Process 2 should increment the counter: ");
    scanf("%d", &inc2);

    int expected = inc1 + inc2;

    // Simulate Process 1
    for (int i = 0; i < inc1; i++) {
        counter++;
    }

    // Simulate Process 2
    for (int i = 0; i < inc2; i++) {
        counter++;
    }

    printf("Final counter value (expected: %d): %d\n", expected, counter);
    
    return 0;
}
