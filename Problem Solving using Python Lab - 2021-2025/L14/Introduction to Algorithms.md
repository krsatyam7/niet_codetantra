# Introduction to Algorithms






## Q1

✅ Problem solving is a systematic approach to define and solve a problem.

◻︎ The order to solve a problem is to first provide the solution followed by the problem definition.

✅ Few techniques are required to solve a particular problem which help in deriving a logic to solve the problem.

◻︎ Algorithms, Flowcharts, Pie Charts are some of the techniques of problem solving.

✅ Algorithms,Flowcharts, Pseudo Code and Programs are the techniques used to solve a problem.

## Q2

◻︎ Algorithm means a mathematical formula.

✅ It is very easy to write the code in any programming language after developing an algorithm for that problem.

◻︎ Only one algorithm can be written for any problem.

✅ After a finite number of steps an algorithm must reach an end state.

## Q3

◻︎ The more time an algorithm takes to execute, the better is the algorithm.

✅ The lesser memory a program takes to execute, better is the algorithm.

◻︎ Only one algorithm can be written for any problem and is the only preferred way.

◻︎ The quality of an algorithm is determined by the person who wrote it.

## Q4


```python
miles = int(input("miles: "))
if (miles > 0):
    print("kilometers:",miles*1.609)
    # convert the given miles into kilometers and print the result
    
else:
    print("not positive value")

```

## Q5


```python
t=input("temp with unit: ")
g=t[0:-1]
n=int(g)
x=t[-1:]
s=['c','C','f','F']
if x in s:
    if (x=='c')or (x=='C'):
        a=n*9/5+32
        y=round(a,2)
        print(n,"C =",y,"F")

    else:
        b=(5/9)*(n-32)
        z=round(b,2)
        print(n,"F =",z,"C")
else:
    print("unrecognized unit:",x)
```
