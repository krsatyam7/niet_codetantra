# Building Blocks of Algorithms






## Q1

◻︎ Selection, Sequence are the only building blocks of constructing an algorithm.

◻︎ A statement is a collection of instructions corresponding to multiple actions.

✅ Input to a computer, processing the input and showing the processed result as output are examples of a statement.

✅ Execution of individual statements in a given order is called control flow.

✅ In selection statement, the program control is transferred to a part of the program based on a condition.

✅ A function causes the control to be passed to block of code when referenced using its name.

## Q2


```python
num1 = int(input("num1: "))
num2 = int(input("num2: "))
sum = num1 + num2
print("sum of %d, %d = %d" %(num1, num2, sum))
```

## Q3


```python
n=int(input("age: "))
if n>=0:
    if n>17:
        print("eligible")
    else:
        print("not eligible")
else:
    print("age cannot be negative")
```

## Q4


```python
nvalues=int(input("n: "))
if(nvalues>0 and nvalues<51):
    for i in range(1, nvalues + 1):
        print(i,end=" ")
else:
    print("enter valid value")
```

## Q5


```python
n1=int(input('num1: '))
n2=int(input('num2: '))
def add2Num():
    # c=n1+n2
    print("The sum of {} and {} is".format(n1,n2),n1+n2)

add2Num() # caling the function add2Num
```
