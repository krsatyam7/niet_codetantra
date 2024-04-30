#include<stdio.h>
#include<conio.h>
int main(){
    int fs, f[20];
    int len, rs[20];
    int pf=0, ft=0;
    int i, j;
    printf("FIFO PAGE REPLACEMENT ALGORITHM\n");
    printf("Enter no.of frames: ");
    scanf("%d",&fs);
    printf("Enter number of reference string: ");
    scanf("%d",&len);
    printf("Enter the reference string: ");
    for(i=0;i<len;i++){
        scanf("%d",&rs[i]);
    }
    for(i=0;i<fs;i++){
        f[i]=-1;
    }
    printf("The given reference string: ");
    for(i=0;i<len;i++){
        printf("%d ",rs[i]);
    }
    printf("\n");
    for(i=0;i<len;i++){
        int a=0;
        printf("Reference np%d-> ",rs[i]);
        for(j=0;j<fs;j++){
            if(f[j]==rs[i]){
                a=1;
                break;
            }
        }
        if(a==0){
            pf++;
            f[ft]=rs[i];
            if(ft==fs-1){
                ft=0;
            }
            else{
                ft++;
            }
            for(j=0;j<fs;j++){
                printf("%d ",f[j]);
            }
        }
        printf("\n");
    }
    printf("No.of pages faults: %d\n",pf);
}
