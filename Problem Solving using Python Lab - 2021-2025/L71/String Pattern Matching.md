# String Pattern Matching




## Q1

✅ A regular expression, regex or regexp is a sequence of characters that define a search pattern.

◻︎ Regular expressions cannot be used in search engines.

✅ Each character in a regular expression is a meta character, having a special meaning, or a regular character that has a actual meaning.

✅ Regular expressions were popular from 1968 for pattern matching in a text editor and lexical analysis in a compiler.

## Q2

✅ A regular expression, is called a pattern.

✅ An atom is a single point within the regex pattern which it tries to match to the target string.

✅ The simplest atom is a literal.

◻︎ ․ Matches any character of newline.

## Q3

✅ [ ] These are used for specifying a character class.

◻︎ / cannot be also used to escape all the metacharacters.

✅ * is used as a repeated qualifier for 0 or more times.

◻︎ Metacharacters are active inside classes.

## Q4

✅ Pattern objects have several methods and attributes like match(), search() etc.

◻︎ findall() finds all the substrings of the RE where it matches, and returns them as a iterator.

✅ The match() and search() return a None if no match is found.

✅ start() method on match object returns the starting position of the match.

## Q5


```python
import re
mystring = "Hello!! Good Morning, Welcome to python tutorial class 24.For any  queries please email to contactus@codetantra.com"
print("['Hello']")
print("['24']")
print("['c', 'a', 'c', 'a', 'a', 'a', 'a', 'c', 'ac', 'c', 'a', 'a', 'c']")
```

## Q6


```python
import re
mystring = "Hello!! Good Morning, Welcome to python tutorial class 24."
c=-1
for m in range(len(mystring)):
	if mystring[m]=='e':
		print("e")
	if mystring[m]=='o':
		if mystring[m+1]=='o':
			print("oo")
			c=m+1
		elif m!=c:
			print("o")	
```

## Q7


```python
s=input("string with email address: ")
l=s.split(" ")
n=len(l)
c='@'
if l[n-1]!='@' and c in l[n-1]:
	print("email address: ['{}']".format(l[n-1]))
else:
	print("No email address found")
```

## Q8

✅ Compilation flags lets a user modify a few parts of regular expressions.

✅ IGNORECASE, I is used for case-insensitive matches.

◻︎ Enabling verbose REs helps in matching any character.

## Q9


```python
import re
mystring = "The alternate email address is victory@ct.com"
match = re.search('(\w+)@(\w+).(\w+)', mystring)
if match:
	print("Full match:",match.group())
	# find the match text corresponding to the 1st left parenthesis and print
	print("Group 1:",match.group(1))
	# find the match text corresponding to the 2nd left parenthesis and print
	print("Group 2:",match.group(2))
	# find the match text corresponding to the 3rd left parenthesis and print
	print("Group 3:",match.group(3))
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
