# If-elif-else Statement

## Q1


```python
#print("Enter '0' for exit.")
print("'0' for exit.")
ch=input("ch: ")
# take th input from the user

if ch == '0':
    exit()
elif ch.isnumeric() == True:
    print("digit")
elif ch.isalpha() == True:
    print("alphabet")
else:
    print("neither alphabet nor digit")

```

## Q2


```python
n=int(input("num: "))
if n==0:
    print("zero")
elif n>0:
    print("positive")
else:
    print("negative")
```

## Q3


```python
# Type Content here...
n=int(input("year: "))
if n%4==0 and n%100!=0:
    print("leap year")
elif n%400==0:
    print("leap year")
else:
    print("not leap year")
```
