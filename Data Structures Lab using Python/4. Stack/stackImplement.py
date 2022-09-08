stack=[]
while True:
	data=input("Enter element, 'XXX' to end: ")
	if data=='XXX':
		break
	else:
		stack.append(data)
print("Initial stack")
print(stack)
print("Elements poped from stack:")
print(stack.pop())
print(stack.pop())
print(stack.pop())
print("Stack after elements are poped:")
print(stack)
