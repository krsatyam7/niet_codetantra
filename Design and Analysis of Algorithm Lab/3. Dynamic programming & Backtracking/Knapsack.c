#include<stdio.h>
#include<conio.h>

int max(int a, int b){
	  return(a > b) ? a : b;
}
int knapsack(int W, int v[], int w[], int n){
	  if (n == 0 || W == 0) return 0;
	  if (w[n - 1] > W) return knapsack(W, v, w, n - 1);
	  else return max(v[n - 1] + knapsack(W - w[n - 1], v, w, n - 1), knapsack(W, v, w, n - 1));
}
void main(){
	int n, W;
	printf("Enter number of items:");
	scanf("%d", & n);
	int v[n], w[n];
	printf("Enter value and weight of items:");
	for (int i = 0; i < n; i++){
		scanf("%d %d", & v[i], & w[i]);
	}
	printf("Enter size of knapsack:");
	scanf("%d", & W);
	printf("Maximum value in 0/1 knapsack :%d", knapsack(W, v, w, n));
}
