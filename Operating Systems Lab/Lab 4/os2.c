#include<stdio.h>
#include<conio.h>
#include<string.h>
#define max 50
void main(){
	int bTime[max],aTime[max],n,i,j,temp,sTime[max],fTime[max],wTime[max],taTime[max];
	int totwTime=0, tottaTime=0;
	float awTime,ataTime;
	char pName[max][max],t[max];
	printf("Enter the number of process:");
	scanf("%d",&n);
	for(i=0;i<n;i++){
		printf("Enter process name, arrival time & execution time:");
		scanf("%s%d%d",pName[i],&aTime[i],&bTime[i]);
	}
	for(i=0;i<n;i++){
		for(j=0;j<n;j++){
			if(bTime[i]<bTime[j]){
				temp=aTime[i];
				aTime[i]=aTime[j];
				aTime[j]=temp;
				temp=bTime[i];
				bTime[i]=bTime[j];
				bTime[j]=temp;
				strcpy(t,pName[i]);
				strcpy(pName[i],pName[j]);
				strcpy(pName[j],t);
			}
		}
	}
	for(i=0;i<n;i++){
		if(i==0){
			sTime[i]=aTime[i];
		}
		else{
			sTime[i]=fTime[i-1];
		}
	wTime[i]=sTime[i]-aTime[i];
	fTime[i]=sTime[i]+bTime[i];
	taTime[i]=fTime[i]-aTime[i];
	totwTime+=wTime[i];
	tottaTime+=taTime[i];
	}
	awTime=(float)totwTime/n;
	ataTime=(float)tottaTime/n;
	printf("Pname\tarrivaltime\texecutiontime\twaitingtime\ttatime\n");
	for(i=0;i<n;i++){
		printf("%s\t%5d\t\t%5d\t\t%5d\t\t%5d\n",pName[i],aTime[i],bTime[i],wTime[i],taTime[i]);
	}
	printf("Average waiting time is:%f\n",awTime);
	printf("Average turnaroundtime is:%f\n",ataTime);
}
