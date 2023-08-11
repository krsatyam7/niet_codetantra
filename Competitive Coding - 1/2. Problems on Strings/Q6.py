import sys

S = sys.argv[1]

# write below line first
arr = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz"

def reverseAlphas(S):
	# write code from here
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
	# ends here

print(reverseAlphas(S))
