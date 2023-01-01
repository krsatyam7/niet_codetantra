# Classes



## Q1

✅ Object-oriented programming was first introduced at MIT in 1950’s.

✅ In 1990, James Gosling of Sun Micro Systems developed a simple version of C++ called Java .

◻︎ Java was not widely used to build internet applications.

◻︎ Three OOP concepts are: Objects and Classes, Inheritance and Encapsulation.

## Q2

✅ A programming paradigm informs how problems are analysed and solved in a programming language.

◻︎ Procedural programming is more closer to the real world than OOP.

✅ Large systems developed using procedural programming language can be difficult to maintain.
 
◻︎ For small algorithm implementation programs, procedural programming languages (C) are better.

## Q3

✅ A class is a combination of data and its associated meaningful functions.

✅ Object based programming implements information hiding and abstraction.

◻︎ Object-oriented programming does not implement Inheritance and Polymorphism.
 
◻︎ Visual Basic is an OOP language.

## Q4

✅ Objects are instances of classes.

◻︎ A class can be an object.

✅ A class is like the blueprint or design of which, instances are made.

✅ A class contains both attributes and methods.

## Q5

✅ A class is a combination of data members and member functions.

✅ An object is an instance of a class.
 
✅ Data in an object captures the characteristics (or attributes) of that object.

✅ Methods of an object captures the behaviour of the real world object.

## Q6

✅ A class is a combination of data and functions, which is nothing but implementation of encapsulation.

◻︎ By using public access specifier in a class, data will be hidden.

✅ An object is a run-time instance of a class.

## Q7

✅ Abstraction.

◻︎ Encapsulation.

◻︎ Inheritance.

◻︎ Polymorphism.

## Q8


```python
class Student:
	pass
Stud_1 = Student()  
Stud_2 = Student()
Stud_1.name = 'SriRam'
Stud_1.age = 25
Stud_1.graduate = 'MBA'
Stud_2.name = 'Lakshman'
Stud_2.age = 23
Stud_2.graduate = 'Engineer'
print("Stud_1.name:", Stud_1.name)
print("Stud_1.age:", Stud_1.age)
print("Stud_1.graduate:", Stud_1.graduate)
print("Stud_2.name:", Stud_2.name)
print("Stud_2.age:", Stud_2.age)
print("Stud_2.graduate:", Stud_2.graduate)
```

## Q9



```python
class Student:
	pass
Stud_1 = Student()
Stud_1.name = 'SriRam'
Stud_1.age = 25
Stud_1.graduate = 'MBA'
print("Stud_1.name:" ,Stud_1.name)
print("Stud_1.age:", Stud_1.age)
print("Stud_1.graduate:", Stud_1.graduate)
```

## Q10


```python
class Student:
	pass
Stud_1=Student()
Stud_2=Student()
# # write your code here
Stud_1.name=input("s1 name: ")
Stud_1.age=int(input("s1 age: "))
Stud_1.graduate=input("s1 degree: ")
Stud_2.name=input("s2 name: ")
Stud_2.age=int(input("s2 age: "))
Stud_2.graduate=input("s2 degree: ")
print("Stud_1.name:",Stud_1.name)
print("Stud_1.age:",Stud_1.age)
print("Stud_1.graduate:",Stud_1.graduate)
print("Stud_2.name:",Stud_2.name)
print("Stud_2.age:",Stud_2.age)
print("Stud_2.graduate:",Stud_2.graduate)
```

## Q11


```python
class Employee:
	pass
Emp_1=Employee()
Emp_1.age=25
Emp_1.salary=25000
Emp_1.name=input("name: ")
print("Emp_1.name:",Emp_1.name)
print("Emp_1.salary:",Emp_1.salary)
```

## Q12


```python
class Student:
	pass
Stud_1=Student()
# # write your code here
Stud_1.name=input("name: ")
Stud_1.age=int(input("age: "))
Stud_1.graduate=input("degree: ")
print("Stud_1.name:",Stud_1.name)
print("Stud_1.age:",Stud_1.age)
print("Stud_1.graduate:",Stud_1.graduate)
```

## Q13


```python
class Employee:
	pass
Emp_1=Employee()
Emp_1.name=input("name: ")
Emp_1.salary=int(input("salary: "))
print("Emp_1.name:",Emp_1.name)
print("Emp_1.salary:",Emp_1.salary)
```
