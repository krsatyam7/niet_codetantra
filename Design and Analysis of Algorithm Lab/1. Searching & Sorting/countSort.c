#include<stdio.h>
void main(){
	int i,n,temp;
	int arr[100],s[1000],d[100];
	printf("enter the no. of arry element: ");
	scanf("%d",&n);
	printf("enter the element: ");
	for(int i=0;i<n;i++){
		scanf("%d",&arr[i]);
	}
	for(i=0;i<n;i++){
		s[arr[i]]++;
	}
	
	for(i=1;i<1000;i++){
		s[i]=s[i]+s[i-1];
	}
	for(i=0;i<n;i++){
		temp=s[arr[i]];
		d[temp-1]=arr[i];
		s[arr[i]]--;
	}
	for(int i=0;i<n;i++){
		printf("%d ",d[i]);
	}
	printf("\n");
	
}
