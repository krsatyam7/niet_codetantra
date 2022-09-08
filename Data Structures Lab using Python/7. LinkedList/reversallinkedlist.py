class Node:
	def __init__(self,data):
		self.data=data
		self.next=None
class LinkedList:
	def __init__(self):
		self.head=None
	#This function will reverse the LinkedList
	def reverse(self):
		prev=None
		current=self.head
		while(current is not None):
			next=current.next
			current.next=prev
			prev=current
			current=next
		self.head=prev
	#Function to insert new node at the begining
	def push(self,new_data):
		new_node=Node(new_data)
		new_node.next=self.head
		self.head=new_node
	#Function to print the linked list
	def display(self):
		temp=self.head
		while(temp):
			print(temp.data)
			temp=temp.next
#Driver Code (From Here the Code Begin)
llist=LinkedList()
while(True):
	choice=int(input("Select a option: 1.Insertion 2.Reversal 3.Display 4.Quit "))
	if choice==1:
		value=int(input("Enter number "))
		llist.push(value)
	elif(choice==2):
		llist.reverse()
	elif(choice==3):
		llist.display()
	elif(choice==4):
		break
