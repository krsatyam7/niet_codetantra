class Node:
	def __init__(self,data):
		self.data=data
		self.next=None
		self.prev=None
class DoublyLinkedList:
	def __init__(self):
		self.head=None
	def append(self,new_data):
		new_node=Node(new_data)
		if self.head is None:
			self.head=new_node
			return
		last=self.head
		while last.next:
			last=last.next
		last.next=new_node
		new_node.prev=last
		return
	def display(self,node):
		while node:
			print("{}".format(node.data))
			last=node
			node=node.next
llist=DoublyLinkedList()
while(True):
	choice=int(input("Select Opertion\n1.Insertion\n2.Display\n3.Quit\t"))
	if choice==1:
		dayTa=int(input("enter element "))
		llist.append(dayTa)
	elif choice==2:
		print("Adding a node to the end of the list: ")
		llist.display(llist.head)
	elif choice==3:
		break
