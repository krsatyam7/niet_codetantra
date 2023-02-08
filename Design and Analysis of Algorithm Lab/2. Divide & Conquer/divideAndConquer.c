#include<stdio.h>
#include<conio.h>
void main (){
	  int arr[10], n, i, max, min;
	  printf ("Enter the total number of Elements : ");
	  scanf ("%d", &n);
	  printf ("Enter the numbers : ");
	  for (i = 0; i < n; i++){
	  	scanf ("%d", &arr[i]);
	  }
	  max = min = arr[0];
	  for (i = 0; i < n; i++){
	  	if (arr[i] > max){
	  		max = arr[i];
	  	}
	  	if (arr[i] < min)
	  	{
	  		min = arr[i];
	  	}
	  }
	printf ("Minimum element in an array : %d", min);
	printf ("\nMaximum element in an array : %d\n", max);
}
