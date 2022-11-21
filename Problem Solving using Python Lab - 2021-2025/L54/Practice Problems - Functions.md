# Practice Problems - Functions

## Q1


```python
from datetime import date
def numofdays(date1, date2):
	return (date2-date1).days
n1=int(input("dob in ddmmyyyy format: "))
n2=int(input("today's date in ddmmyyyy format: "))
y1=n1%10000
n1=n1//10000
m1=n1%100
n1=n1//100
d1=n1
y2=n2%10000
n2=n2//10000
m2=n2%100
n2=n2//100
d2=n2
date1=date(y1,m1,d1)
date2=date(y2,m2,d2)
print("days since birthday:",numofdays(date1,date2))
```

## Q2


```python
def valley(l):
	s=l.split(" ")
	for i in range(len(s)):
		s[i]=int(s[i])
	a=s[0]
	c=1
	for j in range((len(s)//2)-1):
		if(s[j]>s[j+1]):
			c=c+1
	if(c==(len(s)//2)):
		for j in range((len(s)//2),len(s)-1):
			if(s[j]<s[j+1]):
				c=c+1
	if(c==len(s)-1):
		return True
	else:
		return False
n=input("integers space separated: ")
print(valley(n))
```

## Q3


```python
def frequency (seq):
	s=seq
	s=sorted(s)
	c=0
	lt1=[]
	lt2=[]
	lt3=[]
	ck=[]
	for i in s:
		for j in s:
			if i==j:
				c=c+1
		ck.append(c)
		c=0
	mx=max(ck)
	mn=min(ck)
	c=0
	for i in s:
		for j in s:
			if i==j:
				c=c+1
		if((i not in lt1) and (c==mn)):
			lt1.append(i)
		if((i not in lt2) and (c==mx)):
			lt2.append(i)
		c=0
	lt3=[]
	lt3.append(lt1)
	lt3.append(lt2)
	lt3.append(mn)
	lt3.append(mx)
	l3=tuple(lt3)
	return l3
l1 = [int(x) for x in input("Please enter integers separated by spaces: ").split()]
print (frequency(l1))
```
