#include<stdio.h>

int a, b, u, v, n, i, j, ne = 1;
int visited[10] = {0}, min, mincost = 0, cost[10][10];
int main()
{
	printf("To compute the spanning tree from the adjacency matrix");
	printf("\nHow many nodes :");
	scanf("%d", & n);
	printf("Enter the adjacency matrix :");
	for (i = 1; i <= n; i++)
	for (j = 1; j <= n; j++)
	{
		scanf("%d", & cost[i][j]);
		if (cost[i][j] == 0) cost[i][j] = 999;
	}
	printf("The entered adjacency matrix :\n");
	for (i = 1; i <= n; i++)
	{
		for (j = 1; j <= n; j++)
		{
			if (cost[i][j] == 999) printf("%-3d", 0);
			else printf("%-3d", cost[i][j]);
		}
		printf("\n");
	}
	visited[1] = 1;
	printf("The nodes to be connected in spanning tree are : ");
	while (ne < n)
	{
		for (i = 1, min = 999; i <= n; i++)
		for (j = 1; j <= n; j++)
		if (cost[i][j] < min)
		if (visited[i] != 0)
		{
			min = cost[i][j];
			a = u = i;
			b = v = j;
		}
		if (visited[u] == 0 || visited[v] == 0)
		{
			printf("(%d,%d);", a, b);
			ne++;
			mincost += min;
			visited[b] = 1;
			
		}
		cost[a][b] = cost[b][a] = 999;
	}
	printf("\nThe cost of Minimum Spanning Tree is :%d", mincost);
	return 0;
}
