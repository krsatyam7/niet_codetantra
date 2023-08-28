import sys

treeStr = sys.argv[1]
n = int(sys.argv[2])

def postOrderElement(treeStr, n):
	# write code from here
	a=treeStr.split(' ')
	ar=[]
	def post(i):
		left=2*i+1
		right=2*i+2
		if i<len(a):
			post(left)
			post(right)
			if (a[i]=='-'):
				pass
			else:
				ar.append(a[i])
	post(0)
	return ar[n-1]
	# ends here

print(postOrderElement(treeStr, n))
