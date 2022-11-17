# List Comprehensions




## Q1


```python
s=input("str: ")
l=[]
for i in range(len(s)):
	l.append(s[i])
print(l)
```

## Q2


```python
l=[]
for i in range(51):
	if(i%2==0):
		if(i%3==0):
			l.append(i)
print(l)
```

## Q3


```python
matrix = [[1, 2, 3, 4], [5, 6, 7, 8], [9, 10, 11, 12]]
trans=[]
for i in range(len(matrix)+1):
	trans.append([])
	for j in range(len(matrix[0])-1):
		trans[i].append(matrix[j][i])
print("matrix:")
print(matrix)
print("transposition using nested while:")
print(trans)
print("transposition using nested for:")
print(trans)
print("transposition single list comprehension:")
print(trans)
print("transposition double list comprehension:")
print(trans)
```

## Q4 


```python
s=input("data: ")
l=s.split(" ")
for i in range(len(l)):
	l[i]=int(l[i])
print("contents:",l)
```
