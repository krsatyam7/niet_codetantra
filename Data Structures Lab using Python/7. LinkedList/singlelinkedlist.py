class Node:
	def __init__(self,data):
		self.data=data
		self.next=None
class singlelinkedlist:
	def __init__(self):
		self.head=None
	def push(self,new_data):
		new_node=Node(new_data)
		new_node.next=self.head
		self.head=new_node
	def append(self,new_data):
		new_node=Node(new_data)
		if self.head is None:
			self.head = new_node
			return
		last = self.head
		while(last.next):
			last = last.next
		last.next = new_node
	def display(self):
		temp = self.head
		print("The Inserted elements at the front end are :")
		while(temp):
			print(temp.data)
			temp=temp.next

llist = singlelinkedlist()
while True:
	choice=int(input("Select a Operation: 1.Insertion 2.Display 3.Quit "))
	if choice==1:
		data=int(input("Enter element "))
		llist.push(data)
	elif choice==2:
		llist.display()
	elif choice==3:
		exit()
	else:
		print("Invalid Option!!!")
		
