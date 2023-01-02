# Math



## Q1

✅ The math module provides access to the mathematical functions defined by C.

◻︎ The functions of math module can be used with complex numbers.

✅ Most of the functions of math module return float values.

✅ The cmath module has functions of the same name as math module, but they work on complex numbers.

## Q2


```python
import math
x = 10
# find factorial of x and print the result
print("Factorial of",x,math.factorial(x))
# find math.floor and print the result
print("Floor of ",x,math.floor(x))
# add x three times and print the result
print("Sum of",x,"three times",float(3*x))
a = 5
b = 6
# find GCD of a and b and print the result
print("GCD of {} and {} {}".format(a,b,math.gcd(a,b)))
# find math.isfinite and print the result
print("Is {} a finite number: {}".format(x,math.isfinite(x)))
# find math.isinf and print the result
print("Is {} a infinite number: {}".format(x,math.isinf(x)))
```

## Q3


```python
import math
n=int(input("x: "))
print("factorial:",math.factorial(n))
print("floor:",math.floor(n))
print("sum three times",float(3*n))
a=int(input("a: "))
b=int(input("b: "))
print("gcd:",math.gcd(a,b))
```

## Q4


```python
import math
n=int(input("x: "))
# write your code here
print("exponent:",math.exp(n))
print("math.log1p:",math.log1p(n))
print("math.log2:",math.log2(n))
print("math.log10:",math.log10(n))
print("square root:",math.sqrt(n))
a=int(input("a: "))
b=int(input("b: "))
print("power:",math.pow(a,b))
```

## Q5


```python
import math as m
x=int(input("x: "))
print("exponent:",m.exp(x))
print("math.log2:",(m.log2(x)))
print("math.log10:",m.log10(x))
print("square root:",m.sqrt(x))
a=int(input("a: "))
b=int(input("b: "))
print("power:",m.pow(a,b))
```

## Q6


```python
import math
xinrad = int(input("num: "))
x = math.pi / xinrad
print("arc cosine:", math.acos(x))
print("arc sine:", math.asin(x))
print("arc tangent:",math.atan(x))
print("cosine:", math.cos(x))
print("sine:",math.sin(x))
print("tangent:",math.tan(x))
a = int(input("a: "))
b = int(input("b: "))
print("value of atan2({}, {}): {}".format(b,a,math.atan2(b,a)))
print("value of hypot({}, {}): {}".format(a,b,math.hypot(a,b)))
```

## Q7


```python
import math
# take the integer input from the user
x=int(input("x: "))
print("inverse hyperbolic cosine:", math.acosh(x))
print("inverse hyperbolic sine:",math.asinh(x))
# follow the above print statement while writing
print("hyperbolic cosine:",math.cosh(x))
print("hyperbolic sine:",math.sinh(x))
print("hyperbolic tangent:",math.tanh(x))
```

## Q8


```python
import math
x=int(input("x: "))
print("angle to degrees:",math.degrees(x))
print("angle to radians:",math.radians(x))
```
