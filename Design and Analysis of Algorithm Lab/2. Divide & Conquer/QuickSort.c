#include <stdio.h>
#include <conio.h>
void quicksort(int num[100], int first, int last){
	int i, j, pivot, temp;
	if (first < last){
		pivot = first;
		i = first;
		j = last;
		while (i < j){
			while (num[i] <= num[pivot] && i < last)
			i++;
			while (num[j] > num[pivot])
			j--;
			if (i < j){
				temp = num[i];
                num[i] = num[j];
                num[j] = temp;
	        }
		}
		temp = num[pivot];
		num[pivot] = num[j];
		num[j] = temp;
		quicksort(num, first, j - 1);
		quicksort(num, j + 1, last);
	}
}
void main(){
	int n, i, o[100];
	printf("Enter Number of elements : ");
	scanf("%d", &n);
	printf("Enter %d Elements : ", n);
	for (i = 0; i < n; i++){
		scanf("%d", &o[i]);
	}
	quicksort(o, 0, n - 1);
	printf("Sorted Numbers are : ");
	for (i = 0; i < n; i++){
		printf("%d ", o[i]);
	}
	{
		printf("\n");
	}
}
