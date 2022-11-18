# Parameters and Arguments


## Q1

✅ An argument is an expression which is passed to a function by its caller, in order for the function to perform its task.

✅ Arguments are local to the particular function.

✅ Parameters are available only with in the specified function and parameters belong to the called function.

◻ Parameters occupy memory through out the program execution.

## Q2


```python
# take the values from the user

def add(a, b):
	return a+b
 # Write your logic here
a=int(input("a: "))
b=int(input("b: "))
print(add(a,b))
```

## Q3


```python
def sayhello(username):
	for i in username:
		print("Hello",i)
users = ['Ram', 'Mahesh', 'Vasudha', 'Uma', 'Sekhar', 'John']
sayhello(users)
```

## Q4


```python
def pt(n):
	trow=[1]
	y=[0]
	for x in range(n):
		print(trow)
		trow=[left+right for left,right in zip(trow+y, y+trow)]
	return n>=1
a=int(input("num: "))
pt(a)
```

# Keyword Arguments

## Q1

✅ When the values are passed, as arguments to the function in any order and these values get assigned, these arguments are called keyword arguments.

✅ Calling the function add(a = 10,b = 20) or by add(10, 20) produce the same result.

◻ Calling the function add(b = 20, a = 10) or by add(10, 20) do not produce the same result.

## Q2


```python
def simplecalc(a,b):
	x=a
	y=b
	print("addition:",x+y)
	print("subtraction:",x-y)
	print("multiplication:",x*y)
	#define your function here and perform arithmetic operations addition, subtraction, multiplicateion 
simplecalc(a = 3, b = 5)
simplecalc(b = 4, a = 5)
	#This function can also be called with positional arguments
simplecalc(8, 4)
```

## Q3


```python
def sst():
	n=input("name: ")
	mn=input("morning/night: ")
	for i in range(2):
		print("Good",mn,n)
sst()
```

## Q4


```python
def ng():
	n=input("name: ")
	a=int(input("age: "))
	for i in range(2):
		print(n,a)
ng()
```
