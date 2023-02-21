# Q2

def binary_search(arr, x, low, high):
	if low > high:
		return False
	mid = (low + high) // 2
	if arr[mid] == x:
		return True
	elif arr[mid] < x:
		return binary_search(arr, x, mid + 1, high)
	else:
		return binary_search(arr, x, low, mid - 1)
		
def main():
	n = int(input())
	arr = []
	for i in range(n):
		arr.append(int(input()))
	x = int(input())
	if binary_search(arr, x, 1, len(arr) - 1):
		print("item found")
	else:
		print("item not found")
if __name__ == "__main__":
	main()
  
  

 # credit - Ashutosh Singh
