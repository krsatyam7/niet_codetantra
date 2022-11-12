# Basic List Operations


## Q1

✅ l1 = [1, 20, 30, 40] index of l1 starts from 0.

◻ Lists are immutable we are unable to update the list.

◻ a = [100, 23, 32] print(a * 0) returns [100, 23, 32].

## Q2


```python
c=input("data: ")
l=c.split(",")
print("list:",l)
i=int(input("index: "))
s=len(l)
r=-(s+1)
if i>=0:
	if i < s:
		print("element:",l[i])
	else:
		print("invalid")
else:
	if i>r:
		print("element:",l[i])
	else:
		print("invalid")
```

## Q3


```python
a=input("data: ")
l=a.split(",")
b=input("element: ")
print(b in l)
```

## Q4


```python
a=input("data: ")
l=a.split(",")
i=l[0]
z=l[-1]
print("first, last elements: {} {}".format(i,z))
```

## Q5


```python
a = [9, 8, 7, 6, 5, 4]
print("a =",a)
print("a[0:3] =",a[0:3])
print("a[:4] =",a[:4])
print("a[:] =",a[:])
print("a[2:2] =",a[2:2])
print("a[0:6:2] =",a[0:6:2])
print("a[-3:] =",a[-3:])
print("a[:-3] =",a[:-3])
```

## Q6


```python
a=input("data: ")
l=a.split(",")
if a[0]=="3" or a[-1]=="3":
	print("True")
else:
	print("False")
```

## Q7


```python
a=input("data1: ")
b=input("data2: ")
l1=a.split(",")
l2=b.split(",")
c=int(input("num: "))
print(l1*c)
print(l2*c)
print("extending list1 with list2:",l1+l2)
```

## Q8


```python
a=input("data1: ")
b=input("data2: ")
l1=a.split(",")
l2=b.split(",")
print("is equal:",l1==l2)
print("is not equal:",l1!=l2)
```

## Q9


```python
a=input("data: ")
l=a.split(",")
if l[0]==l[-1]:
	print("equal")
else:
	print("not equal")
```

## Q10


```python
c=input("data: ")
l=c.split(",")
print("before updation:",l)
i=int(input("index: "))
n=len(l)
r=-(len(l)+1)
if i>=0:
	if i<n:
		c1=input("element: ")
		l[i]=c1
		print("after updation:",l)
	else:
		print("invalid")
else:
	if i >r:
		c1=input("element: ")
		l[i]=c1
		print("after updation:",l)
	else:
		print("invalid")
```

## Q11


```python
a=input("data: ")
l=a.split(",")
b=map(int,l)
z=list(b)
print(z)
i=l[0]
z=l[-1]
if i>=z:
	print("largest among first, last elements:",i)
else:
	print("largest among first, last elements:",z)
```

## Q12


```python
c=input("data: ")
l1=c.split(',')
l2=l1
print("list1 is list2:",l1 is l2)
print("list2 is list1:",l2 is l1)
i=int(input("index: "))
n=len(l1)
r=-(len(l1)+1)
if i>=0:
	if i<n:
		s=input("element: ")
		l1[i]=s
		print("list1 is list2:",l1 is l2)
		print("list2 is list1:",l2 is l1)
	else:
		print("enter valid index")
else:
	if i>r:
		s=input("element: ")
		l1[i]=s
		print("list1 is list2:",l1 is l2)
		print("list2 is list1:",l2 is l1)
	else:
		print("enter valid index")
```

## Q13


```python
#cloning using slicing
a = [1, 2, 3, 4, 5]
print("a =", a)
print("b = a[:]")
b=a[:]

# clone using slicing method

print("b =", b)
print("a is b ? :", a is b)


#cloning using list function
a = [1, 2, 3, 4, 5]
print("b = list(a)")
# clone elements in a to b using list
# print("a[0] = 100")

print("b =", b)
print("a is b ? :", a is b)
# set a[0] to 100
print("a[0] = 100 ")
a[0]=100 
print("a =", a)
print("b =", b)


#cloning using copy method
a = [1, 2, 3, 4, 5]
print("a =", a)
print("b = a.copy()")
# clone the elements in a to b using the method copy

print("b =", b)
print("a is b ? :", a is b)
```

## Q14


```python
a=input("data1: ")
b=input("data2: ")
l1=a.split(",")
l2=b.split(",")
if l1[0]==l2[0] or l1[-1]==l2[-1]:
	print("True")
else:
	print("False")
```

## Q15


```python
#del
dlist = ['red', 'orange', 'blue', 'green', 'yellow', 'cyan']
print("dlist =", dlist)
print("del dlist[5]")
#delete element 5 
del dlist[5]
print("dlist =",dlist)
# print the result
print("del dlist[2:]")
del dlist[2:]
print("dlist =", dlist)
print("del dlist")
del dlist
#remove
remlist = ['red', 'orange', 'blue', 'green', 'yellow', 'cyan']
print("remlist =", remlist)
print("remlist.remove('green')")
# remove green from the list and print the list
remlist.remove('green')
print('remlist =',remlist)
#pop
plist = ['red', 'orange', 'blue', 'green', 'yellow', 'cyan']
print("plist =", plist)
print("elem = plist.pop(2)")
elem=plist.pop(2)
# remove element at index 2
print("element popped & removed :", elem)
print("plist =", plist)
print("elem = plist.pop()")
elem=plist.pop()
# remove last element

print("element popped & removed :", elem)
print("plist =", plist)
print("plist.clear()")
plist.clear()
print("plist =", plist)
```

## Q16


```python
a=input("data: ")
l=a.split(",")
print(l)
print("after removing duplicates:",end=" ")
r=[]
for i in l:
	if i not in r:
		r.append(i)
print(r,end="")
print("\n")
```
