def merge(A,p,mid,r):
	L=A[p:mid+1]
	R=A[mid+1:r+1]
	extreme=max(A)
	L.append(extreme+1)
	R.append(extreme+1)
	i=j=0
	for k in range(p,r+1):
		if L[i]<R[j]:
			A[k]=L[i]
			i+=1
		else:
			A[k]=R[j]
			j+=1
def mergesort(A,p,r):
	if p<r:
		mid=(p+r)//2
		mergesort(A,p,mid)
		mergesort(A,mid+1,r)
		merge(A,p,mid,r)
n=int(input("Enter no ofelements"))
A=[]
print("enter elements")
for i in range(n):
	A.append(int(input()))
mergesort(A,0,n-1)
print(A)
