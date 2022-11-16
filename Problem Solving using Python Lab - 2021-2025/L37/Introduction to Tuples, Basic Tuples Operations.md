# Introduction to Tuples


## Q1

✅ A Tuple is an mutable list.

◻ Tuples are slower when compared to lists.

✅ Tuples can be used as keys in dictionaries.

✅ Elements of a tuple are enclosed in parenthesis.

◻ Addition and deletion of elements is possible in a tuple.

✅ It is possible to create tuples which contain mutable objects, such as lists.

## Q2


```python
s=input("data: ")
print("list:",s.split(","))
print("tuple:",tuple(s.split(",")))
```

# Basic Tuples Operations

## Q1

◻ A tuple can be created using the list function.

◻ Trying to access an element equivalent to the length of a tuple returns the last element in the tuple.

✅ The result of a concatenation of two tuples when assigned to one of the tuple creates a new tuple.

✅ The result of a repetition of a tuple when assigned to the same tuple will result in a new tuple.

◻ The membership and comparison operations on tuples result return a boolean value YES or NO.

## Q2


```python
s=input("data: ")
print("list:",s.split(","))
print("tuple:",tuple(s.split(",")))
n=int(input("index: "))
l=s.split(",")
if(n<len(l)):
	print("element:",l[n])
else:
	print("enter valid index")
```

## Q3

◻ The output of the following code: ('ac') * 2 is ('ac', 'ac').

✅ The output of the following code: ('ac',) * 2 is ('ac', 'ac').

✅ (1, 2, 3) > (1, 0, 3) is True.

◻ t1 = tuple({1:10, 2:20}) will result in (10, 20).

## Q4


```python
s=input("data1: ")
n=int(input("value: "))
t=tuple(s.split(","))
print("tuple * ",n,"=",t*n)
s=input("data2: ")
u=tuple(s.split(","))
print("concatenation:",t+u)
```

## Q5


```python
s=input("data: ")
t=tuple(s.split(","))
print("tuple:",t)
n=input("value: ")
if(n in t):
	print("True")
else:
	print("False")
```

## Q6


```python
mytup= ('a', 'b', 'c', 'd')
print("mytup =", mytup)
tup=[1, 2, 3]
mytup=list(mytup)
mytup.append(tup)
mytup=tuple(mytup)
print("mytup =", mytup)
print("mytup[4][1] = 4")
mytup[4][1]=4
print("mytup =", mytup)
```

## Q7


```python
mytup = ('a', 'b', 'c', 'd', [1, 2, 3])
print("mytup =", mytup)
print("del mytup[4][2]")
del mytup[4][2]
print("mytup =", mytup)
print("del mytup[4] will give TypeError")
```

## Q8


```python
s=input("data: ")
t=s.split(",")
n=int(input("index: "))
if(n>=0 and n<len(t) or n<0 and n>=-len(t)+1):
	m=input("value: ")
	t[n]=m
	print("tuple:",tuple(t))
else:
	print("enter valid index")
```

## Q9


```python
s=input("data: ")
l=s.split(",")
print("tuple:",tuple(l))
n=int(input("index: "))
if(n>=0 and n<len(l) or n<0 and n>-len(l)):
	c=l[n]
	del l[n]
	print("after removing:",tuple(l))
else:
	print("enter valid index")
```

## Q10


```python
s1=input("data1: ")
s2=input("data2: ")
if(s1==s2):
	print("True")
else:
	print("False")
```

## Q11


```python
s=input("data: ")
n=input("element: ")
l=s.split(",")
ln=len(l)
if(n in s):
	print("before deletion:",tuple(l))
	for i in range(ln):
		m=l[i-1]
		if(m==n):
			del l[i-1]
	print("after deletion:",tuple(l))
else:
	print("enter existed element")
```

## Q12


```python
s=input("data: ")
l=int(input("start index: "))
u=int(input("end index: "))
li=s.split(",")
if(u>=0 and u<len(li) or u<0 and u>-len(li)):
	print("tuple in given range:",tuple(li[l:u]))
else:
	print("enter valid index")
```
