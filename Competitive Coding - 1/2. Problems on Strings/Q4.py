import sys

s = sys.argv[1]
# write 1st part of code from here
keys=[chr(x) for x in range(97,123)]
values=[x for x in range(1,27)]
myDict={k:v for (k,v) in zip(keys, values)}
# ends here

def isSuper(s):
	# write 2nd part of code from here
	Is=[x for x in s]
	se=set(Is)
	for i in s:
		if s.count(i) != myDict[i]:
			return False
	return True
	# ends here

print("true" if isSuper(s) else "false");
