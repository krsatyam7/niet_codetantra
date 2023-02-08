#include<stdio.h>
#include<conio.h>
#include<limits.h>
int m[20][20], s[20][20];
void Print_optimal_parens (i, j){
	if (i == j){
		printf ("A%d", i);
	}
	else
	{
		printf ("(");
		Print_optimal_parens (i, s[i][j]);
		Print_optimal_parens (s[i][j] + 1, j);
		printf (")");
	}
}
void Matrix_chain_order (int p[], int n){
	int q, j, i, l, k;
	for (i = 1; i <= n; i++)
	{
		m[i][i] = 0;
	}
	for (l = 2; l <= n; l++){
		for (i = 1; i <= n - l + 1; i++){
			j = i + l - 1;
			m[i][j] = INT_MAX;
			for (k = i; k <= j - 1; k++){
				q = m[i][k] + m[k + 1][j] + p[i - 1] * p[k] * p[j];
				if (q < m[i][j]){
					m[i][j] = q;
	                s[i][j] = k;
				}
			}
		}
    }
    Print_optimal_parens (1, n);
}
void main (){
	int n;
	printf ("enter the matrices");
	scanf ("%d", &n);
	int p[n];
	for (int i = 0; i <= n; i++){
		scanf ("%d", &p[i]);
	}
	Matrix_chain_order (p, n);
	printf ("%d", m[1][n]);
}
