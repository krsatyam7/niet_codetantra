class Queue:
	def __init__(self, size):
		self.size = size
		self.queue = []
		self.front = -1
		self.rear = -1
	
	def enqueue(self, element):
		if len(self.queue) < self.size:
			if self.front == -1:
				self.front = 0
			self.rear += 1
			self.queue.append(element)
		else:
			print("Queue is full")
	
	def reverse(self):
		i, j = self.front, self.rear
		while i < j:
			self.queue[i], self.queue[j] = self.queue[j], self.queue[i]
			i += 1
			j -= 1
	
	def display(self):
		return self.queue[self.front:self.rear + 1]
		
size = int(input())
elements = list(map(int, input().split()))
queue = Queue(size)
for element in elements:
	queue.enqueue(element)
print(" ".join(map(str, queue.display())),"")
queue.reverse()
print(" ".join(map(str, queue.display())),"")
