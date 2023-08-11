#include <stdio.h>
#include <stdlib.h>
#include <string.h>
int sumOfArray(int arr[], int arrLen) {
    // write code from here 
    int sum=0;
    for(int i=0;i<arrLen;i++){
        sum=arr[i]+sum;
    }
    return sum;
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
    printf("%d\n", sumOfArray(arr, arrLen));
    return 0;
}
