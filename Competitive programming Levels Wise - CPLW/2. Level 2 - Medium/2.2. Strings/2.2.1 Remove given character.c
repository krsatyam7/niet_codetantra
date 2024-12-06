#include <stdio.h>
#include <stdlib.h>
#include <string.h>
char * removeGivenChar (char *str, char *ch) {
	if (strlen(ch) != 1) {
		return NULL;
	}
	
	char target = ch[0];
	int len = strlen(str);
	char *result = (char *)malloc(len + 1);
	if (!result) {
		return NULL;
	}
	
	char *res_ptr = result;
	for(int i=0; i < len; ++i) {
		if (str[i] != target) {
			*res_ptr++ = str[i];
		}
	}
	
	*res_ptr = '\0';
	if (result[0] == '\0'){
		free(result);
		return "empty";
	}
	return result;
}

int main(int argc, char *argv[]) {
	char *str = argv[1];
	char *ch = argv[2];
	printf("%s\n", removeGivenChar (str, ch));
	return 0;
}
