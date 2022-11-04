# Different Data types

## Q1


```python
n=int(input("num: "))
x=0
list=[]
for i in range(1,n):
    if n%i==0:
        x=x+i
        list.append(i)
print("factors:",list)
print("sum:",x)
if x==n:
    print("perfect number")
elif x>n:
    print("abundant number")
else:
    print("deficient number")
```

## Q2


```python
n=int(input("num: "))
temp=n
sum=0
while n>0:
    rem=n%10
    sum=sum+rem
    n=n//10
print("sum:",sum)
```

## Q3


```python
n=int(input("num: "))
if n>1:
    for i in range (2,n):
        if n%i==0:
            print("not a prime number")
            break
    else:
        print("prime number")
else:
    print("not a prime number")
```

## Q4


```python
n=int(input("num: "))
t=n
sum=0
while (n):
    i=1
    f=1
    r=n%10
    while i<=r:
        f=f*i
        i+=1
    sum=sum+f
    n//=10
if sum==t:
    print("strong number")
else:
    print("not a strong number")
```
