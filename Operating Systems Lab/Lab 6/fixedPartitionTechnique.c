#include<stdio.h>
#include<conio.h>
int main(){
	int m,p,s,p1;
	int m1[4],i,f,f1=0,f2=0,fra1,fra2,s1,pos;
	printf("Enter the memory size:");
	scanf("%d",&m);
	printf("Enter the no of partitions:");
	scanf("%d",&p);
	s=m/p;
	printf("Each partn size is:%d",s);
	printf("Enter the no of processes:");
	scanf("%d",&p1);
	pos=m;
	for(i=0;i<p1;i++){
		printf("Enter the memory req for process%d:",i+1);
		scanf("%d",&m1[i]);
		if(m1[i]<=s){
			printf("Process is allocated in partition%d\n",i+1);
			fra1=s-m1[i];
			printf("Internal fragmentation for process is:%d\n",fra1);
			f1=f1+fra1;
			pos=pos-s;
		}
		else{
			printf("Process not allocated in partition%d\n",i+1);
			s1=m1[i];
			while(s1>s){
				s1=s1-s;
				pos=pos-s;
			}
			pos=pos-s;
			fra2=s;
			f2=f2+fra2;
			printf("External fragmentation for partition is:%d",fra2);
		}
	}
	printf("Process\tmemory\tallocatedmemory");
	for(i=0;i<p1;i++)
	printf("\n%5d\t%5d\t%5d",i+1,s,m1[i]);
	f=f1+f2;
	printf("\nThe tot no of fragmentation is:%d",f);
}
