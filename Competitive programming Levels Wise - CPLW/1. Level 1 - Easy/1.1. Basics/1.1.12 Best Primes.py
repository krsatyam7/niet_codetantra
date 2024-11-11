def count_primes_less_than_n(N):
	if N <= 2:
		return 0
	is_prime = [True] * N
	is_prime[0] = is_prime[1] = False
	for i in range(2, int(N**0.5) + 1):
		if is_prime[i]:
			for j in range(i * i, N, i):
				is_prime[j] = False
	return sum(is_prime)
N = int(input())
print(count_primes_less_than_n(N))
