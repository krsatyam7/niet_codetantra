# Introduction to Strings



## Q1


```python
s=input("str: ")
print(s)
```

# String Operations

## Q1


```python
str1 = "This is my first String"
# print the string
print(str1)
# print letter 'f' using Positive Index
print(str1[11])
# print letter 'S' using Negative Index.
print(str1[-6])
```

## Q2


```python
str = "How are you?"
print("String is", str)
# print 'are' in String using Slicing with Positive Index
print(str[4:7])
# print 'w a' in String using Slicing with Positive Index
print(str[2:5])
# print 'you' in String using Slicing with Negative Index
print(str[-4:-1:1])
# print 'uoy' in the string using slicing and Negative indexes and negative step
print(str[10:7:-1])
# print 'you?' in String using Slicing with Negative Index
print(str[-4:])
```

## Q3


```python
n=input("input: ")
s=len(n)
if s>=3:
    a=n[0:2]
    z=n[s-2:]
    print("output:",a+z)
else:
    print("output:",n)
```

## Q4


```python
n=input("str: ")
s=len(n)
a=n[1:s-1]
print("output:",a)
```

## Q5


```python
n=input("str: ")
s=len(n)
a=n[0:1]
m=n[1:s-1]
z=n[-1:-2:-1]
if s==0:
    print("null")
elif s==1:
    print(n)
else:
    print("output:",z+m+a)
```

## Q6


```python
a=input("str1: ")
b=input("str2: ")
print("result:",a+b*2+a)
```

## Q7


```python
a=input("str: ")
b=int(input("num: "))
s=len(a)
m=a[b:b+1]
if b<=s:
    n=a[:b]+a[b+1:]
    print("output:",n)
else:
    print("num should be positive, less than the length of the str")
```

## Q8


```python
a=input("str1: ")
b=input("str2: ")
print(a+" "+b)
```

## Q9


```python
a=input("str1: ")
b=input("str2: ")
a1=len(a)
b1=len(b)
i=a[1:]
l=b[1:]
if a1>1 and b1>1:
    print("output:",i+l)
else:
    print("null")

```

## Q10

◻ str = "Coding", r in str, returns True

◻ 's' in str, returns True

✅ 'z' not in str, returns True

## Q11


```python
n=input("str: ")
a=n[-1::-1]
print(n*4)
print(a*3)
```

## Q12


```python
n=input("str: ")
s=len(n)
if s>=3:
    a=n[0:3]
    print("result:",a*3)
else:
    print("result:",n)
```

## Q13


```python
a=input("str: ")
b=int(input("num: "))
print("result:",a*b)
```

## Q14


```python
a=input("str: ")
b=int(input("num: "))
s=len(a)
if b<s and b>=0:
    n=a[0:b:1]
    print("result:",b*n)
else:
    print("num should be positive, less than length of str")
```

## Q15

✅ Strings are Immutable (we can't assign or change the value)
                       
◻ We can perform deletion of part of a String using delete().
                       
◻ Deletion of individual characters of a string is possible based on index.
