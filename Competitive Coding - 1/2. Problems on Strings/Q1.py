import sys

s = sys.argv[1]
l = int(sys.argv[2])

def getFirstSubString(s, l):
	# write code from here
	for i in range(len(s)):
		substring=s[:i+1:2]
		if len(substring)==l:
			break
	if len(substring)>0 and len(substring)==l:
		return substring
	else:
		return "NotFound"
	#ends here

print(getFirstSubString(s, l))
