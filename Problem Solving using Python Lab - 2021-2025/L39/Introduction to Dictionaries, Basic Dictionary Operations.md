# Introduction to Dictionaries


## Q1

◻ The keys in a dictionary can be mutable.

◻ The values in a dictionary have to be immutable.

✅ A dictionary is collection of disordered elements and each element is in the form a Key and a Value pair.

◻ A tuple can be a key, if they only contain strings, numbers and lists.

✅ The dict() function is used to construct a dictionary.

## Q2

◻ The elements in a dictionary can be either keys or values but not both.

◻ The indexing operator [] is used to access a key using the value as the parameter inside the indexing operator.

✅ A value in a dictionary can be updated using the indexing operator along with the key.

✅ A For loop is used to iterate the elements of a dictionary.

◻ Deleting an element in a dictionary only deletes the value but not the key.

# Basic Dictionaries Operations

## Q1

✅ In Python 3 zip() function returns an iterator of tuples true or false?

✅ If there is no arguments zip() function returns an empty iterator.

◻ While creating dictionaries we need only keys.

✅ sorted(dict.items()) function prints the arguments in sorted order.

## Q2


```python
s1=input("data1: ")
s2=input("data2: ")
l1=s1.split(",")
l2=s2.split(",")
d={}
print("list1:",l1)
print("list2:",l2)
d=dict(zip(l1,l2))
d=sorted(d.items())
print("dictionary:",d)
```

## Q3


```python
s1=input("data1: ")
s2=input("data2: ")
l1=s1.split(",")
l2=s2.split(",")
n1=len(l1)
n2=len(l2)
d={}
if(n1==n2):
	d=dict(zip(l1,l2))
	d=sorted(d.items())
	print(d)
else:
	print("length should be equal")
```

## Q4


```python
s1=input("data1: ")
s2=input("data2: ")
n=input("key: ")
l1=s1.split(",")
l2=s2.split(",")
d={}
d=dict(zip(l1,l2))
print("value:",d.get(n))
```

## Q5


```python
s1=input("data1: ")
s2=input("data2: ")
l1=s1.split(",")
l2=s2.split(",")
d={}
d=dict(zip(l1,l2))
n=input("key: ")
print(n in d)
```

## Q6


```python
s1=input("data1: ")
s2=input("data2: ")
l1=s1.split(",")
l2=s2.split(",")
d={}
d=dict(zip(l1,l2))
d=sorted(d.items())
for key,value in d:
	print(key,value)
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
for key,value in d:
	print(key,"->",value)
```

## Q8


```python
s1=input("data1: ")
s2=input("data2: ")
l1=s1.split(",")
l2=s2.split(",")
d={}
d=dict(zip(l1,l2))
n=input("key: ")
c=0
for i in range(len(l1)):
	if(l1[i]==n):
		c=i
m=int(n)
if n in l1:
	print("value:",l2[c])
	del d[n]
	d=sorted(d.items())
	print("dictionary:",d)
else:
	print("key does not exist")
```

## Q9


```python
s1=input("data1: ")
s2=input("data2: ")
l2=s2.split(",")
l2=sorted(l2)
l1=s1.split(",")
for i in range(len(l1)):
	l1[i]=int(l1[i])
l1=sorted(l1)
for i in range(len(l1)):
	l1[i]=int(l1[i])
mx=str(max(l1))
mn=str(min(l1))
for i in range(len(l1)):
	l1[i]=str(l1[i])
d={}
d=dict(zip(l1,l2))
print("max:",d[mx])
print("min:",d[mn])
```

## Q10


```python
s1=input("data1: ")
s2=input("data2: ")
l1=s1.split(",")
l2=s2.split(",")
d={}
d=dict(zip(l1,l2))
n=input("key: ")
if n in l1:
	m=input("value: ")
	d[n]=m
	d=sorted(d.items())
	print("sorted dictionary:",d)
else:
	print("key does not exist")
```
