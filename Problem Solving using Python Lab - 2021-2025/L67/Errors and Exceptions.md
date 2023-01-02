# Errors and Exceptions



## Q1

✅ Exception is an event which occurs to disrupt the flow of the given program.

✅ Exception handling is a rich feature provided by Python language.

◻︎ Python handles exceptions by using the try catch block.

✅ If the code executes without any error, the except block is skipped and control goes to the statement after the except block.

## Q2

✅ All exceptions should be instances of the derived class of the BaseException class.

✅ In the except block, if the exception is handled, it means it can also handle all the exception types that are derived from this Exception class.

◻︎ BaseException is generally used to derive user defined exceptions.

✅ All built-in exceptions are derived from the Exception class.

## Q3


```python
n1=int(input("num1: "))
n2=int(input("num2: "))
try:
	d=n1/n2
	print(d)
except:
	print("exception occurred")
```

## Q4

✅ The root exception class is the BaseException.

✅ SystemExit, KeyboardInterrupt, GeneratorExit and Exception extend from the BaseException.

✅ The Rest of the built-in classes are derived from The Exception class.

## Q5


```python
n1=int(input("num1: "))
n2=int(input("num2: "))
try:
	d=n1/n2
	print(d)
except:
	print("exception occured")
```

## Q6


```python
tryagain=True
while tryagain:
	try:
		value=int(input("whole number: "))
	except ValueError:
		print("you must enter a whole number!")
		try:
			again=input("try again (y/n)? ")
		except:
			print("OK, see you next time!")
			tryagain=False
		else:
			if(str.upper(again)=="N"):
				tryagain=False
	except KeyboardInterrupt:
		print("You pressed Ctrl+C!")
		print("See you next time!")
		tryagain=False
	else:
		print(value)
		tryagain=True
```
