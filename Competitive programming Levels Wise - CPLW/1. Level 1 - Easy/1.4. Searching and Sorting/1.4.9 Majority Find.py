import sys
Arr = [int(x) for x in sys.argv[1].split(',')]
def majorityFind(Arr):
	N = len(Arr)
	majority_count = (N + 1) // 2
	frequency = {}
	for num in Arr:
		if num in frequency:
			frequency[num] += 1
		else:
			frequency[num] = 1
	for num, count in frequency.items():
		if count >= majority_count:
			return num
	return -1
print(majorityFind(A
