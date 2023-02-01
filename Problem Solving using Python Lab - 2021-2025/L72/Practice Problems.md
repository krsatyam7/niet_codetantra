# Practice Programs




## Q1


```python
x1=int(input("Enter the x coordinate of first point: "))
y1=int(input("Enter the y coordinate of first point: "))
x2=int(input("Enter the x coordinate of second point: "))
y2=int(input("Enter the y coordinate of second point: "))
x=x2-x1
y=y2-y1
x=x**2
y=y**2
d=x+y
d=d**(1/2)
print("Distance is:",d)
```

## Q2


```python
n=int(input("Enter an integer: "))
if n%2==0:
	print("Given number %d is even"%n)
else:
	print("Given number %d is odd"%n)
```

## Q3


```python
n=int(input("Enter n value: "))
for i in range(1,11,1):
	print("{}/{} = {}".format(n,i,n/i))
```

## Q4


```python
n=int(input("Enter size of list: "))
l=[]
s=0
for i in range(n):
	e=int(input("Enter value: "))
	l.append(e)
	s=s+e
print("The sum of the given sequence {} is {}".format(l,s))
print("good bye..!")
```

## Q5


```python
n=int(input("Enter an integer: "))
while n>0:
	print(n)
	n=n-1
print("good bye..!")
```

## Q6


```python
n=int(input("Enter an integer value: "))
fn=[]
a=-1
b=1
e=1
while(e<=n):
	c=a+b
	fn.append(c)
	a=b
	b=c
	e=e+1
print("Fibonacci numbers:",fn)
flag=0
pn=[]
s=0
for i in fn:
	if(i!=0 and i!=1):
		for j in range(2,i):
			if i%j==0:
				flag=1
		if flag==0:
			pn.append(i)
			s=s+i
	flag=0
print("The prime numbers of fibonacci series:",pn)
print("The sum of the prime numbers:",s)
```

## Q7


```python
n=int(input("Enter an integer: "))
c=s=0
f=[]
a=-1
b=1
while(c<=n):
	c=a+b
	if c<=n:
		f.append(c)
		if c%2==0:
			s=s+c
		a=b
		b=c
print("The sum of even numbers of fibonacci sequence {} is: {}".format(f,s))
```

## Q8


```python
s=input("Enter the string: ")
print("{'%s': %d}"%(s,len(s)))
```

## Q9


```python
a=input("Enter strings contained name and dob with : seperated\n").split()
dic=dict()
for i in a:
	val=i.split(':')
	dic[val[0]]=val[1]
print("The list:",a)
fin="---".join(a)
print('The list with join:',fin)
print('The sorted dictionary:', sorted(dic.items()))
```

## Q10


```python
ni=int(input("Enter size of int-list: "))
ns=int(input("Enter size of string-list: "))
li=[]
ls=[]
for i in range(ni):
	n=int(input("Enter int for int-list: "))
	li.append(n)
for i in range(ns):
	n=input("Enter string for string-list: ")
	ls.append(n)
d=dict(zip(li,ls))
print(d)
```

## Q11


```python
f=input("Enter the filename: ")
s=input("Enter the character to be searched: ")
file=open(f,'r')
text=file.read()
print("{} appears {} times in file".format(s,text.count(s)))
print("The type of file:",type(file))
```

## Q12


```python
fn=input("Enter file name: ")
file=open(fn,'r')
lst=file.readlines()
lst2=lst[::-1]
for i in lst2:
	i=i.replace("\n","")
	print(i)
```

## Q13


```python
fn=input("Enter file name: ")
file=open(fn,'r')
l=0
w=0
c=0
for i in file:
	i=i.strip()
	words=i.split()
	l+=1
	w+=len(words)
	c+=len(i)
print("Lines =",l)
print("words =",w)
print("Characters =",c+(l-1))
```

## Q14


```python
import math
def ballcollied():
	s1=input("Enter x, y, r of ball-1: ")
	x1,y1,r1=s1.split(" ")
	x1=int(x1)
	y1=int(y1)
	r1=int(r1)
	s2=input("Enter x, y, r of ball-2: ")
	x2,y2,r2=s2.split(" ")
	x2=int(x2)
	y2=int(y2)
	r2=int(r2)
	d=math.sqrt((x2-x1)**2+(y2-y1)**2)
	s=r1+r2
	if d<=s:
		print("True - Balls are colliding")
	else:
		print("False - Balls are not colliding")
ballcollied()
```

## Q15


```python
import statistics as st
n=int(input("Enter size of list: "))
l=[]
for i in range(n):
	e=int(input("Enter integer value: "))
	l.append(e)
print("Mean of list:",st.mean(l))
print("Median of list:",st.median(l))
print("Mode of list:",st.mode(l))
print("Standard deviation of list:",st.stdev(l))
print("Variance of list:",st.variance(l))
```

## Q16


```python
def neralyequal():
	s1=input("Please enter a string: ")
	s2=input("Please enter another string: ")
	l1=len(s1)
	l2=len(s2)
	if(l1>l2 and (l1-l2)==1):
		print("Some Character is extra in string1")
		r=s1[1]
		s1=s1.replace(r,"")
		print("Strings after removal of the extra character:",s1,s2)
		print("False")
	elif(l2>l1 and (l2-l1)==1):
		print("Some Character is extra in string1")
		r=s2[1]
		s2=s2.replace(r,"")
		print("Strings after removal of the extra character:",s2,s1)
		print("False")
	elif(l1==l2):
		print("Strings are of equal Length")
		print("True")
	else:
		print("Lengths differ by more than 1")
		print("False")
neralyequal()
```

## Q17


```python
n=int(input("Enter size of list: "))
ol=[]
dl=[]
c=0
for i in range(n):
	e=int(input("Enter value: "))
	ol.append(e)
for i in ol:
	for j in ol:
		if(i==j):
			c=c+1
	if c>1:
		if i not in dl:
			dl.append(i)
	c=0
print("Original List =",ol)
print("Duplicates =",sorted(dl))
```

## Q18


```python
n=int(input("Enter size of list: "))
ol=[]
ul=[]
c=0
for i in range(n):
	e=int(input("Enter value: "))
	ol.append(e)
for i in ol:
	'''for j in ol:
		if i==j:
		c=c+1
		if c==1:'''
	if i not in ul:
		ul.append(i)
print("Original List =",ol)
print("Unique elements =",ul)
```

## Q19


```python
n=int(input("Enter size of list: "))
ol=[]
cp=[]
for i in range(n):
	e=int(input("Enter value: "))
	ol.append(e)
cp.append(ol[0])
e=ol[0]
for i in range(1,len(ol)):
	e=e*ol[i]
	cp.append(e)
print("Original List =",ol)
print("Cumulative Product List =",cp)
```

## Q20


```python
n=int(input("Enter size of list: "))
ol=[]
for i in range(n):
	e=int(input("Enter value: "))
	ol.append(e)
print("Original List =",ol)
print("Reversed List =",ol[::-1])
```

## Q21


```python
import math
a=int(input("Enter an integer value: "))
b=int(input("Enter an integer value: "))
print("GCD of {} and {} is {}".format(a,b,math.gcd(a,b)))
print("LCM of {} and {} is {}".format(a,b,abs(a*b)//math.gcd(a,b))) 
```

## Q22


```python
R=int(input("Number of rows, m = "))
C=int(input("Number of columns, n = "))
matrix=[]
for i in range(R):
	a=[]
	for j in range(C):
		print("Entry in row: {} column: {}".format(i+1,j+1))
		a.append(int(input()))
	matrix.append(a)
print(matrix)
```

## Q23


```python
R1=int(input("Number of rows for matrix - A, m = "))
C1=int(input("Number of columns for matrix - A, n = "))
R2=int(input("Number of rows for matrix - B, p = "))
C2=int(input("Number of columns for matrix - B, q = "))
matrix1=[]
matrix2=[]
if R1==R2 and C1==C2:
	print("Enter values for matrix - A")
	for i in range(R1):
		a=[]
		for j in range(C1):
			print("Entry in row: {} column: {}".format(i+1,j+1))
			a.append(int(input()))
		matrix1.append(a)
	print("Enter values for matrix - B")
	for i in range(R2):
		a=[]
		for j in range(C2):
			print("Entry in row: {} column: {}".format(i+1,j+1))
			a.append(int(input()))
		matrix2.append(a)
	print("Matrix a =",matrix1)
	print("Matrix b =",matrix2)
	matrixsum=[]
	for i in range(len(matrix1)):
		matrixsum.append([])
		for j in range(len(matrix1[0])):
			matrixsum[i].append(matrix1[i][j]+matrix2[i][j])
	print("Addition of two matrices =",matrixsum)
else:
	print("Addition is not possible")
```

## Q24


```python
def matmult(A, B,r1,c1,r2,c2):
	if c1==r2:
		if(c1==c2):
			la=len(A)
			lao=len(A[0])
			lb=c1
		else:
			la=len(A)
			lao=len(B[0])
			lb=r2
		result=[]
		r=0
		for i in range(la):
			tr=[]
			for j in range(lao):
				for k in range(lb):
					s=(A[i][k]*B[k][j])
					r=r+s
				tr.append(r)
				r=0
			result.append(tr)
			del tr
		print("Matrix - A * Matrix- B =",result)
	else:
		print("Cannot multiply the two matrices. Incorrect dimensions.")
		print("Matrix - A * Matrix- B = None")
def readmatrix(name = ''):
	print("Enter values for",name)
	R=int(input("Number of rows, m = "))
	C=int(input("Number of columns, n = "))
	mat=[]
	for i in range(R):
		a=[]
		for j in range(C):
			print("Entry in row: {} column: {}".format(i+1,j+1))
			a.append(int(input()))
		mat.append(a)
	return mat,R,C
matrixa,ra,ca = readmatrix('matrix - A')
matrixb,rb,cb = readmatrix('matrix - B')
print("Matrix - A =", matrixa)
print("Matrix - B =", matrixb)
matmult(matrixa, matrixb,ra,ca,rb,cb)
```
