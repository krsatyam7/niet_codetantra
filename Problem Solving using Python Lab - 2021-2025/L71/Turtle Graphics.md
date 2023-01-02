
# Turtle Graphics




## Q1

✅ Turtle module is a part of standard library.

◻︎ It was developed in 2002.

◻︎ returned object is a singleton object and can be subclassed

## Q2

◻︎ turtle.speed() Sets the turtle’s speed in the range 0 to 100.

✅ turtle.setx(x) Sets the Turtle to x coordinate.

## Q3

⦿ tilt() Returns the tilt angle

◯ get_shapepoly() is used to define new numbers from previous number.

◯ showturtle() | st() returns true/false on the visibility of the turtle.

## Q4

No any question

## Q5

No any question

## Q6


```python
import turtle
screen = turtle.Screen()
turtle.penup()
turtle.write("Press the Up/Down or a to change background color ", font = ('Arial', 10, 'bold'))
def up():
	screen.bgcolor('blue')
def down():
	screen.bgcolor('green')
screen.onkey(up, "Up")
screen.onkeypress(down, "Down")
screen.listen()
turtle.done()
```

## Q7


```python
from datetime import time,datetime
# create a time object with hour = 6, minute = 30, second = 56, microsecond = 30
t1=time(hour=6,minute=30,second=56,microsecond=30)
# print the created time object t1
print("Time object created t1:",t1)
```

## Q8


```python
import datetime
d=input("date in yyyy-mm-dd format: ")
year,month,day=d.split("-")
d=datetime.date(int(year),int(month),int(day))
print("date, time object:",d)
print("{} day of week".format(d.isoweekday()))
```

## Q9


```python
from datetime import datetime
import datetime
from datetime import date
import calendar
import locale
d=input("date in yyyy-mm-dd format: ")
dt=d
li=dt.split("-")
year,month,day=d.split("-")
di=datetime.date(int(year),int(month),int(day))
cday=di.strftime("%a")
cmth=di.strftime("%b")
cdate=di.strftime("%x")
print("date, time in locale format: {} {} {} 00:00:00 {}".format(cday,cmth,int(li[2]),int(li[0])))
print("weekday in locale format:",cday)
print("date in locale format:",cdate)
```

## Q10


```python
s=input("data: ")
c=1
for i in s:
	if i==',':
		c=c+1
if c==4:
	l=s.split(",")
	print("full: {},{},{},{}".format(l[0],l[1],l[2],l[3]))
	print("group 1:",l[0])
	print("group 2:",l[1])
	print("group 3:",l[2])
	print("group 4:",l[3])
else:
	print("you have not entered 4 words")
```
