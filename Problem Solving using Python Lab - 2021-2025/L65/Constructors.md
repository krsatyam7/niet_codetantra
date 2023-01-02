# Constructors



## Q1

✅ A constructor can be viewed as a specific method used by the class to perform tasks such as initialising variables, or any start up task.

✅ In Java language, the constructor has the same name as the class with no return type defined.

◻︎ Constructors cannot be overloaded in Python.

✅ A constructor in Python in any class is defined as __init__(self) method.

## Q2


```python
class student:
	def __init__(self,name,age,email):
		self.name=name
		self.age=age
		self.email=email
s1_name=input("s1 name: ")
s1_age=int(input("s1 age: "))
stud_1=student(s1_name,s1_age,'arya@gmail.com')
s2_name=input("s2 name: ")
s2_age=int(input("s2 age: "))
stud_2=student(s2_name,s2_age,'geetha@gmail.com')
print("Stud_1.name:",stud_1.name)
print("Stud_2.name:",stud_2.name)
```

## Q3


```python
class Student:
	def __init__(self, name, age, email):
		# Write your code here
		self.name=name
		self.age=age
		self.email=email
	def studentDetails(self):
		print("name:",self.name,", age:",self.age,", email:",self.email)
name=input("name: ")
age=int(input("age: "))
email=input("email: ")
sd=Student(name,age,email)
sd.studentDetails()
```

## Q4


```python
class Employee:
	def __init__(self, name, salary):
		# Initialize name and salary of the employee
		self.name=name
		self.salary=salary
	def displayEmployee(self):
		print("name:",self.name,", salary:",self.salary)
name=input("name: ")
salary=int(input("salary: "))
emp=Employee(name,salary)
emp.displayEmployee()
```
