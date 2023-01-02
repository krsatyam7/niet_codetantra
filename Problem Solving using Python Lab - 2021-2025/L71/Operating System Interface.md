# Operating System Interface



## Q1

✅ Operating System module is one of the modules that is mostly used in Python.

✅ We use the OS module to talk to the underlying operating system.

◻︎ OS is not a built-in module.

✅ All functions in the OS module raise an OSError in case of an exception.

## Q2


```python
import os
try:
	print("File name of the process:", os.ctermid())
	
	print("Groups List:",list(os.getgroups()))# print the user group details using os.getgroups
except TypeError:
	print("Exception on gettig one of the details")
```

## Q3


```python
import os
# print the current working directory
print(os.getcwd())
# lists all the files in the current directory
print(os.listdir())
os.makedirs('dir1/sub-dir1')
# lists all the files in the current directory
print(os.listdir())
# deletes created directory and the required sub directory
os.removedirs('dir1/sub-dir1')
print(os.listdir())
```

## Q4


```python
import os
print('Statistics of file some_file.txt',os.stat('Some_File.txt'))
tup=os.walk(os.getcwd())
for dirpath,dirname,filename in tup:
	print("path:",dirpath)
	print("dir name:",dirname)
	print("file name:",filename)
```

## Q5


```python
import os
print(os.getcwd())
os.mkdir("new_dir/new_sub_dir/")
print(os.getcwd())
os.rmdir("new_dir/new_sub_dir/")
print(os.stat("new_file.txt"))
```
