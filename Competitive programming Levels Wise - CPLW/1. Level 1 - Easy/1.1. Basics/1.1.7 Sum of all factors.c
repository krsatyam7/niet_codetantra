#include <stdio.h>
#include <stdlib.h>
#include <string.h>
int sumOfFactors(int n) {
	int sum = 0;
	for (int i = 1; i <= n; i++){
		if (n % i == 0) {
			sum += i;
		}
	}
	return sum;
}
int main(int argc, char *argv[]) {
	int n = atoi(argv[1]);
	printf("%d\n", sumOfFactors(n));
	return 0;
}
