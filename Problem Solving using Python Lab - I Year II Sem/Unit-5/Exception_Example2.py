a=int(input("Enter num1: "))
b=int(input("Enter num2: "))
try:
	print("Succesful Division, value of num1/num2 ",a/b)
except ZeroDivisionError:
	print("Exception occured")
