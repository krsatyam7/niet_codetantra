#include<stdio.h>
#include<conio.h>
int main(){
	int m=0,m1=0,m2=0,p,count=0,i;
	printf("enter the memory capacity:");
	scanf("%d",&m);
	printf("enter the no of processes:");
	scanf("%d",&p);
	for(i=0;i<p;i++){
		printf("enter memory req for process%d:",i+1);
		scanf("%d",&m1);
		count=count+m1;
		if(count==m)
		printf("there is no further memory remaining:\n");
		else if(m1<m){
			printf("the memory allocated for process%d is: %d ",i+1,m);
			m2=m-m1;
			printf("\nremaining memory is: %d\n",m2);
			m=m2;
		}
		else{
			printf("memory is not allocated for process%d",i+1);
		}
		printf("external fragmentation for this process is:%d\n",m2);
	}
	return 0;
}
