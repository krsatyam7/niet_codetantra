import sys

S = sys.argv[1]
arr = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz"

def reverseAlphas(S):
	arr1 = []
	for i in S:
		if i in arr:
			arr1.append(i)
	ans = ''
	for i in S:
		if i in arr:
			ans += arr1.pop()
		else:
			ans += i
	return ans

print(reverseAlphas(S))
