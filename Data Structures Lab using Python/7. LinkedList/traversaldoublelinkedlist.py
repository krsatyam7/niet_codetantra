l=[]
a=int(input("Enter Number of Elements to Insert in DoublyLinkedList "))
for i in range(a):
	x=int(input("Enter Element "))
	l.append(x)
print("Traversal in forward direction")
l.reverse()
for i in range(a):
	print(l[i])
l.reverse()
print("Traversal in reverse direction")
for j in range(a):
	print(l[j])
