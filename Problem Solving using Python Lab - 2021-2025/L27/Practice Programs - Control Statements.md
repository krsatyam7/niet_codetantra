# Practice Programs - Control Statements

## Q1


```python
n=int(input("n: "))
f1=0
f2=1
print(f1)
for i in range(1,n+1):
    print(f2)
    f3=f2+f1
    f1=f2
    f2=f3
    if(f2>n):
        break
```

## Q2


```python
x=int(input("x: "))
y=int(input("y: "))
for n in range(x,y+1):
    if n>x:
        for i in range (2,n):
            if n%i==0:
                break
        else:
            print(n)
```

## Q3


```python
n=int(input("n: "))
s=len(str(n))
sum=0
temp=n
while n>0:
    x=n%10
    sum=sum+(x**s)
    n=n//10
print("sum of powers:",sum)
if sum==temp:
    print("armstrong number")
else:
    print("not armstrong number")
```

## Q4


```python
n=input("ch: ")
v=['a','e','i','o','u','A','E','I','O','U']
if (n.isalpha() == True) and n in v:
    print("letter and vowel")
elif (n.isalpha()== True):
    print("letter and consonant")
else:
    print("not letter")
```

## Q5


```python
x,y,z=input("a,b,c: ").split(",")
a=int(x)
b=int(y)
c=int(z)
if a>b and a>c:
    print(a)
elif b>a and b>c:
    print(b)
else:
    print(c)
```

## Q6


```python
r=int(input("n: "))
n=1
for i in range (1,r+1):
    for j in range (1,i+1):
        print(n,end=" ")
        n+=1
    print()
```

## Q7


```python
n=int(input("rows: "))
l=[]
for i in range(n):
    l.append([])
    l[i].append(1)
    for j in range (1,i):
        l[i].append(l[i-1][j-1]+l[i-1][j])
    if n!=0:
        l[i].append(1)
for i in range(n):
    print(' ' * (n-i),end='',sep='')
    for j in range (0,i+1):
        print("{0:1}".format(l[i][j]),end=' ',sep='')
    print()
```
