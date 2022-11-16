# Break Statement

## Q1


```python
for num in range(1, 10):
    if num%5==0:
        break
    print(num)
```

## Q2


```python
while True:
    v=['a','e','i','o','u','A','E','I','O','U']
    num=['1','2','3','4','5','6','7','8','0']
    n=input("vowel, or 9 to quit: ")
    if n in v:
        print("vowel")
# return(n)
    elif n=="9":
        exit()
    elif n in num:
        print("wrong input")
# return()
    else:
        print("not vowel")
```
