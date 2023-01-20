#include<stdio.h>
void selection(int arr[],int n)
{
	for(int i=0;i<n;i++)
	{
		for(int j=i+1;j<n;j++)
		{
			if(arr[i]>arr[j])
			{
				arr[i]=arr[i]^arr[j];
				arr[j]=arr[i]^arr[j];
				arr[i]=arr[i]^arr[j];
			}
		}
	}
}
int main()
{
	int n;
	printf("Enter size of the array : ");
	scanf("%d",&n);
	int arr[n];
	printf("Enter the elements :");
	for(int i=0;i<n;i++)
	{
		scanf("%d",&arr[i]);
		
	}
	selection(arr,n);
	printf("The sorted elements are : ");
	for(int i=0;i<n;i++)
	printf("%d\t",arr[i]);
	return 0;
}
