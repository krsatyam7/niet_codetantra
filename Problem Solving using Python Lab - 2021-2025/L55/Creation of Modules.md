# Creation of Modules

## Q1

✅ In early times, all the programming languages had huge lines of code that increased in leaps and bounds.

✅ A module contains a set of classes, functions, variables hat got together to get a specific set of tasks done.

◻ Modules are intended for separating code , not reusing.

✅ In Python, a module is a python file (.py).

## Q2


```python
courses = ['Java','Python','C','C plus']
def arithoperations(num1,num2):
	print("addition:",num1+num2)
	print("subtraction:",num1-num2)
	print("multiplication:",num1*num2)
	print("division:",num1/num2)
def compoperations(num1,num2):
	print("is greater than:",num1>num2)
	print("is less than:",num1<num2)
	print("is equal to:",num1==num2)
	print("is not equal to:",num1!=num2)
	
arithoperations(10, 20)
compoperations(10, 20)
print("length:",len(courses))
```

## Q3


```python
def checkNegativeNumber(num):
	if(num>=0):
		print("positive")
	else:
		print("negative")
n=int(input("a: "))
checkNegativeNumber(n)
```
