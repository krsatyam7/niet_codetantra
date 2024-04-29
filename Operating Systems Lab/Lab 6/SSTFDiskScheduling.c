#include<stdio.h>
#include<conio.h>
#include<limits.h>
int main(){
    int n, h;
    printf("Enter the number of Requests: ");
    scanf("%d",&n);
    int *r=(int *)malloc(n* sizeof(int));
    printf("Enter the Requests sequence: ");
    for(int i=0;i<n;i++){
        scanf("%d",&r[i]);
    }
    printf("Enter initial head position: ");
    scanf("%d",&h);
    int t=0;
    int *v=(int *)calloc(n,sizeof(int));
    for(int i=0;i<n;i++){
        int m=INT_MAX;
        int nr=-1;
        for(int j=0;j<n;j++){
            if(!v[j]){
                int d=abs(h-r[j]);
                if(d<m){
                    m=d;
                    nr=j;
                }
            }
        }
        t+=m;
        h=r[nr];
        v[nr]=1;
    }
    printf("Total head movement is %d\n",t);
    free(r);
    free(v);
    returm 0;
}
