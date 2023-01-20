#include<stdio.h>
#include<conio.h>

void lcs(char a[], char b[]) {
  int n = strlen(a);
  int m = strlen(b);
  int c[n + 1][m + 1];
  for (int j = 0; j <= m; j++) {
    c[0][j] = 0;
  }
  for (int i = 1; i <= n; i++) {
    c[i][0] = 0;
  }
  for (int i = 1; i <= n; i++) {
    for (int j = 1; j <= m; j++) {
      if (a[i - 1] == b[j - 1]) c[i][j] = c[i - 1][j - 1] + 1;
      else if (c[i - 1][j] >= c[i][j - 1]) c[i][j] = c[i - 1][j];
      else c[i][j] = c[i][j - 1];
    }
  }
  printf("Length of LCS is %d\n", c[n][m]);
}
void main() {
  char a[50], b[50];
  printf("Enter a string1: ");
  gets(a);
  printf("Enter a string2: ");
  gets(b);
  lcs(a, b);
}
