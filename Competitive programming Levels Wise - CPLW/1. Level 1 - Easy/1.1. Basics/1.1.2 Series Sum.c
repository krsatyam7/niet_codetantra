#include <stdio.h>
#include <stdlib.h>
#include <string.h>
float geometricSum(int k) {
    if (k == 0) {
        return 1.0;
    }
    return 1.0 / pow(2, k) + geometricSum(k - 1);
}
int main(int argc, char *argv[]) {
    int k = atoi(argv[1]);
    printf("%1.6e\n", geometricSum(k));
    return 0;
}
