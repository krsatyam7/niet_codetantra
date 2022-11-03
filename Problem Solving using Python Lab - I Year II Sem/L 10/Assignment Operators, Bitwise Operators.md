# Assignment Operators




## Q1


```python
n=int(input("Enter an integer value: "))
m=int(input("Enter a non zero integer value: "))
a=n
b=m
print("x =",n)
print("y =",m)
n+=m
print("After x += y: x =",n,"and y =",m)
n,m=a,b
n-=m
print("After x -= y: x =",n,"and y =",m)
n,m=a,b
n*=m
print("After x *= y: x =",n, "and y =",m)
n,m=a,b
n=n/m
print("After x /= y: x =",n, "and y =",m)
n,m=a,b
n=n**m
print("After x **= y: x =",n, "and y =",m)
n,m=a,b
n=n//m
print("After x //= y: x =",n, "and y =",m)
n,m=a,b
n=n%m
print("After x %= y: x =",n, "and y =",m)
n=m
print("After x = y: x =",n, "and y =",m)
```

## Q2


```python
# Assignment Operators =, +=, -=, *=
n=int(input("Enter an integer value: "))
m=int(input("Enter a non zero integer value: "))
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
n = int(input("Enter an integer value: "))
m = int(input("Enter a non zero integer value: "))
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
n=int(input("Enter an integer value: "))
m=int(input("Enter an integer value: "))
x=n>>m
print(n,">>",m,"is",x)
y=n<<m
print(n,"<<",m,"is",y)
```

## Q3


```python
#Program to illustrate the bitwise operators &, |
x=int(input("Enter an integer value: "))
y=int(input("Enter an integer value: "))
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
x=int(input("Enter an integer value: "))
y=int(input("Enter an integer value: "))
print("~ {}:".format(x),~x)
print("{} ^ {}:".format(x,y),x^y)
```

## Q6


```python
x=int(input("Enter an integer value: "))
y=int(input("Enter an integer value: "))
print("{} >> {} is".format(x,y),x>>y)
print("{} << {} is".format(x,y),x<<y)
print("{} & {} is".format(x,y),x&y)
print("{} | {} is".format(x,y),x|y)
print('~ {} is'.format(x),~x)
print("{} ^ {} is".format(x,y),x^y)
```

## Q7


```python
x=int(input("Enter number1: "))
y=int(input("Enter number2: "))
c=((-y)+x)
print("Subtraction of given two numbers using two's complement",c)
```
