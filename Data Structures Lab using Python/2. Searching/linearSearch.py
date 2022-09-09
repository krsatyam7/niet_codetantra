
# method 1

mylist=input("Enter the list of numbers: ").split()
A=[int(i) for i in mylist]
length=len(A)
value=int(input("The number to search for: "))
loc=-1
for i in range(length):
	if value==A[i]:
		loc=i+1
		break
if loc==-1:
	print(value,"was not found.")
else:
	print(value,"was found at index",str(loc-1)+'.')

	
# method 2

a=list(map(int,input('Enter the list of numbers: ').split()))
num=int(input('The number to search for: '))
flag=0
k=0
for i in a:
	if i==num:
		flag=1
		break
	k+=1
if flag==1:
	print(f'{num} was found at index {k}.')
else:
	print(num,'was not found.')
