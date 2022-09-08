#Python program to implement selection sort
#it is similar to insertion sort
mylist=input("Enter the list of numbers: ").split()
A=[int(i) for i in mylist]
length=len(A)
for i in range(length-1):
	min=i
	for j in range(i+1,length):
		if A[min]>A[j]:
			min=j
	if i!=min:
		A[i],A[min]=A[min],A[i]
strList=[str(i) for i in A]
print(strList)
