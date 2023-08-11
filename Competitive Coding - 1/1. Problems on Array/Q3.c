#include <stdio.h>
#include <stdlib.h>
#include <string.h>
int middleElementOfArray(int arr[], int arrLen) {
    // write code from here
     return arrLen%2==0 ? arr[arrLen/2-1] : arr[arrLen/2];
     // ends here
}
int readIntArray(char *argsArray, int arr[]) {
    int col = 0;
    char *token = strtok(argsArray, ",");
    while (token != NULL) {
        arr[col] = atoi(token);
        token = strtok(NULL, ",");
        col++;
    }
    return col;
}
int main(int argc, char *argv[]) {
    int arr[strlen(argv[1])];
    int arrLen = readIntArray(argv[1], arr);
    printf("%d\n", middleElementOfArray(arr, arrLen));
    return 0;
}
