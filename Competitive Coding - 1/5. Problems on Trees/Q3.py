import sys
treeStr = sys.argv[1]
n = int(sys.argv[2])

def preOrderElement(treeStr, n):
	# write code from here
	a=treeStr.split(" ")
	ar=[]
	i=0
	def pre(i):
		left=2*i+1
		right=2*i+2
		if i<len(a):
			if(a[i]=='-'):
				pass
			else:
				ar.append(a[i])
				pre(left)
				pre(right)
	pre(0)
	return ar[n-1]
	# ends here

print(preOrderElement(treeStr, n))
