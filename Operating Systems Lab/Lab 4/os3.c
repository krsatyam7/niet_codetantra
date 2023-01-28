#include<stdio.h>
#include<conio.h>
#include<string.h>
#define max 50
void main(){
	int bTime[max],aTime[max],n,i,j,temp,sTime[max],fTime[max],wTime[max],taTime[max],pr[max];
	int towTime=0,totaTime=0;
	float awTime,ataTime;
	char pName[max][max],t[max];
	printf("Enter the number of process:");
	scanf("%d",&n);
	for(i=0;i<n;i++){
		printf("Enter process name,arrivaltime,execution time & priority:");
		scanf("%s%d%d%d",pName[i],&aTime[i],&bTime[i],&pr[i]);
	}
	for(i=0;i<n;i++){
		if(i == 0){
			sTime[i]=aTime[i];
			wTime[i]=sTime[i]-aTime[i];
			fTime[i]=sTime[i]+bTime[i];
			taTime[i]=fTime[i]-aTime[i];
		}
		else{
			sTime[i]=fTime[i-1];
			wTime[i]=sTime[i]-aTime[i];
			fTime[i]=sTime[i]+bTime[i];
			taTime[i]=fTime[i]-aTime[i];
		}
		towTime+=wTime[i];
		totaTime+=taTime[i];
	}
	awTime=(float)towTime/n;
	ataTime=(float)totaTime/n;
	printf("Pname\tarrivaltime\texecutiontime\tpriority\twaitingtime\ttatime\n");
	for(i=0;i<n;i++){
		printf("%s\t%5d\t\t%5d\t\t%5d\t\t%5d\t\t%5d\n",pName[i],aTime[i],bTime[i],pr[i],wTime[i],taTime[i]);
	}
	printf("Average waiting time is:%f\n",awTime);
	printf("Average turnaroundtime is:%f\n",ataTime);
}
