#factorial using tail recursion
def factorial(num):
	if num==0:
		return 1   #base_case
	else:
		return num*factorial(num-1)   #recursive_call
value=int(input("Enter a number: "))
fact=factorial(value)
print("The factorial of",value,"is",fact)
