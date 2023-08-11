import sys

N = int(sys.argv[1])
L = int(sys.argv[2])
R = int(sys.argv[3])

def sumBetween(N, L, R):
	arr = [i for i in range(0, N+1, 2)] + [i for i in range(1, N+1, 2)]
	return sum(arr[L:R+1])
print(sumBetween(N, L, R))
