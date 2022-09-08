n=int(input("Enter number "))
temp=n
reverse=0
while n>0:
	reverse=reverse*10+n%10
	n=n//10
print("Reverse number =",reverse)
if temp==reverse:
	print(temp,"is in palindrome.")
else:
	print(temp,"is not in palindrome.")
