class Node:
	def __init__(self,data):
		self.data=data
		self.next=None
		self.prev=None
class DoublyLinkedList:
	def __init__(self):
		self.head=None
	def append(self,newElement):
		newNode=Node(newElement)
		if self.head==None:
			self.head=newNode
			return
		else:
			temp=self.head
			while(temp.next!=None):
				temp=temp.next
			temp.next=newNode
			newNode.prev=temp
	#CodeSnippet for Searching of An ELement
	def search(self,searchValue):
		temp=self.head
		found=0
		i=0
		if temp!=None:
			while(temp!=None):
				i+=1
				if temp.data==searchValue:
					found+=1
					break
				temp=temp.next
			if found==1:
				print("Node is present in the list at the position :",i)
			else:
				print("Node is not present in the list")
		else:
			print("The list is empty")
	def display(self):
		temp=self.head
		if temp!=None:
			while(temp!=None):
				print(temp.data)
				temp=temp.next
		else:
			print("The list is empty")
dll=DoublyLinkedList()
while(True):
	choice=int(input("Select a operation:\n1.Insertion\n2.Searching\n3.Display\n4.Quit\t"))
	if choice == 1:
		value=int(input("Enter Element "))
		dll.append(value)
	elif choice==2:
		target=int(input("Enter Element to Search "))
		dll.search(target)
	elif choice==3:
		dll.display()
	elif choice==4:
		break
