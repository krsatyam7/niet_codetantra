#include <stdio.h>
#include <stdlib.h>
#include <string.h>
int MagicString(char *S) {
	int count_m = 0, count_n = 0, count_o = 0, count_p = 0;
	for (int i = 0; S[i] != '\0'; i++) {
		if (S[i] == 'm') count_m++;
		else if (S[i] == 'n') count_n++;
		else if (S[i] == 'o') count_o++;
		else if (S[i] == 'p') count_p++;
	}
	int sum_mo = count_m + count_o;
	int sum_np = count_n + count_p;
	return (sum_mo % 2 == 0 && sum_np % 2 == 0) ? 1 : 0;
}
int main(int argc, char *argv[]) {
	char *S = argv[1];
	printf("%d\n", MagicString(S));
	return 0;
}
