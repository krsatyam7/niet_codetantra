# Methods



## Q1

✅ Methods are a set of statements that are called to perform a specific task.

✅ Methods are used in OOPS.

◻︎ Functions need to be a part of a class.

## Q2


```python
class person:
	def setname(self,name):
		self.name=name
	def getname(self):
		return self.name
p1=person()
p2=person()
name=input("p1 name: ")
p1.setname(name)
name=input("p2 name: ")
p2.setname(name)
print("p1 name:",p1.getname())
print("p2 name:",p2.getname())
```

## Q3


```python
class person:
	def setname(self,name):
		self.name=name
	def getname(self):
		return self.name
p1=person()
p2=person()
name=input("name1: ")
p1.setname(name)
name=input("name2: ")
p2.setname(name)
print(p1.getname())
print(p2.getname())
```

## Q4


```python
class Greeting:
	def sayHello(self, name = None, wish = None):
		if name is not None and wish is not None:
			print ('Hello' + name + wish)
		elif name is not None and wish is None:
			print ('Hello' + name)
		else:
			print ('Hello')
greet = Greeting()
# Call the method with zero, one and two parameters
greet.sayHello()
greet.sayHello('Ram')
greet.sayHello('Ram,', 'Good Morning!!!')
```
