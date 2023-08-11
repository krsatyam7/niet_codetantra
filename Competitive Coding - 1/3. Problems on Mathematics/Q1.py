import sys

n1 = int(sys.argv[1])
n2 = int(sys.argv[2])

# write from here
def isPrime(n):
	if n==1:
		return False
	for i in range(2, int(n**0.5)+1):
		if n%i==0:
			return False
	return True
# ends here
def sumOfPrimes(n1, n2):
	# write from here
	sum = 0
	n1, n2 = sorted([n1, n2])
	for i in range(n1, n2+1):
		if isPrime(i):
			sum += i
	return sum
	# ends here

print(sumOfPrimes(n1, n2))
