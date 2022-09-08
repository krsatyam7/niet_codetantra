import gc
class Node:
	def __init__(self,data):
		self.data=data
		self.next=None
		self.prev=None
class DoublyLinkedList:
	def __init__(self):
		self.head=None
	def deleteNode(self,dele):
		if self.head is None or dele is None:
			return
		if self.head == dele:
			self.head=dele.next
		if dele.next is not None:
			dele.next.prev=dele.prev
		if dele.prev is not None:
			dele.prev.next=dele.next
		gc.collect()
	def append(self,new_data):
		new_node=Node(new_data)
		last=self.head
		new_node.next=None
		if self.head is None:
			new_node.prev=None
			self.head=new_node
			return
		while(last.next is not None):
			last=last.next
		last.next=new_node
		new_node.prev=last
	def display(self,node):
		while(node is not None):
			print(node.data)
			node=node.next
	def isEmpty(self):
		current_node=self.head
		return current_node==None
dll=DoublyLinkedList()
while True:
	a=int(input("Select Opertion 1.Insertion 2.DeletefromStart 3.Display 4.Quit "))
	if a==1:
		value=int(input("Enter element "))
		dll.append(value)
	elif a==2:
		if dll.isEmpty():
			print("List is empty")
		dll.deleteNode(dll.head)
	elif a==3:
		if dll.isEmpty():
			print("List is empty")
		dll.display(dll.head)
	elif a==4:
		break
	else:
		print("Invalid Option!!!")
	
