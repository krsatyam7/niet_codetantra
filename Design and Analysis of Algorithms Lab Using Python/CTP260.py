# Q5

def counting_sort(arr):
	n = len(arr)
	min_val, max_val = min(arr), max(arr)
	count_arr = [0] * (max_val - min_val + 1)
	
	for num in arr:
		count_arr[num - min_val] += 1
		
	output_arr = []
	for i in range(len(count_arr)):
		output_arr += [i + min_val] * count_arr[i]
		
	return output_arr
	
n = int(input())
arr = list(map(int, input().split()))

arr = counting_sort(arr)

for num in arr:
	    print(num, end=' ')
