# Namespace




## Q1


✅ Each module gets it's own global namespaces.

✅ The builtin functions that can be used in any module are called
**builtin** and have their own namespace.

✅ The namespaces are isolated which means the names in one module can be
used in another module.

◻ Two modules in the same namespace can have the same names.


## Q2

✅ Namespaces in python are very helpful in organising the code in very
large projects.

✅ In Python, an identifier is used to name a variable to function and
just about anything.

✅ A namespace is a place that holds a bunch of names.

◻ A namespace holds only names of the current module but not the
imported modules.

## Q3

✅ A scope refers to the specific area of a program where the variables
of that namespace do not need a prefix.

✅ All modules have a global namespace on their own.

◻ All the builtins do not have a scope on their own and share the global
namespace.

✅ One function cannot access the names inside an other function.

## Q4

✅ A local scope, the list of all the names available in the current
executing function.

✅ A module level scope that is a list of all the global names of the
current module.

◻ The built-in names scope is first search that happens when searching
the name in the namespace.

## Q5

```python
name = "Ram"
greeting = "Good Morning"
# print dir
print(dir())
def func1():
	greeting = "Good Afternoon"
	# print dir
	print(dir())
def func2():
	greeting = "Good Evening"
	print(dir())
		# call the function func1
func1()
		# call the function func2
func2()
```
