# Mathematical Functions


## Q1


```python
import math
num = float(input("num: "))
if num - int(num) >=.5:
    print ("result:", math.ceil(num))
else:
    print("result:", math.trunc(num))
```

# Random Number Functions

## Q1

✅ random() function returns random values between 0.0 and 1.0 only.

◻ If we are not specifying step in randrange(), interpreter raises an Error.

◻ using shuffle() function we can reshuffle the tuple.
