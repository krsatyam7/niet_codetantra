a=int(input("Enter how many elements you want:"))
print("Enter numbers in array:")
arr=[]
for i in range(0,a):
	b=int(input("num:"))
	arr.append(b)
print("ARRAY:",arr)
c=int(input("Enter position you want to delete element:"))
arr.pop(c)
print(arr)
