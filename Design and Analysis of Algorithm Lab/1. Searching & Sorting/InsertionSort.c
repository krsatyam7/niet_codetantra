#include<stdio.h>
void insertion(int arr[],int n)
{
	for(int i=0;i<n;i++)
	{
		int key=arr[i];
		int j=i-1;
		while((j>=0) && (arr[j]>key))
		{
			arr[j+1]=arr[j];
			j--;
		}
		arr[j+1]=key;
	}
}
int main()
{
	int n;
	printf("Enter size of the array: ");
	scanf("%d",&n);
	int arr[n];
	printf("Enter %d elements in to the array: ",n);
	for(int i=0;i<n;i++)
	{
		scanf("%d",&arr[i]);
	}
	insertion(arr,n);
	printf("After sorting the elements are:");
	for(int i=0;i<n;i++)
	printf(" %d",arr[i]);
	return 0;
}	
