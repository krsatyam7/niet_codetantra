#include <stdio.h>
#include <stdlib.h>
#include <string.h>
int maxSumContiguousSubArray(int arr[], int arrLen) {
    // write code from here
    int max=0;
    int maxend=0;
    for(int i=0;i<arrLen;i++){
        maxend=maxend+arr[i];
        if(maxend<0){
            maxend=0;
        }
        if(max<maxend){
            max=maxend;
        }
    }
    return max;
    //ends here
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
