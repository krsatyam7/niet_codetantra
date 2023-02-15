# Q9

def find_min_max(arr, low, high):
	# If the list has only one element, return that element as both the minimum and maximum.
	if low == high:
		return arr[low], arr[low]
	
	# If the list has two elements, return the minimum and maximum of the two elements.
	if high == low + 1:
		if arr[low] < arr[high]:
			return arr[low], arr[high]
		else:
			return arr[high], arr[low]
	
	# If the list has more than two elements, divide the list into two halves
	mid = (low + high) // 2
	left_min, left_max = find_min_max(arr, low, mid)
	right_min, right_max = find_min_max(arr, mid+1, high)
	
	# Return the minimum and maximum of the two halves.
	return min(left_min, right_min), max(left_max, right_max)
	
# Main program to get input and output
n = int(input())
arr = list(map(int, input().split()))
min_val, max_val = find_min_max(arr, 0, n-1)
print(min_val, max_val)
