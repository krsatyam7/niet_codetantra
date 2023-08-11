import sys
n = int(sys.argv[1])

# write code from here 
def isPrime(n):
    for i in range(2, int(n**0.5)+1):
        if n%i==0:
            return False
    return True
# ends here 
def primeSum(n):
	# write code from here 
    primes = []
    for i in range(2,n+1):
        if isPrime(i):
            primes.append(i)
    sum = primes[0]
    counter = 0
    for i in range(1,len(primes)):
        sum += primes[i]
        if sum <= n and isPrime(sum):
            counter +=1
        if sum > n:
            break
    return counter
    # ends here
print(primeSum(n))
