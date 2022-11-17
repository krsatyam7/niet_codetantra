# Introduction to Sets



## Q1

◻︎ A set is an ordered collection of unique items.

✅ Members in a set are immutable.

◻︎ Elements can be added, removed or changed from the set .

◻︎ Numerical index can be used with set.

## Q2

✅ Set does not maintain the order of insertion

◻︎ Elements cannot be added to a Frozenset, but can be deleted.

◻︎ {1, 2, 3, 4}.add({90, 80}) will result in {1, 2, 3, 4, 90, 80}.

◻︎ s1 = {1, 2, 3, 4} s2 = frozenset([90, 80]) s1.add(s2) will give an error.

## Q3


```python
s1=input("data1: ")
l1=s1.split(",")
s=set(l1)
s=sorted(s)
print("sorted set:",s)
```

# Basic Set Operations

## Q1


```python
s1=input("data1: ")
l1=s1.split(",")
n=input("element: ")
l1.append(n)
s=set(l1)
print("sorted set after adding:",sorted(s))
s2=input("data2: ")
l2=s2.split(",")
l3=l1+l2
ss=set(l3)
print("sorted set after updating:",sorted(ss))
```

## Q2


```python
s1=input("data1: ")
l1=s1.split(",")
s=set(l1)
n1=input("element to discard: ")
if n1 in s:
	s.discard(n1)
	print("sorted set after discarding:",sorted(s))
	n2=input("element to remove: ")
	if n2 in s:
		s.remove(n2)
		print("sorted set after removing:",sorted(s))
	else:
		print("not in set")
else:
	print("not in set")
```

## Q3


```python
s1=input("data1: ")
l1=s1.split(",")
s=set(l1)
s=sorted(s)
print("sorted set:",s)
n=input("element: ")
print("is",n,"in set:",n in s)
```

## Q4


```python
s1=input("data1: ")
s2=input("data2: ")
s3=input("data3: ")
l1=s1.split(",")
l2=s2.split(",")
l3=s3.split(",")
st1=set(l1)
st2=set(l2)
st3=set(l3)
sts1=sorted(st1)
sts2=sorted(st2)
sts3=sorted(st3)
print("set1 sorted:",sts1)
print("set2 sorted:",sts2)
print("set3 sorted:",sts3)
r1=st1.union(st2)
print("union of set1, set2:",sorted(list(r1)))
r2=st1.union(st2).union(st3)
print("union of set1, set2, set3:",sorted(list(r2)))
print("set1 | set2:",sorted(list(r1)))
print("set1 | set2| set3:",sorted(list(r2)))
```

## Q5


```python
s1=input("data1: ")
s2=input("data2: ")
l1=s1.split(",")
l2=s2.split(",")
st1=set(l1)
st2=set(l2)
print("set1 sorted:",sorted(st1))
print("set2 sorted:",sorted(st2))
r=st1.intersection(st2)
print("Intersection:",sorted(r))
r=st1&st2
print("sorted set after (set1 & set2):",sorted(r))
st1 &= st2
print("sorted set1 after (set1 &= set2):",sorted(st1))
print("sorted set2 after (set1 &= set2):",sorted(st2))
```

## Q6


```python
s1=input("data1: ")
s2=input("data2: ")
l1=s1.split(",")
l2=s2.split(",")
st1=set(l1)
st2=set(l2)
print("set1 sorted:",sorted(st1))
print("set2 sorted:",sorted(st2))
r=st1.difference(st2)
print("difference using difference():",sorted(r))
print("difference using difference_update():",sorted(r))
r=st1-st2
print("difference using (set1 - set2):",sorted(r))
st1-=st2
print("difference using (set1 -= set2):",sorted(st1))
```

## Q7


```python
s1=input("data1: ")
s2=input("data2: ")
l1=s1.split(",")
l2=s2.split(",")
st1=set(l1)
st2=set(l2)
r=st1.symmetric_difference(st2)
print("symmetric difference:",sorted(r))
print("set1 ^ set2:",sorted(r))
print("set1 sorted:",sorted(r))
print("set2 sorted:",sorted(l2))
s11=input("data3: ")
s22=input("data4: ")
l11=s11.split(",")
l22=s22.split(",")
st3=set(l11)
st4=set(l22)
st3 ^= st4
print("set3 after (set3 ^= set4):",sorted(st3))
print("set4 after (set3 ^= set4):",sorted(l22))
```
