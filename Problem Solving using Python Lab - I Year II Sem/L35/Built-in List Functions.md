# Built-in List Functions

## Q1


```python
c=input("data: ")
a=c.split(",")
b=map(int,a)
l=list(b)
print("length:",len(l))
print("list enumerate:",list(enumerate(l)))
print("max:",max(l))
print("min:",min(l))
print("list:",sorted(l))
```

## Q2


```python
c=input("data: ")
l=c.split(",")
a=max(l)
b=min(l)
print("min:",b)
print("max:",a)
print("difference:",int(a)-int(b))
```

## Q3


```python
c=input("data: ")
l=c.split(",")
b=map(int,l)
l1=list(b)
print("sum:",sum(l1))
```

## Q4


```python
c=input("data: ")
a=c.split(",")
b=map(int,a)
l=list(b)
print("list:",l)
print("sum:",sum(l))
r=[]
for i in l:
	s=i**2
	r.append(s)
print("squares:",r)
print("sum of squares:",sum(r))
```

## Q5


```python
import json
a=input("data1: ")
b=input("data2: ")
l1=a.split(",")
l2=b.split(",")
if len(l1)==len(l2):
	print("{",end="")
	for i in range (len(l1)-1):
		print("'"+str(l1[i])+"':'"+str(l2[i])+"',",end="")
	l=len(l1)
	print("'"+str(l1[l-1])+"':'"+str(l2[l-1])+"'}")
else:
	print("lists are different lengths")
```

## Q6


```python
a=input("data1: ")
b=input("data2: ")
l1=a.split(",")
l2=b.split(",")
c1=map(int,l1)
c2=map(int,l2)
k1=list(c1)
k2=list(c2)
r=[]
if len(k1)==len(k2):
	for i in range (len(k1)):
		d=(k1[i])-(k2[i])
		r.append(d)
	print(r)
else:
	print("lists are different lengths")
```
