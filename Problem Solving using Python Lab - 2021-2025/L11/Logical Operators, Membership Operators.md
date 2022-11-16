# Logical Operators





## Q1

◻ In logical operators, 1 represents False and 0 represents True.

✅ In logical and the result is true if the both operands are true.

## Q2


```python
x=input("M or F: ")
y=int(input("age: "))
if (x=="M") and y>=65:
    print("Eligible for Concession")
elif (x=="F") and y>=60:
    print("Eligible for Concession")
else:
    print("Not Eligible for Concession")
```

## Q3


```python
# write your code here
x=int(input("a: "))
y=int(input("b: "))
z=int(input("c: "))
if (x==y==6) and z!=6:
    print("True")
else:
    print("False")
```

## Q4


```python
# Program to illustrate logical and
a = int(input("a: "))
b = int(input("b: "))
if(a==6 or b==6 or a+b==6 or a-b==6):
    print("True")
else:
    print("False")
```

## Q5


```python
# Program to illustrate logical not
x=input("Enter day: ")
if not(x=="SAT" or x=="SUN"):
    print("Not Weekend")
else:
    print("Weekend")
```

# Membership Operators


## Q1

✅ in and not in operators check the existence of a member in a collection.

◻ in operator can be used with numbers.

✅ if in operator returns False, not in operator will return True.

◻ you can check for the existence of multiple members in a list with a single in operator.

✅ An empty string is part of every other string.

## Q2


```python
x=input("str1: ")
y=input("str2: ")
print(y,"in",x,":",y in x)
```

## Q3


```python
#Program to illustrate in and not in for strings
x=input("str1: ")
y=input("str2: ")
print(y,"in",x,"is:",y in x)
print(y,"not in",x,"is:",y not in x)
```

## Q4


```python
# Program to illustrate membership
L1 = ['A', '123', 'Ramana', [1, 2], 34.56, '55']
# for 34.56 returns False as output because input() return type is True so it converts 34.56 as string.

# write your code here
print(L1)
x=input("element: ")
print(x,"in",L1,"is:",x in L1)
print(x,"not in",L1,"is:",x not in L1)
```
