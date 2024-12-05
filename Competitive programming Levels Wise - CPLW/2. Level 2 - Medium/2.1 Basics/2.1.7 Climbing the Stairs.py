def count_ways(n):
	if n == 0:
		return 1
	elif n == 1:
		return 1
		
	ways = [0] * (n + 1)
	ways[0] = 1
	ways[1] = 1
	
	for i in range(2, n + 1):
		ways[i] = ways[i - 1] + ways[i - 2]
		
	return ways[n]

if __name__ == "__main__":
	n = int(input().strip())
	print(count_ways(n))
