# Q10

def knapsack(n, values, weights, capacity):
	# create a 2D array to store maximum value for each weight and item combination
	dp = [[0 for x in range(capacity+1)] for y in range(n+1)]
	
	# fill the array using dynamic programming approach
	for i in range(1, n+1):
		for w in range(1, capacity+1):
			# if weight of the current item is more than the capacity, skip it
			if weights[i-1] > w:
				dp[i][w] = dp[i-1][w]
			else:
				# choose the item and subtract its weight from the capacity
				take = values[i-1] + dp[i-1][w-weights[i-1]]
				# skip the item and keep the same
				skip = dp[i-1][w]
				# take the maximum value
				dp[i][w] = max(take, skip)
	# the maximum value will be stored in the last cell of the array
	return dp[n][capacity]
	
# take input from user
n = int(input())
values = list(map(int, input().split()))
weights = list(map(int, input().split()))
capacity = int(input())

# call the knapsack function
max_value = knapsack(n, values, weights, capacity)
# print the maximum value that can be put in the knapsack
print(max_value)
