# Anonymous Functions



## Q1

✅ Anonymous functions are also called lambda functions.

✅ Lambda functions can be used anywhere we need a regular function objects.

◻ Lambda functions can have one argument and many expressions.

✅ The expression is evaluated first and a value is returned.

## Q2


```python
tax = lambda salary:salary*20/100 # write the expression here
salary = int(input("Please enter your salary: "))
print("Tax to be paid is", tax(salary))
```

## Q3


```python
af = lambda n:n*2
n=int(input("a: "))
print(af(n))
```

## Q4


```python
def squares(x):
	return x ** 2
list1 = [1, 2, 3, 4, 5]
#use the squares func inside map function print the result
print(list(map(squares, list1)))
#use the lambda func inside map function print the result
print(list(map(lambda x:x **2, list1)))
#use list comprehension to get equivalent behaviour as map and print the result
print([x**2 for x in list1])
```

## Q5


```python
a = [1, 2, 3, 5, 7, 9]
b = [2, 3, 6, 7, 9, 8]
 # apply lambda function to the filter function and print the result
print(list(filter(lambda x : x in a, b)))
 # print the result using list comprehension
print([x for x in a if x in b])
```
