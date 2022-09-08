class Node:
	def __init__(self,data):
		self.data=data
		self.next=None
class LinkedList:
	def __init__(self):
		self.head=None
	
	def display(self):
		temp=self.head
		while(temp):
			print(temp.data,end=" ")
			temp=temp.next
			
	def append(self,new_data):
		new_node = Node(new_data)
		if self.head is None:
			self.head = new_node
			return
		last=self.head
		while last.next:
			last=last.next
		last.next=new_node
	
	def selectionSort(self):
		temp=self.head
		while(temp):
			minn=temp
			r=temp.next
			while(r):
				if(minn.data>r.data):
					minn=r
				r=r.next
			x=temp.data
			temp.data=minn.data
			minn.data=x
			temp=temp.next
		
def mergeLists(headA,headB):
	dummyNode=Node(0)
	tail=dummyNode
	while True:
		if headA is None:
			tail.next=headB
			break
		if headB is None:
			tail.next=headA
			break
		if headA.data<=headB.data:
			tail.next=headA
			headA=headA.next
		else:
			tail.next=headB
			headB=headB.next
		tail=tail.next
	return dummyNode.next
	
		
listA = LinkedList()
listB = LinkedList()
a = int(input("Enter number of elements in first list "))
for i in range(0,a):
	b=int(input("enter element "))
	listA.append(b)
listA.selectionSort()
c = int(input("Enter number of elements in second list "))
for i in range(0,c):
	d=int(input("enter element "))
	listB.append(d)
listB.selectionSort()
listA.head=mergeLists(listB.head,listA.head)
print("Merged Linked List is:")
listA.display()
	
