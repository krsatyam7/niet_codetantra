# List Methods


## Q1


```python
c=input("data1: ")
l=c.split(",")
a=input("element: ")
l.append(a)
print("after append:",l)
c1=input("data2: ")
l1=c1.split(",")
l.append(l1)
print("after append:",l)
l.extend(l1)
print("after extending:",l)
```

## Q2


```python
c=input("data: ")
l=c.split(",")
l.reverse()
print("reverse:",l)
```

## Q3


```python
s=input("data: ")
n=int(input("element: "))
l=s.split(",")
count=0
for i in range(len(l)):
	l[i]=int(l[i])
	if(l[i]==n):
		count=count+1
print(n,"occurs",count,"times")
```

## Q4


```python
s=input("data: ")
l=s.split(",")
s=0
for i in range(len(l)):
	l[i]=int(l[i])
	s=s+l[i]
print("sum:",s)
```

## Q5


```python
s=input("data: ")
l=s.split(",")
for i in range(len(l)):
	l[i]=int(l[i])
print("list:",l)
n=int(input("num: "))
flag=0
for i in range(len(l)-1):
		if(l[i]==l[i+1]):
			flag=1
if(flag==1):
	print("True")
else:
	print("False")
```

## Q6


```python
s1=input("data: ")
s2=input("seq of elements: ")
l1=s1.split(",")
l2=s2.split(",")
n1=len(l1)
n2=len(l2)
c=0
for i in range(n2):
	for j in range(n1):
		if(l2[i]==l1[j]):
			c=c+1
if(c==n2):
	print("exist")
else:
	print("does not exist")
```

## Q7


```python
s=input("data: ")
l=s.split(",")
print("odd index elements: [",end='')
c=0
for i in range(len(l)):
	if(i%2!=0):
		c=c+1
		print("{}".format(l[i]),end='')
		if(c<(len(l)//2)):
			print(", ",end='')
print("]")
```

## Q8


```python
s1=input("Please enter A in upper case: ")
s2=input("Please enter A in lower case: ")
i=ord('A') 
j=ord('a') 
alpha=[] 
for k in range(26):
	alpha.append(chr(i)) 
	alpha.append(chr(j))
	i=i+1 
	j=j+1
print(alpha)
```

## Q9


```python
s=input("data: ")
l=s.split(",") 
c=0 
for i in range(len(l)-1):
	if(l[i]<l[i+1]):
		c=c+1
if(c!=3 and c!=5 and c!=0 and c<=len(l)-1):
	print("True")
else:
	print("False")
```

## Q10


```python
s=input("Please enter a sentence: ")
s=s.lower()
s=sorted(s)
ss=[]
for u in s:
	if(u.isalpha()):
		ss.append(u)
c=0
n=len(ss)
l=[]
p=0
for i in ss:
	for j in range(n):
		if i==ss[j]:
			c=c+1
	if(i not in l):
		print("{} \t {}".format(i,c))
		l.append(i)
	c=0
```

## Q11


```python
n=int(input("size: "))
l=[]
for i in range(n):
	e=input("element: ")
	l.append(e)
print("list:",l)
```
