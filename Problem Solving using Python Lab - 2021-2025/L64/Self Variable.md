# Self Variable



## Q1


```python
class Student:
	def __init__(self,name,age,email):
	# define init method with self , name, age, email attributes
		self.name = name
		self.age = age
		self.email = email
Stud_1 = Student('SriRam', 25, 'ram@sch.com') # type: Student
Stud_2 = Student('Lakshman', 28, 'laks@sch.com')
print('Stud_1 details =', Stud_1.name, Stud_1.age, Stud_1.email)
print('Stud_2 details =', Stud_2.name, Stud_2.age, Stud_2.email)


```

## Q2


```python
class Car:
	def setDetails(self, model, regno):
		self.model=model
		self.regno=regno
		
	def getModel(self):
		return self.model
	
	def getRegno(self):
		return self.regno


Hyundai = Car()
Maruthi = Car()
#Take details of the car as input from user. Write your code here
a=input("car1 model: ")
b=input("car1 regno: ")
c=input("car2 model: ")
d=input("car2 regno: ")

Hyundai.setDetails(a,b)
Maruthi.setDetails(c,d)

print("Hyundai car details:",Hyundai.getModel(),Hyundai.getRegno())
print("Maruthi car details:",Maruthi.getModel(),Maruthi.getRegno())
```

## Q3


```python
class Car:
	def setName(self,name):
		self.name=name
	def getName(self):
		return self.name
	
Honda=Car()
a=input('car name: ')
Honda.setName(a)
print('Honda car name:',Honda.getName())
```

## Q4

◻︎ self is a keyword.

✅ self should be the first argument in the parameter list.

✅ self is always a reference to the current instance.

