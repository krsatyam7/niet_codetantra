#include<stdio.h>
int binary(int arr[],int k,int low,int high)
{
	if(low<=high)
	{
		int mid=(low+high)/2;
		if(arr[mid]==k)
		{
			return mid;
		}
		else if(arr[mid]<k)
		{
			return binary(arr,k, mid+1,high);
		}
		return binary(arr,k,low,mid-1);
	}
	return-1;
}
int main()
{
	int n,k;
	printf("Enter number of elements: ");
	scanf("%d",&n);
	printf("Enter the sorted array: ");
	int arr[n];
	for(int i=0;i<n;i++)
	{
		scanf("%d",&arr[i]);
	}
	printf("enter the item to be search: ");
	scanf("%d",&k);
	int a=binary(arr,k,0,n-1);
	if(a==-1)
	{
		printf("item not present");
	}
	else
	{
		printf("item present");
	}
	return 0;
}
