#include <stdio.h>
#include <stdlib.h>
#include <string.h>
char * stringReverse(char *str) {
	if (str == NULL) return NULL;
	int len = strlen(str);
	char *reversed = (char *)malloc((len + 1) * sizeof(char));
	if (reversed == NULL) return NULL;
	for (int i = 0; i < len; i++) {
		reversed[i] = str[len - 1 - i];
	}
	reversed[len] = '\0';
	return reversed;
}
int main(int argc, char *argv[]) {
	char *str = argv[1];
	printf("%s\n", stringReverse(str));
	return 0;
}
