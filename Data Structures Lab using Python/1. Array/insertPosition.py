n=int(input("Enter how many elements you want:"))
print("Enter numbers in array:")
arr=[]
for i in range(0,n):
	enter=int(input("num:"))
	arr.append(enter)
print("ARRAY:",arr)
p=int(input("Enter position you want to enter element:"))
q=int(input("Enter the element you want to enter:"))
arr.insert(p,q)
print(arr)
