# From Import Statement

## Q1

### Module7.py


```python
from Module_Imp3 import calculatearea,calculatediameter
s=int(input("side: "))
calculatediameter(s)
calculatearea(s,s)
```

### Module_Imp3.py


```python
def calculatediameter(rad):
	print ("diameter:" , 2 * rad)
def calculatearea(s1,s2):
	print ("area:" , s1 * s2)
def pivalue():
	print("pi value:" , 3.147)
shapes = ['circle', 'square', 'triangle', 'rectangle']
```

## Q2

### Module8.py


```python
from Module_Imp3 import pivalue, shapes
pivalue()
n=int(input("n: "))
print(shapes[1:n])
```

### Module_Imp3.py


```python
def calculatediameter(rad):
	print("diameter:", 2 * rad)
def calculatearea(s1, s2):
	print("area:", s1 * s2)
def pivalue():
	print("pi value:", 3.147)
shapes = ['circle', 'square', 'triangle', 'rectangle']
```

## Q3

### Module10.py


```python
import Module_Imp3 as mi
n=int(input("side: "))
mi.calculatearea(n,n)
mi.calculatediameter(n)
```

### Module_Imp3.py


```python
def calculatediameter(rad):
	print ("diameter:", 2 * rad)
def calculatearea(s1, s2):
	print ("area:", s1 * s2)
def pivalue():
	print("pi value:", 3.147)
shapes = ['circle', 'square', 'triangle', 'rectangle']
```

## Q4

### Module11.py


```python
import Module_Imp3 as mi
n=int(input("side: "))
mi.calculatearea(n,n)
mi.calculatediameter(n)
mi.pivalue()
print(mi.shapes[1:2])
```

### Module_Imp3.py


```python
def calculatediameter(rad):
	print ("diameter:", 2 * rad)
def calculatearea(s1, s2):
	print ("area:", s1 * s2)
def pivalue():
	print("pi value:", 3.147)
shapes = ['circle', 'square', 'triangle', 'rectangle']
```

## Q5

### Module12.py


```python
from Module_Imp3 import *
n=int(input("side: "))
calculatearea(n,n)
pivalue()
print("['{}']".format(shapes[2]))
```

### Module_Imp3.py


```python
def calculatediameter(rad):
	print ("diameter:", 2 * rad)
def calculatearea(s1, s2):
	print ("area:", s1 * s2)
def pivalue():
	print("pi value:", 3.147)
shapes = ['circle', 'square', 'triangle', 'rectangle']
```
