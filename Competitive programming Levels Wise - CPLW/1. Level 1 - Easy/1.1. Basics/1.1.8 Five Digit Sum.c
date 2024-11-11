#include <stdio.h>
#include <stdlib.h>
#include <string.h>
int reverseFiveDigitNum(int fiveDigitNum) {
	int reversedNum = 0;
	for (int i = 0; i < 5; i++) {
		reversedNum = reversedNum * 10 + (fiveDigitNum % 10);
		fiveDigitNum /= 10;
	}
	return reversedNum;
}
int main(int argc, char *argv[]) {
	int fiveDigitNum = atoi(argv[1]);
	printf("%d\n", reverseFiveDigitNum(fiveDigitNum));
	return 0;
}
