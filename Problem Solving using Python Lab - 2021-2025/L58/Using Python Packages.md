# Using Python Packages

## Q1

✅ Packages can be thought as directories with some specific rules.

◻ A package in Python cannot contain other packages.

✅ Each package should have a file called __init__.py

◻ The __init__.py should not be empty inside a package.

## Q2

### Person.py


```python
import Robots.Car, Robots.House  # here modules are imported
Robots.Car.cleancar() # function cleancar is called form the Car modules
Robots.House.cleanhouse()
Robots.House.payrent()
```

### Robots/Car.py


```python
def cleancar():
	print("I am a robot who cleans the car")
def checkcar():
	print("I am a robot who checks the car and certifies")
```

### Robots/House.py


```python
def cleanhouse():
	print("I am a robot who cleans the house")
def payrent():
	print("I am a robot who pays the rent 35k")
```

## Q3

### Pack_ex1.py


```python
from Robots import Car2 as rc
rc.cleancar()
rc.checkcar()
```

### Robots/Car2.py


```python
def cleancar():
	c = int(input("Please enter a price you can pay: "))
	if(c > 1000):
		print("I am a robot who cleans the car for", c)
	else:
		print("I am sorry ,price too low to clean the car")
def checkcar():
	print("I am a robot who checks the car and certifies")
```

## Q4

### Pack_Ex3.py


```python
from Robots import House, Car
House.cleanhouse()
House.payrent()
Car.checkcar()
Car.cleancar()
```

### Robots/Car.py


```python
def cleancar():
	print("I am a robot who cleans the car")
def checkcar():
	print("I am a robot who checks the car and certifies")
```

### Robots/House.py


```python
def cleanhouse():
	print("I am a robot who cleans the house")
def payrent():
	print("I am a robot who pays the rent 35k")
```

## Q5

### Pack_Ex3.py


```python
from Robots import Car2 as cr
cr.checkcar()
cr.cleancar()
```

### Robots/Car2.py


```python
def cleancar():
	c = int(input("Please enter a price you can pay: "))
	if(c > 1000):
		print("I am a robot who cleans the car for", c)
	else:
		print("I am sorry, price too low to clean the car")
def checkcar():
	print("I am a robot who checks the car and certifies")
```
