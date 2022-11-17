# Dictionary Comprehensions


## Q1


```python
l1=[]
l2=[]
for i in range(65,91,1):
	l1.append(i)
	l2.append(chr(i))
	d1=dict(zip(l1,l2))
	d1=sorted(d1.items())
	d2=dict(zip(l2,l1))
	d2=sorted(d2.items())
print(d1)
print(d2)
```
