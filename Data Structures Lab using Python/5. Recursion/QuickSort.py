def partition(array,low,high):
	pivot=array[high]
	i=low-1
	for j in range(low,high):
		if array[j]<=pivot:
			i=i+1
			array[i],array[j]=array[j],array[i]
	array[i+1],array[high]=array[high],array[i+1]
	return i+1
def quicksort(array,low,high):
	if(low<high):
		pi = partition(array,low,high)
		quicksort(array,low,pi-1)
		quicksort(array,pi+1,high)
size=int(input("Enter no ofelements"))
store=[]
print("enter elements")
for i in range(size):
	store.append(int(input()))
print("Unsorted Array")
print(store)
quicksort(store,0,size-1)
print("Sorted Array in Ascending Order:")
print(store)
