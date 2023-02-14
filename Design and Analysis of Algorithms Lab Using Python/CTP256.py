# Q1


def linear_search(arr, x, index):
	if index == len(arr):
		return -1
	if arr[index] == x:
		return index
	return linear_search(arr, x, index + 1)
	    	            	            
def main():
	n = int(input())
	arr = []
	for i in range(n):
		arr.append(int(input()))
	x = int(input())
	result = linear_search(arr, x, 0)
	if result == -1:
		print("item not found")
	else:
		print(result + 1)
	    	                    	            	        
if __name__ == "__main__":
	main()
