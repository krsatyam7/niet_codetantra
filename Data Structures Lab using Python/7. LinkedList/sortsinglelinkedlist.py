def insert():
	b=int(input("Enter a element "))
	l.append(b)
def sort():
	l.sort()
def display():
	for i in range(len(l)):
		print(l[i])
l=[]
c=0
while True:
	a=int(input("Select a Operation 1.Insertion 2.Sorting 3.Display 4.Quit "))
	if(a==1):
		insert()
		c+=1
	elif a==2:
		if(c==0):
			print("List is Empty")
		else:
			sort()
	elif a==3:
		display()
	elif a==4:
		break
	else:
		print("Invalid operation!!!")
