#include<stdio.h>
#include<conio.h>
#include<string.h>
#define max 50
void main(){
	int i, n, sum=0,count=0,y,quant,wt=0,tat=0,aTime[max],bTime[max],temp[max],wTime[max],rem_bTime[max],taTime[max];
	float avg_wt,avg_tat;
	printf("Enter Total Number of Processes: ");
	scanf("%d",&n);
	y=n;
	for(i=0;i<n;i++){
		printf("Enter Details of Process[%d]: Arrival Time:\t",i+1);
		scanf("%d",&aTime[i]);
		printf("Burst Time:\t");
		scanf("%d",&bTime[i]);
		temp[i]=bTime[i];
	}
	printf("Enter Time Quantum:\t");
	scanf("%d",&quant);
	printf("Process ID\t\tBurst Time\t Turnaround Time\t Waiting Time\n");
	for(sum=0,i=0;y!=0;){
		if(temp[i]<=quant && temp[i]>0){
			sum = sum+temp[i];
			temp[i]=0;
			count=1;
		}
		else if(temp[i]>0){
			temp[i]=temp[i]-quant;
			sum=sum+quant;
		}
		if(temp[i]==0 && count ==1){
			y--;
			printf("Process[%d]\t\t%d\t\t %d\t\t\t %d\n",i+1,bTime[i],sum-aTime[i],sum-aTime[i]-bTime[i]);
			wt=wt+sum-aTime[i]-bTime[i];
			tat=tat+sum-aTime[i];
			count=0;
		}
		if(i==n-1){
			i=0;
		}
		else if(aTime[i+1]<=sum){
			i++;
		}
		else{
			i=0;
		}
	}
	avg_wt=(float)wt/n;
	avg_tat=(float)tat/n;
	printf("Average Waiting Time:\t%f\n",avg_wt);
	printf("Avg Turnaround Time:\t%f\n",avg_tat);
}
