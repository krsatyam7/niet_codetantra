term=int(input("Enter number of terms "))
fact=1
sum=0
for i in range(1,term+1):
	fact=fact*i
	sum=sum+fact
print("Sum of series =",sum)
