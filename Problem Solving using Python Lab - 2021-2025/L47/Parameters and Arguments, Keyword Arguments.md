# Basics of Functions

## Q1

✅ A function is defined once but called many number of times.

✅ Function is a block of statements to do one or more tasks.

◻ By writing different functions in a program, increases the length of the code.

 ## Q2

✅ Th keyword def always occurs as the start of function header.

✅ The function_name follows the same rules as any identifiers of Python.

◻ Every function should have a return statement which returns some value.

## Q3


```python
def helloworld():
	
	# write your code here
	print("Hello World")
	print("Good morning")
	print("Have a nice day")
	print("The function ends")
	
helloworld()
```

## Q4


```python
def add(x, y):
	# add x, y and print the result
	return x+y
def sub(x, y):
	# subtract x, y and print the result
	return abs(x-y)
def mul(x, y):
	# multiply x, y and print the result
	return x*y
# take inputs x and y from the user
a=int(input("x: "))
b=int(input("y: "))
# call the functions add,sub, mul
print(add(a,b))
print(sub(a,b))
print(mul(a,b))
```

## Q5


```python
def tn(x,y):
	add=x+y
	sub=abs(x-y)
	mul=x*y
	return add,sub,mul
a=int(input("a: "))
b=int(input("b: "))
(add,sub,mul)=tn(a,b)
print(add)
print(sub)
print(mul)
```

## Q6

✅ A comment that occurs in the first line of the function body after the colon(:) is known as Docstring

✅ This docstring is available in the program as a __doc__ attribute.

◻ A docstring should have only one line.

✅ A docstring is written between triple quotes """

## Q7


```python
def of(x,y):
	su=x+y
	av=(x+y)/2
	sb=abs(x-y)
	ml=x*y
	return su,av,sb,ml
a=int(input("a: "))
b=int(input("b: "))
(sm,avr,sub,mul)=of(a,b)
print("sum, average: ({}, {})".format(sm,avr))
print("subtraction:",sub)
print("multiplication:",mul)
```

## Q8


```python
def add(x,y):
	return x+y
def sub(x,y):
	return abs(x-y)
a=int(input("a: "))
b=int(input("b: "))
print("addition:",add(a,b))
print("subtraction:",sub(a,b))
```
