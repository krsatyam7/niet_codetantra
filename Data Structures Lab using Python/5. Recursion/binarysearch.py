def binarysearch(array,low,high,x):
	if(high>=low):
		mid=(high+low)//2
		if x==array[mid]:
			return mid
		elif x<array[mid]:
			return binarysearch(array,low,mid,x)
		elif x>array[mid]:
			return binarysearch(array,mid+1,high,x)
		else:
			return -1
size=int(input("Enter no of elements"))
array=[]
print("enter elements")
for i in range(size):
	array.append(int(input()))
target=int(input(" Which element you want to search"))
passing=binarysearch(array,0,size-1,target)
if passing!=-1:
	print("The element is present at index ",passing)
