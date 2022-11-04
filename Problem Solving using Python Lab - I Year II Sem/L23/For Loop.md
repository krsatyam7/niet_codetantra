# For Loop

## Q1


```python
#Program to illustrate simple for loop
numbers = [1, 10, 20, 30, 40, 50]
sum = 0
#  Find sum of all the numbers using for loop 
for i in numbers:
    sum=sum+i
print ("The sum of numbers is",sum) # print sum here

colors = ['red', 'orange', 'green', 'yellow', 'white', 'violet']
for c in colors:
    print(c)
```

## Q2


```python
#Program to illustrate simple range function
num=int(input("num: "))

for i in range(1, num + 1, 2):
    print(i)
```

## Q3


```python
'''# Multiplication table
x = int(input("Enter the number for which you want the multiplication table: "))
y = int(input("Enter the number of rows in the multiplication table: "))
print("Muliplication table for", x)

# Fill in the missing code below to print a multiplication table for x upto y rows.
# If y is more than 20, print the relevant message as per instructions and limit the number of rows to 20
for i in range(1,y+1,1):'''

# fresh code 
x = int(input("x: "))
y = int(input("y: "))
for i in range(1,y+1,1):
    if i<=20:
        s=x*i
        print("{} * {} = {}".format(x,i,s))
if i<=20:
    print()
else:
    print("rows is limited to 20")

```

## Q4


```python
matrix = [[1, 2, 3, 4], [5, 6, 7, 8], [9, 10, 11, 12]]
print("matrix:",matrix)
# find the transpose of the matrix and print the result as shown in the example above
result= [[0,0,0],[0,0,0],[0,0,0],[0,0,0]]
for i in range(len(matrix)):
    for j in range (len(matrix[0])):
        result[j][i]=matrix[i][j]
print("transposed:",result)
```

## Q5


```python
n=int(input("n: "))
s=0
l=[]
for i in range (1,n):
    if n%i==0:
        s=s+i
        l.append(i)
print("factors:".format(n),l)
if n==s:
    print("perfect number")
else:
    print("not perfect number")
```

## Q6


```python
#Program to print value of pi 1 to 25 decimals
import math
pi = math.pi
n=int(input("n: "))
for i in range (1,n+1):
    print("{:.{}f}".format(pi,i))
```

## Q7


```python
n=input("str: ")
if n.count("(")==n.count(")"):
    d=n.count("(")
    print("valid and depth:",d)
else:
    e=n.count("(")-n.count(")")
    if e>0:
        e1=e
    else:
        e1=e*(-1)
    print("not valid and errors:",e1)
```
