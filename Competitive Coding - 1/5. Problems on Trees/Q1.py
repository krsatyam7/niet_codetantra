import sys
treeStr = sys.argv[1]

def levelCount(treeStr):
	# write code from here
	n=len(treeStr.split())
	sum=0
	i=0
	count=0
	while sum<n:
		sum+=2**i
		i+=1
		count+=1
	return count
  # ends here
print(levelCount(treeStr))
