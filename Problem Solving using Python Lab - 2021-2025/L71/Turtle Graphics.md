
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

○ get_shapepoly() is used to define new numbers from previous number.

○ showturtle() | st() returns true/false on the visibility of the turtle.

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
