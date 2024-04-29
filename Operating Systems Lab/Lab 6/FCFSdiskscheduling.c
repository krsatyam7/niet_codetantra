#include<stdio.h>
#include<conio.h>
int main()
{
    int i, n, h, t=0;
    int r[n];
    printf("Enter the number of Requests: ");
    scanf("%d",&n);

    printf("Enter the Requests sequence: ");
    for(i=0;i<n;i++){
        scanf("%d",&r[i]);
    }

    printf("Enter initial head position: ");
    scanf("%d",&h);
    for(i=0;i<n;i++){
        t+=abs(r[i]-h);
        h=r[i];
    }

    printf("Total head moment is %d\n",t);
    return 0;
}
