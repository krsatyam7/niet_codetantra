#include<stdio.h>
#include<conio.h>
void merge(int arr[],int l,int m,int r){
	int i,j,k;
	int n1=m-l+1;
	int n2=r-m;
	int L[n1],R[n2];
	for(i=0;i<n1;i++)
	L[i]=arr[l+i];
	for(j=0;j<n2;j++)
	R[j]=arr[m+1+j];
	i=0;
	j=0;
	k=l;
	while(i<n1 && j<n2){
		if(L[i]<R[j]){
			arr[k]=L[i];
			i++;
		}
		else{
			arr[k]=R[j];
			j++;
		}
		k++;
	}
	while(i<n1){
		arr[k]=L[i];
		i++;
		k++;
	}
	while(j<n2){
		arr[k]=R[j];
		j++;
		k++;
	}
}
void merge_sort(int arr[],int l,int r)
{
	if(l<r){
		int m=(l+r)/2;
		merge_sort(arr,l,m);
		merge_sort(arr,m+1,r);
		merge(arr,l,m,r);
	}
}
void main(){
	int n,i,a[100];
	printf(" Enter How many Numbers : ");
	scanf("%d",&n);
	printf(" Enter %d Numbers :",n);
	for(i=0;i<n;i++){
		
		scanf("%d",&a[i]);
		
	}
	merge_sort(a,0,n-1);
	printf(" Sorted Numbers are : ");
	for(i=0;i<n;i++)
	{
		
		printf("%d\t",a[i]); 
		
	}
}
