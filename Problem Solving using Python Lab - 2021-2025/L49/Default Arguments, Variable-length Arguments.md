# Default Arguments


## Q1


```python
def simplecalc(a, b = 100):
	# write your code here
	print("addition:",a+b)
	print("subtraction:",a-b)
	print("multiplication:",a*b)
num1=int(input("num1: "))
num2=int(input("num2: "))
simplecalc(a = num1)
simplecalc(b = num2, a = num1)
```

## Q2


```python
def tax(s,p=20):
	t=s*(p/100)
	print(t)
a=int(input("salary: "))
b=float(input("tax percentage: "))
tax(a)
tax(a,b)
```

## Q3

✅ Function arguments can have default values in Python.

◻ The default value is assigned even when a value is passed for that argument.

✅ Any number of arguments in a function can have a default values.

✅ non-default arguments cannot follow default arguments.

## Q4


```python
def fun1(name='Padma',age=12):
	print(name,"is",age,"years old.")
fun1('Aruna',16)
fun1('Karuna',16)
fun1(age=16)
fun1(name='Karuna')
fun1()
```

# Variable-length Arguments

## Q1

✅ If the correct number of arguments that will be passed to a function at the time of execution is not known , we can use function with arbitrary arguments.

✅ Arbitrary arguments. is specified by using an asterisk (*) in the function definition before the parameter name.

◻ Arbitrary/Variable length arguments are two different functionalities.

## Q2


```python
#Program to illustrate variable number of arguments
def mySum(*args):
	s=0
	for i in args:
		s=s+i
	return s
print(mySum(1, 2, 3, 4, 5, 6, 7))	#7 arguments
print(mySum(1, 2))	#2 arguments
print(mySum(1, 2, 3))	#3 arguments
```

## Q3


```python
#Program to illustrate Variable number of arguments
def largestNumber( * numbers):
	a=numbers[0]
	for i in numbers:
		if(a<i):
			a=i
	print("largest:",a)
largestNumber(1, 2, 3, 4)			#4 arguments
largestNumber(8, 9, 3, 4, 2, 5)		#6 arguments
```
