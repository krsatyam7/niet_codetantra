#include<stdio.h>

void knapsack(int n, float weight[], float profit[], float capacity)
{
	float x[20], tp = 0;
	int i, j, u;
	u = capacity;
	for (i = 1; i <= n; i++)
	{
		x[i] = 0.0;
	}
	for (i = 1; i <= n; i++)
	{
		if (weight[i] > u) break;
		else
		{
			x[i] = 1.0;
			tp = tp + profit[i];
			u = u - weight[i];
		}
	}
	if (i <= n)
	{
		x[i] = u / weight[i];
	}
	tp = tp + (x[i] * profit[i]);
	printf("The result vector is:- \n");
	for (i = 1; i <= n; i++) printf("%.2f\t", x[i]);
	printf("\nMaximum profit is:- %.2f", tp);
}
int main()
{
	float weight[20], profit[20], capacity;
	int num, i, j;
	float ratio[20], temp;
	printf("Enter the no. of objects:- ");
	scanf("%d", & num);
	printf("Enter the Weight, Value(Profit) of each object:- \n");
	for (i = 1; i <= num; i++)
	{
		printf("item %d:", i);
		scanf("%f%f", & weight[i], & profit[i]);
	}
	printf("Enter the capacity of knapsack:- ");
	scanf("%f", & capacity);
	for (i = 1; i <= num; i++)
	{
		ratio[i] = profit[i] / weight[i];
	}
	for (i = 1; i <= num; i++)
	{
		for (j = i + 1; j <= num; j++)
		{
			if (ratio[i] < ratio[j])
			{
				temp = ratio[j];
				ratio[j] = ratio[i];
				ratio[i] = temp;
				temp = weight[j];
				weight[j] = weight[i];
				weight[i] = temp;
				temp = profit[j];
				profit[j] = profit[i];
				profit[i]=temp;
			}
		}
	}
	knapsack(num, weight, profit, capacity);
	return (0);
}
