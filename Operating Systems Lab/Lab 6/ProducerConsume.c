#include<stdio.h>
#define max 5
int in=0;
void produce(){
    if (in<max){
        in++;
        printf("Producer produces the item %d\n",in);
    }
}

void consume(){
    if (in>0){
        printf("Consumer consumes item %d\n",in);
        in--;
    }
    else{
        printf("Buffer is empty!!\n");
    }
}

int main(){
    int c;
    printf("1.Producer\n2.Consumer\n3.Exit\n");
    while(1){
        printf("Enter your choice:");
        scanf("%d",&c);
        switch(c){
            case 1:
            produce();
            break;
            case 2:
            consume();
            break;
            case 3:
            exit(0);
        }
    }
    return 0;
}
