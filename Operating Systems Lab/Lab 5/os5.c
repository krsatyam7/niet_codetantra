#include<stdio.h>
#define max 50
void main(){
	int p[max],bTime[max],su[max],wTime[max],taTime[max],i,k,n,temp;
	float avg_wt,avg_tat;
	printf("Enter the number of processes:");
	scanf("%d",&n);
	for(i=0;i<n;i++){
		p[i]=i;
		printf("Enter the Burst Time of Process %d:",i);
		scanf("%d",&bTime[i]);
		printf("System/User Process (0/1) ?");
		scanf("%d",&su[i]);
	}
	for(i=0;i<n;i++){
		for(k=i+1;k<n;k++){
			if(su[i]>su[k]){
				temp=p[i];
				p[i]=p[k];
				p[k]=temp;
				temp=bTime[i];
				bTime[i]=bTime[k];
				bTime[k]=temp;
				temp=su[i];
				su[i]=su[k];
				su[k]=temp;
			}
		}
	}
	avg_wt=wTime[0]=0;
	avg_tat=taTime[0]=bTime[0];
	for(i=1;i<n;i++){
		wTime[i]=wTime[i-1]+bTime[i-1];
		taTime[i]=taTime[i-1]+bTime[i];
		avg_wt=avg_wt+wTime[i];
		avg_tat=avg_tat+taTime[i];
	}
	printf("PROCESS\t\t SYSTEM/USER PROCESS \tBURST TIME\tWAITING TIME\tTURNAROUND TIME");
	for(i=0;i<n;i++){
		printf("\n%d \t\t %d \t\t %d \t\t %d \t\t %d ",p[i],su[i],bTime[i],wTime[i],taTime[i]);
	}
	printf("\nAverage Waiting Time is --- %f",avg_wt/n);
	printf("\nAverage Turnaround Time is --- %f", avg_tat/n);
}
