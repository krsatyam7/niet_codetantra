#include <stdio.h>
#include <conio.h>
#define max 30
int main()
{
	int n,i,pn[max],at[max],bt[max],wt[max],tat[max],start[max],finish[max];
	float awt=0,atat=0;
	printf("Enter the number of processes: ");
	scanf("%d",&n);
	for(i=0;i<n;i++)
	{
		printf("Enter the Process Name, Arrival Time & Burst Time:");
		scanf("%d%d%d",&pn[i],&at[i],&bt[i]);
	}
	printf("Process Name\tArrival Time\tBurst Time\n");
	for(i=0;i<n;i++)
	{
		printf("    %d\t        %d\t        %d\n",pn[i],at[i],bt[i]);
	}
	printf("PName     Arrtime     Bursttime    Start     WT   TAT   Finish\n");
	start[0]=at[0];
	finish[0]=start[0]+bt[0];
	for(i=0;i<n;i++)
	{
		if(i>0){
			start[i]=finish[i-1];
		}
		finish[i]=start[i]+bt[i];
		wt[i]=start[i]-at[i];
		tat[i]=bt[i]+wt[i];
		if(i==0)
		printf("%d\t  %d\t\t  %d\t  %d\t   %d\t  %d\t  %d\n",pn[i],at[i],bt[i],start[i],wt[i],tat[i],finish[i]);
	}
	for(i=1;i<n;i++)
	{
		printf("%d\t  %d\t\t  %d\t  %d\t  %d\t  %d\t  %d\n",pn[i],at[i],bt[i],start[i],wt[i],tat[i],finish[i]);
	}
for(i=0;i<n;i++)
{
	awt+=wt[i];
	atat+=tat[i];
}
awt=awt/n;
atat=atat/n;
printf("Average Waiting time:%f",awt);
printf("\nAverage Turn Around Time:%f",atat);
return 0;
}
