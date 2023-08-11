import sys

s = sys.argv[1]

def isPrimeLengthPalindrome(s):
	# write code from here
	n=len(s)
	rev=""
	flag=0
	if n>1:
		for i in range(2,n):
			if n%i==0:
				flag=1
				break
	if flag==1:
		return False
	else:
		for i in s:
			rev=i+rev
		if rev==s and flag==0:
			return True
		else:
			return False
	# ends here

print("true" if isPrimeLengthPalindrome(s) else "false");
