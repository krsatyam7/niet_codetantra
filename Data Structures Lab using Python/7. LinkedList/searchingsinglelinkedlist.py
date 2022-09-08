#Searching in LinkedList in a iterative way
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
	#this function check weather the element x is
	#present in the LinkedList
	def search(self,x):
		current=self.head
		while (current!=None):
			if current.data==x:
				return True
			current=current.next
		return False
	def display(self):
		temp=self.head
		while(temp):
			print(temp.data)
			temp=temp.next
llist=LinkedList()
while True:
	choice=int(input("Select Operation:\n1.Insertion\n2.Searching\n3.Display\n4.Quit\t"))
	if choice==1:
		value=int(input("Enter elements "))
		llist.push(value)
	elif choice==2:
		value=int(input("Enter a key to search "))
		if (llist.search(value)):
			print("Item found")
		else:
			print("item not found")
	elif choice==3:
		llist.display()
	elif choice==4:
		break
	
			
		
		
