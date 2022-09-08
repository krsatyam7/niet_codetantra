mylist=input("Enter elements separated by a comma:").split(',')
A=[int(i) for i in mylist]
li=[]
for i in A:
	if i%2==0:
		li.append(i)
print("Even numbers in the list: ",li)
