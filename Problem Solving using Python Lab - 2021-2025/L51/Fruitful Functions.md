# Fruitful Functions



## Q1

✅ A fruitful function is a function, it returns a value when it is called.
✅ A return statement consists of the return keyword followed by an expression.
✅ Python returns immediately when it reaches a return statement .
◻ Any statement after return is executed after the value is returned.

## Q2


```python
def largestinthree(a, b, c):
	# write your code here to find the largest number in a, b and c
	if(a>b and a>c):
		return a
	elif(b>a and b>c):
		return b
	else:
		return c
num1 = int(input("Please enter a value for num1: "))
num2 = int(input("Please enter a value for num2: "))
num3 = int(input("Please enter a value for num3: "))
result = largestinthree(num1, num2, num3)
print("Largest of the values entered is", result)
```

## Q3


```python
def largestintwo(a, b):
# write your code here	
	if(a>b):
		return a
	if(b>a):
		return b
num1=int(input("num1: "))
num2=int(input("num2: "))
result = largestintwo(num1, num2)
print("largest:", result)

```

## Q4


```python
import math
def computeGCD(x, y):
	r=math.gcd(x,y)
	return r
a=int(input("x: "))
b=int(input("y: "))
print(computeGCD(a, b))
```
