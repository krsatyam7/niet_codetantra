# Built-in Tuple Functions


## Q1

✅ enumerate() method starts an index from 0.

✅ any((' ', ' ', ' ', '?')) returns True as output.

◻ any(()) will return True as output.

## Q2

◻ t = (3, 1, 2) sorted(t) returns (1, 2, 3).

✅ tuple("hello") returns output as ('h', 'e', 'l', 'l', 'o')

✅ print(min(("P", "y", "t", "h", "o", "n", " "))) will return output as ' '.

## Q3


```python
s=input("data: ")
l=s.split(",")
print("length:",len(l))
```

## Q4


```python
s=input("data: ")
l=s.split(",")
print("tuple:",tuple(l))
n=input("element: ")
c=0
for i in range(len(l)):
	if(l[i]==n):
		c=c+1
if c==0:
	print("enter valid element")
else:
	print("existed",c,"times")
```

## Q5


```python
s=input("data: ")
l=s.split(",")
s=0
for i in range(len(l)):
	l[i]=int(l[i])
	s=s+l[i]
print("tuple:",tuple(l))
print("sum:",s)
```

## Q6


```python
s=input("data: ")
l=s.split(",")
a=int(l[0])
for i in range(len(l)):
	l[i]=int(l[i])
	if(a<l[i]):
		a=l[i]
print("max:",a)
```

## Q7


```python
s=input("data: ")
l=s.split(",")
a=int(l[0])
for i in range(len(l)):
	l[i]=int(l[i])
	if a>l[i]:
		a=l[i]
print("min:",a)
```

## Q8


```python
s=input("data: ")
l=s.split(",")
print("tuple:",tuple(l))
n=input("element: ")
c=0
for i in range(len(l)):
	if(l[i]==n):
		c=i
if c!=0:
	print("index:",c)
else:
	print('enter an element that exists in tuple')
```
