class Node:
	def __init__(self,data):
		self.data=data
		self.next=None
class LinkedList:
	def __init__(self):
		self.head = None
	def push(self,new_data):
		new_node=Node(new_data)
		new_node.next=self.head
		self.head = new_node
	def display(self):
		temp = self.head
		while(temp):
			print(temp.data)
			temp = temp.next
llist = LinkedList()
count=int(input("Enter how many elements would you like to add: "))
for i in range(count):
	data = int(input("Enter data elements: "))
	llist.push(data)
print("The linked list is: ")
llist.display()
