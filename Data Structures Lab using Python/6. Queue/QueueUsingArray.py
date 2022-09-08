size=int(input("Enter the size of Queue:"))
from collections import deque
queue=deque([],maxlen=size)
while True:
	print("Select the Operation:\n1.Enqueue 2.Dequeue 3. Display 4. Quit")
	choice=int(input())
	if choice==1:
		value=input("Enter the element:")
		queue.append(value)
	elif choice==2:
		queue.popleft()
	elif choice==3:
		for i in queue:
			print(i,"")
	elif choice==4:
		break
