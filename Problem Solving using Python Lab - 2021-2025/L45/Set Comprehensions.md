# Set Comprehensions




## Q1


```python
l=int(input("n1: "))
u=int(input("n2: "))
my_set = {i ** 2 if i % 2 == 0 else i ** 3 for i in range(l,u)}
print(sorted(my_set))
```

## Q2


```python
t=[]
for z in range(5,31):
	z2=z*z
	x=x2=1
	y=z-1
	y2=y*y
	while(x<y):
		x2_y2=x2+y2
		if x2_y2==z2:
			e=[]
			e.append(z)
			e.append(y)
			e.append(x)
			e=tuple(e)
			t.append(e)
			del e
			x+=1
			x2=x*x
			y-=1
			y2=y*y
		elif x2_y2<z2:
			x+=1
			x2=x*x
		else:
			y-=1
			y2=y*y
temp=t[6]
t[6]=t[7]
t[7]=temp
print(t)
```
