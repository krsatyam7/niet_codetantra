def max_sum_k_corners(arr, N, K):
    max_sum = 0
    for i in range(K + 1):
	    if i <= N:
		    sum_start = sum(arr[:i])
		    sum_end = sum(arr[N - (K - i):])
		    max_sum = max(max_sum, sum_start + sum_end)
    return max_sum

input_data = input().strip()
N, K = map(int, input_data.split())
arr = list(map(int, input().strip().split()))
result = max_sum_k_corners(arr, N, K)
print(result)
