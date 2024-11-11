def count_primes_in_range(L, U):
    if U < 2:
    	return 0
    L = max(L, 2)
    sieve = [True] * (U + 1)
    sieve[0] = sieve[1] = False
    for start in range(2, int(U**0.5) + 1):
    	if sieve[start]:
    		for multiple in range(start*start, U + 1, start):
    			sieve[multiple] = False
    prime_count = sum(1 for number in range(L, U + 1) if sieve[number])
    return prime_count
input_data = input().strip()
L, U = map(int, input_data.split())
result = count_primes_in_range(L, U)
print(result)
