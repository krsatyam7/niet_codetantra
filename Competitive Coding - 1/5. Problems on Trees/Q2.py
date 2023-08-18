import sys
treeStr = sys.argv[1]
n = int(sys.argv[2])

def infixElement(treeStr, n):
  # write code from here
	p=treeStr.split(' ')
	ar=[]
	def infix(i):
		left=2*i+1
		right=2*i+2
		if i<len(p):
			infix(left)
			if(p[i]=='-'):
				pass
			else:
				ar.append(p[i])
			infix(right)
	infix(0)
	return ar[n-1]
	# ends here

print(infixElement(treeStr, n))
