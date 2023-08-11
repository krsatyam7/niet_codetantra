import sys

s = sys.argv[1]
l = int(sys.argv[2])

def isEqualCharacters(s, l):
	# Write code from here
	rev=""
	for i in s:
		rev = i+rev
	first=s[:l]
	last=rev[l-1::-1]
	if first==last[::-1]:
		return True
	else:
		return False
	# ends here

print("true" if isEqualCharacters(s, l) else "false");
