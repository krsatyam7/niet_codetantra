class Node:
	def __init__(self,data):
		self.data=data
		self.next=None
class LinkedList:
	def __init__(self):
		self.head=None
	def push(self,new_data):
		new_node=Node(new_data)
		new_node.next=self.head
		self.head=new_node
	def display(self):
		temp=self.head
		while(temp):
			print(temp.data)
			temp=temp.next
	def update(self,old,new):
		pos=0
		if(self.head==None):
			return
		current=self.head
		while(current!=None):
			if (pos==old):
				current.data=new
				return
			current=current.next
			pos+=1
llist=LinkedList()
while True:
	choice=int(input("Select Operation\n1.Insertion\n2.Updation\n3.Display\n4.Quit\t"))
	if choice==1:
		value=int(input("Enter element "))
		llist.push(value)
	elif choice==2:
		old=int(input("Enter the index to update "))
		new=int(input("Enter a value to update "))
		llist.update(old,new)
	elif choice==3:
		llist.display()
	elif choice==4:
		break
