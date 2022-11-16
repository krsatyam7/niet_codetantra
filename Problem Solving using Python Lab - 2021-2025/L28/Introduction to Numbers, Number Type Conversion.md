# Introduction to Numbers

## Q1


```python
# find quotient using '/' and '//' like (a/b) and (a//b)
a=int(input("a: "))
b=int(input("b: "))
print("{} / {} =".format(a,b),a/b)
print("{} // {} =".format(a,b),a//b)
print("{} % {} =".format(a,b),a%b)
```

## Q2


```python
a=complex(input("c1: "))
b=complex(input("c2: "))
print("a1 + b2 =",a+b)
print("a1 - b2 =",a-b)
print("a1 * b2 =",a*b)
print("a1 / b2 =",a/b)
```

# Number Type Conversion

## Q1


```python
# Type Conversion Example
a = '0111110'
b=int(a,2)
c=float(b)
d=complex(b)
print("converting to int:",b,",data type:",type(b))
print("converting to float:",c,",data type:",type(c))
print("converting to complex:",d,",data type:",type(d))
```

## Q2


```python
n=int(input("x: "))
b=bin(n)
o=oct(n)
h=hex(n)
print("Decimal:",n,"")
print("Binary:",b,"")
print("Octal:",o,"")
print("Hexadecimal:",h)
```
