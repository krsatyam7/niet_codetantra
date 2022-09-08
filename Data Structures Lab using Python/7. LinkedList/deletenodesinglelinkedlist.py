class Node:
	def __init__(self,data):
		self.data=data
		self.next=None
class LinkedList:
	def __init__(self):
		self.head=None
		self.var=-1
	def insert(self,value):
		new_node=Node(value)
		if self.head==None:
			self.head=new_node
			self.var+=1
		else:
			new_node.next=self.head
			self.head=new_node
			self.var+=1
	def display(self):
		temp1=self.head
		while(temp1!=None):
			print(temp1.data)
			temp1=temp1.next
	def delete(self,var1):
		temp2=self.head
		if var1==0:
			temp2.next=temp2.next.next
		elif var1>self.var:
			print("Position is more than number of nodes")
		else:
			for i in range(1,var1+1):
				if i == var1:
					temp2.next=temp2.next.next
					break
llist=LinkedList()
while True:
	choice=int(input("Select an Operation:\n1.Insert\n2.Deletion\n3.Display\n4.Quit\t"))
	if choice==1:
		value=int(input("Enter Element "))
		llist.insert(value)
	elif choice==2:
		value=int(input("Enter a position "))
		llist.delete(value)
	elif choice==3:
		llist.display()
	elif choice==4:
		break
	else:
		print("Invalid Option!!!")


