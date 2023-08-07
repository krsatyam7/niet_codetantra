import sys

s = sys.argv[1]
keys=[chr(x) for x in range(97,123)]
values=[x for x in range(1,27)]
myDict={k:v for (k,v) in zip(keys, values)}

def isSuper(s):
	# Write code here
	Is=[x for x in s]
	se=set(Is)
	for i in s:
		if s.count(i) != myDict[i]:
			return False
	return True

print("true" if isSuper(s) else "false");
