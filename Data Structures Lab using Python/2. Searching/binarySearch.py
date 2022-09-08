#using binary search concept and taking input seperately
#we can also use .split method to take input
size=int(input("Enter size of list: "))
store=[]
for i in range(size):
	element=int(input("Enter your number: "))
	store.append(element)
store.sort()
print("After sorting list is: ",store)
length=len(store)
low=0
high=length-1
value=int(input("The number to search for: "))
loc=-1
while(low<=high):
	mid=(low+high)//2
	if value==store[mid]:
		loc=mid+1
		break
	elif value>store[mid]:
		low=mid+1
	elif value<store[mid]:
		high=mid-1
		low=0
if loc!=-1:
	print(value,"was found at index",str(loc-1)+'.')
	
	
