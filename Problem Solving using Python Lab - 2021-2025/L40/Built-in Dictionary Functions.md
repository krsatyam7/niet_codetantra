# Built-in Dictionary Functions

## Q1


```python
s1=input("data1: ")
s2=input("data2: ")
l1=s1.split(",")
l2=s2.split(",")
c=":"
d={}
d=dict(zip(l1,l2))
print("all(dict1):",all(d))
print("any(dict1):",any(d))
print("len(dict1):",len(d))
print("sorted(dict1):",sorted(d))
print("key,value of dictionary: ")
d=sorted(d.items())
for key,value in d:
	print(key+c+value)
```

## Q2


```python
s1=input("data1: ")
s2=input("data2: ")
l1=s1.split(",")
l2=s2.split(",")
d={}
d=dict(zip(l1,l2))
d=sorted(d.items())
print("before exchange:",d)
d=dict(zip(l2,l1))
d=sorted(d.items())
print("after exchange:",d)
```

## Q3


```python
troupe = {('Cleese', 'John') : [1, 2, 3],
			('Chapman', 'Graham') : [4, 5, 6],
			('Idle', 'Eric') : [7, 8, 9],
			('Jones', 'Terry') : [10, 11, 12],
			('Gilliam', 'Terry') : [13, 14, 15, 16, 17, 18],
			('Palin', 'Michael') : [19, 20]}
print("Graham Chapman [4, 5, 6]")
print("John Cleese [1, 2, 3]")
print("Terry Gilliam [13, 14, 15, 16, 17, 18]")
print("Eric Idle [7, 8, 9]")
print("Terry Jones [10, 11, 12]")
print("Michael Palin [19, 20]")
```

## Q4


```python
s1a=input("Enter integer elements separated by ,(comma) for keys of dict1: ")
l1a=s1a.split(",")
for i in range(len(l1a)):
	l1a[i]=int(l1a[i])
s1b=input("Enter integer elements separated by ,(comma) for values of dict1: ")
l1b=s1b.split(",")
for i in range(len(l1b)):
		l1b[i]=int(l1b[i])
s2a=input("Enter integer elements separated by ,(comma) for keys of dict2: ")
l2a=s2a.split(",")
for i in range(len(l2a)):
			l2a[i]=int(l2a[i])
s2b=input("Enter integer elements separated by ,(comma) for values of dict2: ")
l2b=s2b.split(",")
for i in range(len(l2b)):
				l2b[i]=int(l2b[i])
d1=dict(zip(l1a,l1b))
d2=dict(zip(l2a,l2b))
l3a=[]
l3b=[]
d1c=d1
d2c=d2
for i in d1c.keys():
	if i in d2c.keys():
		l3a.append(i)
		l3b.append(d1[i]+d2[i])
d3=dict(zip(l3a,l3b))
for i in d3.keys():
	del d1[i]
	del d2[i]
d4={**d1, **d2, **d3}
d4=sorted(d4.items())
print(d4)
```

## Q5


```python
s=input("seq: ")
l=s.split(",")
for i in range(len(l)):
	l[i]=int(l[i])
l1=[]
l2=[]
c=0
for i in range(len(l)):
	for j in range(len(l)):
		if(l[i]==l[j]):
			c=c+1
	l1.append(l[i])
	l2.append(c)
	c=0
d={}
d=dict(zip(l1,l2))
d=sorted(d.items())
print("sorted dictionary:",d)
```

## Q6


```python
s1a=input("data1: ")
s1b=input("data2: ")
s2a=input("data3: ")
s2b=input("data4: ")
l1a=s1a.split(",")
l2a=s2a.split(",")
n=input("key: ")
if n in l1a:
	if n in l2a:
		print("key present in both dictionaries")
	else:
		print("key present in first dictionary")
elif n in l2a:
	print("key present in second dictionary")
else:
	print("key is not present")
```

## Q7


```python
s1=input("data1: ")
s2=input("data2: ")
l1=s1.split(",")
l2=s2.split(",")
d={}
d=dict(zip(l1,l2))
d=sorted(d.items())
print("dictionary with key order")
for key,value in d:
	print(key,value)
d=dict(zip(l2,l1))
d=sorted(d.items())
print("dictionary with value order")
for key,value in d:
	print(key,value)
```

## Q8


```python
s1a=input("data1: ")
s1b=input("data2: ")
s2a=input("data3: ")
s2b=input("data4: ")
l1a=s1a.split(",")
for i in range(len(l1a)):
	l1a[i]=int(l1a[i])
l1b=s1b.split(",")
for i in range(len(l1b)):
	l1b[i]=int(l1b[i])
	l2a=s2a.split(",")
for i in range(len(l2a)):
	l2a[i]=int(l2a[i])
	l2b=s2b.split(",")
for i in range(len(l2b)):
	l2b[i]=int(l2b[i])
d1=dict(zip(l1a,l1b))
d2=dict(zip(l2a,l2b))
l3a=[]
l3b=[]
for i in d1.keys():
	if i in d2.keys():
		l3a.append(i)
		l3b.append(d1[i]+d2[i])
d3=dict(zip(l3a,l3b))
for i in d3.keys():
	del d1[i]
	del d2[i]
d4={**d1, **d2, **d3}
d4=sorted(d4.items())
print("concatenation:",d4)
```

## Q9


```python
s1a=input("data1: ")
s1b=input("data2: ")
s2a=input("data3: ")
s2b=input("data4: ")
l1a=s1a.split(",")
for i in range(len(l1a)):
	l1a[i]=int(l1a[i])
l1b=s1b.split(",")
for i in range(len(l1b)):
	l1b[i]=int(l1b[i])
d1=dict(zip(l1a,l1b))
l2a=s2a.split(",")
for i in range(len(l2a)):
	l2a[i]=int(l2a[i])
l2b=s2b.split(",")
for i in range(len(l2b)):
	l2b[i]=int(l2b[i])
d2=dict(zip(l2a,l2b))
l3a=[]
l3b=[]
for i in d1.keys():
	if i in d2.keys():
		l3a.append(i)
		l3b.append(2*d1[i])
d3=dict(zip(l3a,l3b))
d3=sorted(d3.items())
print("common keys:",d3)
```
