import sys

s = sys.argv[1]
l = int(sys.argv[2])

def getFirstSubString(s, l):
	# write code from here
	if len(s) < l*2-1:
		return "NotFound"
	return s[:l*2:2]
	#ends here

print(getFirstSubString(s, l))
