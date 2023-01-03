# Import Statement

## Q1

### Module3.py


```python
import CheckNegative
n=int(input("x: "))
CheckNegative.CheckNegativeNumber(n)
```

### CheckNegative.py


```python
def CheckNegativeNumber(num):
	if(num < 0):
		print("negative")
	else:
		print("positive")
```

## Q2

### Module4.py


```python
import Module_Imp2
n1=int(input("a: "))
n2=int(input("b: "))
Module_Imp2.arithoperations(n1,n2)
```

### Module_Imp.py


```python
def arithoperations(num1, num2):
	print('addition:', num1 + num2)
	print('subtraction:', num1 - num2)
	print('multiplication:', num1 * num2)
	print('division:', num1 / num2)
```

## Q3

### Module5.py


```python
import Module_Imp2 as mi
n1=int(input("a: "))
n2=int(input("b: "))
mi.arithoperations(n1,n2)
```

### Module_Imp2.py


```python
def arithoperations(num1, num2):
	print('addition:', num1 + num2)
	print('subtraction:', num1 - num2)
	print('multiplication:', num1 * num2)
	print('division:', num1 / num2)
```

## Q4

### Module6.py


```python
import Module_Imp1 as mi
import Module_Imp2 as mii
n1=int(input("num1: "))
n2=int(input("num2: "))
mi.checkNegativeNumber(n1)
mi.checkNegativeNumber(n2)
mii.arithoperations(n1,n2)
```

### Module_Imp1.py


```python
def checkNegativeNumber(num):
	if(num < 0):
		print("negative")
	else:
		print("positive")
```

### Module_Imp2.py


```python
def arithoperations(num1, num2):
	print('addition:', num1 + num2)
	print('subtraction:', num1 - num2)
	print('multiplication:', num1 * num2)
	print('division:', num1 / num2)
```

## Q5

✅ If the import and imported files are in the same directory, then the interpreter does not need the sys path to be appended.

✅ The interpreter first searches the built-in module.

◻ If the file is not found in the current directory, it throws an error.
