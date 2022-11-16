# Built-in String Methods


## Q1

✅ In Python, we can convert strings of Uppercase letters into lower case and lower case to upper case using swapcase() method.

✅ print('python is simple'.title()) gives output like Python Is Simple.

◻ a = "python is my favourite" a[3] = 'l' , replaces 'l' with 'h'.

◻ a = "python" + 3.7 returns output as python3.7.
 
◻ print('abcpyxyzpython', 3, 10) gives output as error.

✅ print('20.3'.isnumeric()) it returns output as False.

## Q2


```python
a = input("str: ")
print(a.upper())
print(a.title())
print(a.split())
print(a.center(25, '%'))
print(a.lower())

str2 = '@'
print(str2.join(a))
print(a.replace('Strings','Tuples'))
```

## Q3

◻ str = "PYTHOn" print(str.isupper()) returns output as True.

✅ print("\nhello") prints the output hello on a new line.

✅ str = '123', the below code is correct to convert string into int. print(int(str)) # 123.

✅ str = "hello world", print(str.isalnum()) returns False.

## Q4


```python
a=input("str1: ")
b=input("str2: ")
print(a*3+b)
```

## Q5


```python
print("Python provides built-in libraries")
print("Using Python we can implement more and more applications")
print("\tPython is Robust")
```

## Q6


```python
a=input("str1: ")
b=input("str2: ")
n=len(a)
m=len(b)
if n==m:
    print("strings are same length")
else:
    if m>n:
        print(a+b+a)
    else:
        print(b+a+b)
```

## Q7


```python
a=input("str: ")
if a.startswith("Python")==True and a.endswith("programming")==True:
    print("valid")
else:
    print("invalid")
print("character with min val:",min(a))
print("character with maximum val:",max(a))
```

## Q8


```python
a=input("str: ")
b="Python "
if a.startswith("Python")==True:
    print("str is:",a)
else:
    print("str after adding 'Python':",b+a)
```

## Q9


```python
# Take a string input form the user
a=input("str: ")
# Reverse the string using slicing operator
b=a[-1::-1]
print(b)
```

## Q10


```python
#Program to remove punctuation marks from a string
import string
punctuations = string.punctuation
result = " "
str = "List - []\n tuple - ()\n Dictionary - {}\n Comment - #\n Multiply - *\n not - !\n and - &\n or - |\n format specifier - %\n String - " " $ @ ; : ' / + = "


#write your code here for removing punctuation
for i in str:
    if i not in punctuations:
        result+=i


print("Set of punctuations in string.punctuation is:",punctuations) # print punctuations

print("String after removing all Punctuation's is:",result) # print result here
```

## Q11


```python
a=input("str1: ")
b=input("str2: ")
c=a.count(b)
print("count:",c)
```

## Q12


```python
# write a program to print the every character in the given string twice
c=input("str: ")
print("result:",end="  ")
for i in range(0,len(c)):
    print("{}".format(c[i]+c[i]),end="")
print("\n")
```

## Q13


```python
a=input("str: ")
b=len(a)
if b%2==0:
	n=(len(a)//2)
	c=a[0:n:1]
	print("first half str of even length:",c)
else:
	n=(len(a)-1)//2
	d=a[n+1::1]
	print("second half str of odd length:",d)
```

## Q14


```python
a=input("str: ")
s=len(a)
if s==0:
	print("null")
	print("first: ")
	print("second: ")
	print("original: ")
elif s==1:
	print(a)
	print("first:",a)
	print("second: ")
	print("original:",a)
else:
	b=a[0::2]
	c=a[1::2]
	print("first:",b)
	print("second:",c)
	print("original:",a)
```

## Q15


```python
# Write your code here
c=input("str: ")
print("incremental order:",end=" ")
for i in range(1,len(c)+1):
	n=c[0:i:1]
	print(n,end="")
print("")
```

## Q16


```python
# Write your code here
a=input("str with hyphens: ")
for i in a.split("-"):
	print(i,end="")
```

## Q17


```python
import string
print("Character\t ASCII Code")
for i in range(97,123):
	print("{} \t\t {}".format(chr(i),i))
for j in range(65,91):
	print("{} \t\t {}".format(chr(j),j))
```

## Q18


```python
# Get the Input string
c=input("str: ")
# Sort the string
s=sorted(c)
# Take empty List
r= []
# For each character in the input
for i in s:
	if i not in r:
		# g=c.count(i)
		print("'{}'\t{}".format(i,c.count(i)))
		r.append(i)
print(r)
```

## Q19


```python
c=input("str: ")

s=sorted(c)
r=[]
for i in c:
	if i not in r:
		print("{0} \t {1}".format(i,c.count(i)))
		r.append(i)
```
