# Recursion 
## Q1

✅ A function call when made within the definition of the same function is known as a recursion function.

◻ A successful recursive function can be written without a base criteria (i.e., a condition which stops calling the same function recursively).

✅ Every time a recursive call is made, the arguments passed to the function should be closer to the base criteria.

◻ There cannot be more than one recursive call inside the same function.


## Q2

◻ In indirect recursion, the function calls itself.

✅ In circular recursion more than one function is involved.

◻ Only indirect recursion can lead to infinite loop.


## Q3


```python
#Program to illustrate recursion
def recurfact(n):
	if(n==0):
		return 1
	else:
		return n*recurfact(n-1)
a=int(input("num: "))
if(a<0):
	print("factorial not exist for negative number")
else:
	print("factorial:",recurfact(a))
```

## Q4


```python
def r_sum(nested_num_list):
	s=0
	for i in range(len(nested_num_list) ):
		l=nested_num_list[i]
		if(type(l)==type([])):
			for i in range(len(l)):
				ll=l[i]
				if(type(ll)==type([])):
					for i in range(len(ll)):
						lll=ll[i]
						s=s+lll
				else:
					s=s+ll
		else:
			s=s+l
	return s
L1 = [1, 10, 9, [3, 5, 7], [5, [6, 7], 97]]
print(r_sum(L1))
```

## Q5


```python
#Program to add two numbers using recursion
def add(x, y):
	if y==0:
		return x
	else:
		return (1+add(x,y-1))
a=int(input("a: "))
b=int(input("b: "))
print(add(a, b))
```
