import sys
n = int(sys.argv[1])
i = int(sys.argv[2])
def ithFactor(n, i):
    factors = []
    for j in range(1, int(n**0.5) + 1):
        if n % j == 0:
            factors.append(j)
            if j != n // j:
                factors.append(n // j)
    factors.sort()
    if i <= len(factors):
        return factors[i - 1]
    else:
        return 0
print(ithFactor(n, i))
