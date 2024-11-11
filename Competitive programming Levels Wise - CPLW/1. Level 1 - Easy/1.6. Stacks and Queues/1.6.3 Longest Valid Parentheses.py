def longest_valid_parentheses(A):
	stack = []
	max_length = 0
	stack.append(-1)
	for i in range(len(A)):
		if A[i] == '(':
			stack.append(i)
		else:
			if stack:
				stack.pop()
			if not stack:
				stack.append(i)
			else:
				max_length = max(max_length, i - stack[-1])
	return max_length

A = input().strip()
result = longest_valid_parentheses(A)
print(result)
