n=int(input("Enter number of elements for list1 "))
l1=[]
for i in range(0,n):
	e=int(input("Enter Element "))
	l1.append(e)
print("Elements of List1: ")
l1.reverse()
for i in l1:
	print(i)
n2=int(input("Enter number of elements for list2 "))
l2=[]
for i in range(0,n2):
	e2=int(input("Enter Element "))
	l2.append(e2)
print("Elements of List2: ")
l2.reverse()
for i in l2:
	print(i)
if len(l1)>len(l2):
	l=l2+l1
else:
	l=l1+l2
for i in range(0,len(l)):
	if l[3]==32:
		l.pop(3)
		l.insert(0,32)
print("Final List:")
for i in l:
	print(i)
