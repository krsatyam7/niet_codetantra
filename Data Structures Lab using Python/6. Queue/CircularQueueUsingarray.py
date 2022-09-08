def getInput():
	return int(input("Select a operarion 1.Enqueue 2.Dequeue 3.Display 4.Quit "))
class circularQueue():
	def __init__(self,size):
		self.size=size
		self.queue=[None for i in range(size)]
		self.front=self.rear=-1
	def enqueue(self):
		data=int(input("Enter Element "))
		if(self.rear+1)%self.size==self.front:
			print(" Queue is Full")
		elif self.front==-1:
			self.front=0
			self.rear=0
			self.queue[self.rear]=data
		else:
			self.rear=(self.rear+1)%self.size
			self.queue[self.rear]=data
	
	def dequeue(self):
		if self.front==-1:
			print('Queue is Empty')
		elif(self.front==self.rear):
			self.front=-1
			self.rear=-1
			print('Element is Successfully Removed');
		else:
			self.front=(self.front+1)%self.size
			print("Element is Successfully Removed")
		
	def display(self):
		if self.front == -1:
			print('Queue is Empty')
		elif self.rear>=self.front:
			print("Elements in the circular Queue are:")
			for i in range(self.front,self.rear+1):
				print(self.queue[i])
		else:
			print("Element in the circular queue are:")
			for i in range(self.front,self.size):
				print(self.queue[i])
			for i in range(0,self.rear+1):
				print(self.queue[i])
		if(self.rear+1)%self.size==self.front:
			print("Queue is Full")
size=int(input("Enter size of Queue "))
q = circularQueue(size)
while True:
	op = getInput()
	if op == 1:
		q.enqueue()
	elif op == 2:
		q.dequeue()
	elif op == 3:
		q.display()
	else:
		break
				
