# Dictionaries


## Q1


```✅ Dictionary is a Python data type to store multiple values.

◻ We use parenthesis () to define a dictionary.

◻ In dictionary we represent an element in the {key-value} format.

✅ Keys of the dictionary cannot be changed.

◻ dictionary() function is used to create an empty dictionary.
```

## Q2


```python
mydict = {"name":"Rama", "branch":"CSE", "place":"HYD"}
print(mydict["name"])
print(mydict["branch"])
print(mydict["place"])
```

## Q3


```python
mydict = {"game":"chess","dish":"chicken","place":"home"}
print(mydict.get("game"))
print(mydict.get('dish'))
print(mydict.get("place"))
mydict["game"] = "cricket" # change game chess to cricket using respective key
print(mydict['game'])
```

# Data Type Conversions


## Q1


```python
a = int(input("Enter a value: "))
b = int(input("Enter b value: "))
# print a value respective string
print(str(a))
# print a value respective char
print(chr(a))
# print a value respective hexadecimal value
print(hex(a))
# print a and b of complex number
print(complex(a,b))
```

## Q2


```python
list1 = ["key1","key2","key3"]
list2 = ["value1","value2","value3"]
print(list1)
print(list2)
mydict = zip(list1,list2)	# using zip() function we can create dictionary with two lists(one list for keys and one list for values)
set1=set(mydict)
# convert dictionary into set using set() method
# print elements in  sorted order
print(sorted(set1))
```
