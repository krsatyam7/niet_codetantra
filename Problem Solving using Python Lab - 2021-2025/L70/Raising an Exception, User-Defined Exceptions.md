# Raising an Exception



## Q1


```python
def checkage(age):
	if age < 0:
		raise ValueError("age should be greater than or equal to zero")
	print("age is valid")
# write your code here
try:
	a=int(input("age: "))
	checkage(a)
except ValueError:
	print("('age should be greater than or equal to zero',)")
print("executed in any condition")
```

## Q2


```python
try:
	age=int(input("age: "))
	if(age<0):
		raise ValueError
except ValueError:
	print("age should be greater than or equal to zero")
print("i am always executed")
```

# User-Defined Exceptions

## Q1

✅ Python supports a lot of in-built exceptions.

✅ All user defined exceptions have to be derived from the Exception class.

✅ Python built-in exceptions extend from the BaseException/Exception class.

◻︎ An user defined exception cannot be derived from another user defined exception class that extends from a Exception class.

## Q2


```python
class OurException(Exception):
	# define constructor
	def __init__(self,message):
		self.message=message
class UsingUserException:
	try:
		a=int(input("a: "))
		b=int(input("b: "))
		if b==0:
			raise OurException("b should be greater than 0")
		d=a/b
		print("division operation successful with result:",d)
	except OurException as err:
		print("user defined exception:", err.message)
```

## Q3


```python
class OurException(Exception):
	def __init__(self,message):
		self.message=message
class usinguserexception:
	try:
		a=int(input("a: "))
		b=int(input("b: "))
		if b==0:
			raise OurException("b should be greater than 0")
		d=a/b
		print("division operation successful with result:",d)
	except OurException as err:
		print("user defined exception:",err.message)
```
