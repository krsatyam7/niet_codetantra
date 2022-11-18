# Global and Local Variables




## Q1


```python
# write your code here
def test1():
	a=50
	b=80
	print(a,b)
def test2():
	a=22
	b=44
	print(a,b)
test1()
test2()
```

## Q2


```python
#Program to illustrate Global variable access
globvar = "Hello"
def test1():
	global globvar
	globvar ="Good Morning"
def test2():
	# Here this is a local variable
	globvar ="Bad Morning"
print(globvar) # The first value "Hello" is printed
# call the function test1
test1()
test2()
# call the function test2
print(globvar) # The updated value of test1 is printed
```

## Q3


```python
#Program to illustrate Global and Local Variables
a=int(input("a: "))
# take input a from the user

def changeglobal():
	global a
	a = 200
def changelocal():
	a = 500
	print("local a value:", a)
print("global a before function call:", a)
# call the function changeglobal
changeglobal()
changelocal()
# call the function changelocal
print("global a after function call:",a) # print value of a here
```

# Function Composition

## Q1


```python
def square(x):
	# find square of a given number and return the result
	return x*x

def double(x):
	return x*2
	# double the given number and return the result

# take the user input
num=int(input("num: "))
print ("double, squaring the value:",square(double(num)))
#print("Double and squaring the value", )
```

## Q2


```python
def compose (*functions):
	def inner(arg):
		for f in reversed(functions):
			arg=f(arg)
		return arg
	return inner
def square (x):
	return x ** 2
def increment (x):
	return x+1
def half(x):
	return x/2
composed=compose(square,increment,half)
print(composed(5))
composed=compose(square, increment)
print(composed(5))
```
