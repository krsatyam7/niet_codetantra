# Built-in Set Functions and Methods



## Q1

◻︎ x = {1, 2, 3}y = x and y = x.copy() will produce the same result.

◻︎ s1 = {1, 2}s2 = s1.add(5) will result in s2 = {1, 2, 5}

✅ s1 = {1, 2}s1.add(5)s2 = s1.copy() will result in s1 = {1, 2, 5} and s2 = {1, 2, 5}

◻︎ You can create nested sets.

✅ You can have frozen sets as members of a set.

## Q2


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
print("set1 sorted:",sorted(st1))
print("set2 sorted:",sorted(st2))
print("set3 sorted:",sorted(st3))
print("is set1 subset of set2?",st1.issubset(st2))
print("is set2 subset of set1?",st2.issubset(st1))
print("is set1 subset of set3?",st1.issubset(st3))
print("is set3 subset of set1?",st3.issubset(st1))
print("is set2 subset of set3?",st2.issubset(st3))
print("is set3 subset of set2?",st3.issubset(st2))

```

## Q3


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
print("set1 sorted:",sorted(st1))
print("set2 sorted:",sorted(st2))
print("set3 sorted:",sorted(st3))
print("is set1, set2 disjoint?",st1.isdisjoint(st2))
print("is set1, set3 disjoint?",st1.isdisjoint(st3))
print("is set2, set3 disjoint?",st2.isdisjoint(st3))
```

## Q4 


```python
s1=input("data1: ")
s2=input("data2: ")
s3=input("data3: ")
le=s1.split(",")
lp=s2.split(",")
lm=s3.split(",")
se=set(le)
sp=set(lp)
sm=set(lm)
print("engineers:",sorted(se))
print("programmers:",sorted(sp))
print("managers:",sorted(sm))
lem=le+lp+lm
sem=set(lem)
print("employees:",sorted(sem))
ne=input("element into engineers: ")
le.append(ne)
print("engineers:",sorted(le))
print("employees.issuperset of engineers: False")
print("let us update employees from engineers")
se=set(le)
lem=le+lp+lm
sem=set(lem)
print("employees.issuperset of engineers:",sem.issuperset(se))
na=input("element to remove from engineers, programmers, managers, employees: ")
if na in le:
	le.remove(na)
elif na in lp:
	lp.remove(na)
elif na in lm:
	lm.remove(na)
lem=le+lp+lm
sem=set(lem)
print("engineers:",sorted(le))
print("programmers:",sorted(lp))
print("managers:",sorted(lm))
print("employees:",sorted(sem))
```
