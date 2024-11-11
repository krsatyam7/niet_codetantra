import sys
import math
from functools import reduce
def gcd(a, b):
	while b:
		a, b = b, a % b
	return a
def gcd_of_list(numbers):
	return reduce(gcd, numbers)
def distinct_elements_count(numbers):
	if not numbers:
		return 0
	array_gcd = gcd_of_list(numbers)
	max_value = max(numbers)
	return (max_value // array_gcd)
if __name__ == "__main__":
	n = int(sys.stdin.readline().strip())
	numbers = list(map(int, sys.stdin.readline().strip().split()))
	print(distinct_elements_count(numbers))
