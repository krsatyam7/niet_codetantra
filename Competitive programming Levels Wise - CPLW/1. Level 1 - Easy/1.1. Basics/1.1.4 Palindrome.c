#include <stdio.h>
#include <stdlib.h>
#include <string.h>
int isPalindrome(long n) {
    long original = n;
    long reversed = 0;
    while (n > 0) {
        reversed = reversed * 10 + n % 10;
        n /= 10;
    }
    return (original == reversed) ? 1 : 0;
}

int main(int argc, char *argv[]) {
    long n = atol(argv[1]);
    printf(isPalindrome(n) ? "true\n" : "false\n");
    return 0;
}
