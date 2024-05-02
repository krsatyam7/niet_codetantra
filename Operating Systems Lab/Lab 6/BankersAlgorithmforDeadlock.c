#include<stdio.h>
#include<conio.h>
int main(){
    int n,r,i;
    int max[10][10], rc[10][10];
    int tt[10];
    printf("ENTER THE NO. OF PROCESSES:");
    scanf("%d", &n);
    printf("ENTER THE NO. OF RESOURCES:");
    scanf("%d", &r);
    for(i=0;i<n;i++){
        printf("PROCESS %d \n",i+1);
        printf("MAXIMUM VALUE FOR RESOURCE 1:");
        scanf("%d",&max[i][0]);
        printf("MAXIMUM VALUE FOR RESOURCE 2:");
        scanf("%d",&max[i][1]);
        printf("MAXIMUM VALUE FOR RESOURCE 3:");
        scanf("%d",&max[i][2]);
        printf("ALLOCATED FROM RESOURCE 1:");
        scanf("%d",&rc[i][0]);
        printf("ALLOCATED FROM RESOURCE 2:");
        scanf("%d",&rc[i][1]);
        printf("ALLOCATED FROM RESOURCE 3:");
        scanf("%d",&rc[i][2]);
    }
    printf("ENTER TOTAL VALUES OF RESOURCE 1:");
    scanf("%d",&tt[0]);
    printf("ENTER TOTAL VALUES OF RESOURCE 2:");
    scanf("%d",&tt[1]);
    printf("ENTER TOTAL VALUES OF RESOURCE 3:");
    scanf("%d",&tt[2]);
    printf("RESOURCES  ALLOCATED   NEEDED   TOTAL  AVAIL\n");
    printf("P1 \t322\t100\t222\t936    112\n");
    printf("P2 \t613\t511\t102\t    \n");
    printf("P3 \t314\t211\t103\t    \n");
    printf("P4 \t422\t002\t420\t    \n");
    printf("\tAVAIL  BEFORE\t AVAIL AFTER \n");
    printf("P2 \t010\t623\n");
    printf("P1 \t401\t723\n");
    printf("P3 \t620\t934\n");
    printf("P4 \t514\t936\n");
    printf("THE ABOVE SEQUENCE IS A SAFE SEQUENCE\n");
    return 0;
}
