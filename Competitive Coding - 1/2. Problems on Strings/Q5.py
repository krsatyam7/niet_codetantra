import sys

S = sys.argv[1]

def consecutiveString(S):
	#write code from here
	ans = ''
	stack = S[0]
	for i in range(len(S) -1):
		if S[i+1]!=stack[-1]:
			ans += stack
			stack = S[i+1]
		else:
			stack += S[i+1]
			if len(stack) > 2:
				stack = stack[:2]
	return ans+stack
	# ends here
print(consecutiveString(S))
