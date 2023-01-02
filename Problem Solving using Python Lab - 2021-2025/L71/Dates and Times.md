# Dates and Times




## Q1

✅ The datetime module has many classes for manipulating dates and times.

✅ The implementation provided by datetime classes are very efficient for output formatting and manipulation of date and time.

✅ An aware object has information of algorithmic time adjustments, such as time zone and daylight saving time information.

◻︎ A naive object contains enough information to locate itself relative to other date/time objects.

✅ The tzinfo objects store information about the offset from UTC time.

## Q2


```python
import datetime
from datetime import date
from datetime import timedelta
d=input("date in yyyy-mm-dd format: ")
days=int(input("days to add the current date: "))
year, month, day = d.split('-')
d = datetime.date(int(year), int(month), int(day)) # converting string data into int 
d = d+timedelta(days)
print(d)
print("weekday(0-6):",date.weekday(d))
print("weekday(1-7):",date.isoweekday(d))
```

## Q3


```python
from datetime import date
s=input("date in yyyy-mm-dd format: ")
dt=s.split("-")
if '0' in dt[1]:
	print("date:",s)
else:
	print("date: {}-0{}-{}".format(dt[0],dt[1],dt[2]))
c=int(dt[1])
d=0
while(c!=0):
	t=c%10
	d=d+t
	c=c//10
print("month: {} ,day: {} ,year: {}".format(d,dt[2],dt[0]))
yba=int(input("year before/after the current year: "))
yc=int(dt[0])
if yba<=yc:
	print("{} years before the current year".format(yc-yba))
else:
	print("{} years after the current year".format(yba-yc))
```

## Q4


```python
import datetime
from datetime import date
from datetime import timedelta
d=input("date in yyyy-mm-dd format: ")
# take the date input from the user
year, month, day = d.split('-')
d = datetime.date(int(year), int(month), int(day))
d=d+datetime.timedelta(days=3)
# add 3 days to the given date using timedelta function
print("adding 3 days:",d)
```

## Q5


```python
from datetime import timedelta,date
del1=timedelta(int(input("days in 1st year: ")))
del2=timedelta(int(input("days in 2nd year: ")))
print("d3 = d1 - d2:",(del1-del2))
print("d3 = d1 + d2:",del1+del2)
print("d3 = d1 / d2:",del1/del2)
print("d3 = d1 % d2:",del1%del2)
print("d3 = d1 * 2:",del1*2)
```

## Q6


```python
import datetime
from datetime import date
from datetime import timedelta
d=input("date in yyyy-mm-dd format: ")
n=int(input("weeks: "))
year,month,day=d.split("-")
d=datetime.date(int(year),int(month),int(day))
d=d+datetime.timedelta(weeks=n)
print("date after",n,"weeks:",d)
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
