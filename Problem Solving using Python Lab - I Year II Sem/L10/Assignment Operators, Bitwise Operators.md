# Assignment Operators




## Q1


```python
n=int(input("x: "))
m=int(input("y: "))
a=n
b=m
n+=m
print("x += y: x =",n,"and y =",m)
n,m=a,b
n-=m
print("x -= y: x =",n,"and y =",m)
n,m=a,b
n*=m
print("x *= y: x =",n, "and y =",m)
n,m=a,b
n=n/m
print("x /= y: x =",n, "and y =",m)
n,m=a,b
n=n**m
print("x **= y: x =",n, "and y =",m)
n,m=a,b
n=n//m
print("x //= y: x =",n, "and y =",m)
n,m=a,b
n=n%m
print("x %= y: x =",n, "and y =",m)
n=m
print("x = y: x =",n, "and y =",m)
```

## Q2


```python
# Assignment Operators =, +=, -=, *=
n=int(input("x: "))
m=int(input("y: "))
a=n
b=m
n=m
print("x = y:",n)
n,m=a,b
n+=m
print("x += y:",n)
n,m=a,b
n-=m
print("x -= y:",n)
n,m=a,b
n*=m
print("x *= y:",n)
```

## Q3


```python
# Assignment Operators  /= , %=, **=, //=
n = int(input("x: "))
m = int(input("y: "))
a=n
b=m
n/=m
print('x /= y:' , n)
n,m=a,b
n%=m
print ('x %= y:' , n)
n,m=a,b
n**=m
print ('x **= y:' , n)
n,m=a,b
n//=m
print ('x //= y:' , n)
```

# Comparison Operators


## Q1

✅ In (NOT) ~ Bits that are 0 become 1, and those that are 1 become 0.

◻ Numbers can be used in only one form.

◻ Bitwise Operators take Two operands and operate them together.

## Q2


```python
#Program to illustrate bit wise operators >>, <<
n=int(input("x: "))
m=int(input("y: "))
x=n>>m
print(n,">>",m,"is",x)
y=n<<m
print(n,"<<",m,"is",y)
```

## Q3


```python
#Program to illustrate the bitwise operators &, |
x=int(input("x: "))
y=int(input("y: "))
print("{} & {}:".format(x,y),x&y)
print("{} | {}:".format(x,y),x|y)
```

## Q4

✅ One's complement converts 0's into 1's and 1's into 0's.

◻ One's complement is represented with @ symbol.

◻ If the binary number is 100110 then its one's complement is 011101.

✅ One's complement of the short int value 2 is 11111101.

## Q5


```python
#Program to illustrate bitwise operators ~, ^
x=int(input("x: "))
y=int(input("y: "))
print("~ {}:".format(x),~x)
print("{} ^ {}:".format(x,y),x^y)
```

## Q6


```python
x=int(input("x: "))
y=int(input("y: "))
print("{} >> {} is".format(x,y),x>>y)
print("{} << {} is".format(x,y),x<<y)
print("{} & {} is".format(x,y),x&y)
print("{} | {} is".format(x,y),x|y)
print('~ {} is'.format(x),~x)
print("{} ^ {} is".format(x,y),x^y)
```

## Q7


```python
x=int(input("num1: "))
y=int(input("num2: "))
c=((-y)+x)
print("difference:",c)
```
