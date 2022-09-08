#Simple python program to implement Insertion Sort by Shivesh
def insertionSort(A):
	for i in range(1,length):
		key = A[i]
		j = i-1
		while j>=0 and key < A[j]:
			A[j + 1] = A[j]
			j = j-1
		A[j+1] = key

mylist=input("Enter the list of numbers: ").split()
print(mylist)
A=[int(i) for i in mylist]
length=len(A)
insertionSort(A)
strList=[str(i) for i in A]
print(strList)
