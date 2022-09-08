#It repeatedly swap the adjacent element if they are in wrong order ex -- 5,1,4,2,8
#It will sort it repeatedly by comparing 
#here it is a simple program to implement bubble sort

def bubbleSort(A):
	for i in range(length):
		for j in range(0,length-i-1):
			if A[j]>A[j+1]:
				A[j],A[j+1]=A[j+1],A[j]
mylist=input("Enter the list of numbers: ").split()
A=[int(i) for i in mylist]
length=len(A)
bubbleSort(A)
print("Sorted list:",A)
