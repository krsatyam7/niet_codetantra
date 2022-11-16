# While Loop

## Q1


```python
n=int(input("num: "))
sum=0
i=2
while i<=n:
    if i%2==0:
        sum=sum+i
        i=i+2
print("sum:",sum)
exit()
```

## Q2


```python
# Python program to find the sum of integers between 0 and n where n is provided by user
n=int(input("num: "))
sum=0
if n<0:
    for i in range(n,0):
        sum=sum+i
else:
    for i in range(0,n+1):
        sum=sum+i
        # i=i-1
print("sum:",sum)
```

## Q3


```python
import math
n=int(input("x: "))
m=int(input("y: "))
if n!=0 and m!=0:
    print("gcd:",math.gcd(n,m))
else:
    print("value must be non zero")
```

## Q4


```python
n=int(input("k: "))
f1=0
f2=1
sum=0
print(f1)
for i in range (1,n+1):
    print(f2)
    f3=f2+f1
    f1=f2
    f2=f3
    if f2>n:
        break
    if i%2!=0:
        sum=sum+f2
print("sum:",sum)
```

## Q5


```python
n=int(input("k: "))
for i in range(0,n):
    if i%2==0:
        print(i,"even number")
    else:
        print(i,"odd number")
exit()
```

## Q6


```python
'''st2cap = dict()
state = input("Enter the state or 'end' to quit: ")
'''
st2cap = dict()
state = input("state or 'end' to quit: ")
# write your logic using while loop
if state=="end":
    print("[]")
while state !="end":
    capital=input("capital: ")
    st2cap[state]=capital
    state=input("state: ")
    if state =="end":
        print(sorted(st2cap.items()))
        break
'''
print(sorted(st2cap.items()))
'''
```
