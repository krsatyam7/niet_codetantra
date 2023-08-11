#include <string.h>
int sumOfHighestAndLowestElements(int arr[], int arrLen) {
    // Write from code here
    int min=arr[0],max=arr[0];
    for(int i=1;i<arrLen;i++){
        if(arr[i]>max)
            max=arr[i];
        if(arr[i]<min)
            min=arr[i];
    }
        return max+min;
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
    printf("%d\n", sumOfHighestAndLowestElements(arr, arrLen));
    return 0;
}
