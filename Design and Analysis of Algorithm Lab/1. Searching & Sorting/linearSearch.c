#include<stdio.h>
int ReLS(int arr[],int value,int index,int n)
{
	int pos=0;
	if(index>=n)
	{
		return 0;
	}
	else if(arr[index]==value)
	{
		pos = index+1;
		return pos;
	}
	else
	{
		return ReLS(arr,value,index+1,n);
		
	}
	return pos;
}
int main()
{
	int n ,value,pos,m=0,arr[100];
	printf("enter the no of elements: ");
	scanf("%d",&n);
	printf("Enter %d integer(s)\n",n);
	for(int i=0;i<n;i++)
	{
		scanf("%d",&arr[i]);
	}
	printf("enter the item to be search: ");
	scanf("%d",&value);
	pos = ReLS(arr,value,0,n);
	if (pos!=0)
	{
		printf("item location = %d  item = %d",pos,value);
	}
	else
	{
		printf("no item found");
	}
	return 0;
}
