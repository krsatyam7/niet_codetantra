# Handling an Exception



## Q1

✅ A try block can have more than one except block, each block handling a type of Exception.

✅ Based on the Exception/error that has been generated, the except block that is written to handle that exception is invoked.

◻︎ A try block can have an else block or finally block, only either one of them.

✅ Finally block is executed in the case of exceptions or no exceptions.

## Q2


```python
try:
	a=int(input("a: "))
	b=int(input("b: "))
	a=a+b
	a=a/b
	a=a*b
	a=a-b
	
	# take user inputs a and b and perform arithmetic operations
	if a == 0:
		f = fun1(a)
	# print here	
	print("try successful")
except ZeroDivisionError:
	# print here
	print("zero division error occurred")
	 
except NameError:
	# print here
	print("name error occurred")
except Exception:
	print("exception occurred")
	# print here
def fun1(n):
	print(n)
```

## Q3


```python
try:
	a=int(input("a: "))
	b=int(input("b: "))
	a=a+b
	a=a/b
	a=a*b
	a=a-b
	if a==0:
		f=fun1(a)
	print("try successful")
except ZeroDivisionError:
	print("zero division error occurred")
except NameError:
	print("name error occurred")
except Exception:
	print("exception occurred")
def fun1(n):
	print(n)
```

## Q4

✅ It is good way of programming to write exception handling for a few lines of code.

✅ An advantage of exception handling is it separates normal code and exception handling code.

✅ Exceptions are passed from functions in the stack until they reach a function that knows how to handle them.

◻︎ Every function in the stack needs the exception handling code.

# Try-finally Clause


## Q1

✅ finally block will be executed whatever the outcome that happens in the try block.

✅ finally block is written after all the except blocks.

◻︎ finally block is executed in only in the case of exceptions.

## Q2


```python
try:
 	# take user inputs a and b and perform arithmetic operations
	a=int(input("a: "))
	b=int(input("b: "))
	c=a+b
	d=a/b
	print("try successful")
except ArithmeticError:
		# print here
	print("arithmetic error occurred ")
except Exception:
			# print here
	print("exception occurred")
finally:
	print("executed in any condition")
```

## Q3


```python
try:
	# take user inputs a and b and perform arithmetic operations
	a=int(input("a: "))
	b=int(input("b: "))
	c=a+b
	d=a/b
	print("try successful {} {}".format(c,d))
except Exception:
		# print here
	print("exception occurred")
finally:
	print("executed in any condition")
```
