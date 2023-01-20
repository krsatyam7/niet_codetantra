#include <stdio.h>
#include <conio.h>
int temp;
void heap(int arr[10], int n, int i)
{
	int largest = i;
	int left = 2 * i + 1;
	int right = 2 * i + 2;
	if (left < n && arr[left] > arr[largest])
		largest = left;
		if (right < n && arr[right] > arr[largest])
		largest = right;
		if (largest != i)
		{
			temp = arr[i];
			arr[i] = arr[largest];
			arr[largest] = temp;
		heap(arr, n, largest);
		}
}
void heapsort(int arr[], int n)
{
	int i;
	for (i = n / 2 - 1; i >= 0; i--)
	heap(arr, n, i);
	for (i = n - 1; i >= 0; i--)
	{
		temp = arr[0];
		arr[0] = arr[i];
		arr[i] = temp;
		heap(arr, i, 0);
	}
}
void main()
{
	int i, n, a[10];
	printf("enter the no. of element: ");
	scanf("%d", &n);
	printf("Enter elements: ");
	for (i = 0; i < n; i++)
	{
		scanf("%d", &a[i]);
	}
	heapsort(a, n);
	for (i = 0; i < n; i++)
	{
		printf("%d\t", a[i]);
	}
}
