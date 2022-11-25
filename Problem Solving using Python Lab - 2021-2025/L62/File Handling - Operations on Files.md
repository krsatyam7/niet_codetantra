
# File Handling - Operations on Files

## Q1

◻ An open statement returns the contents of the file

✅ The mode arguments tells how the file is to be opened, e.g. for
reading only, for writing only etc.

◻ The mode argument is a mandatory argument

◻ If we do not specify any path the file is assumed to be in the current
directory

## Q2

◻ Image files should be opened in text mode

✅ Student data containing name(string), age(integer), percentage (float)
should be stored as a binary file

◻ When you read a binary file, the statement returns a string

✅ Binary data is read and written in bytes objects and cannot be printed
directly

## Q3

◻ Read only

◻ Write only with override of existing file

✅ Write only with error if file is existing

◻ Append

## Q4

```python
import shutil
fr = open('TextData.txt', 'r') # Open the file for read
fw = open('NewFile.txt', 'w') # Open the file for write (new file)
# Read the file and copy it to the new file
shutil.copyfile('TextData.txt','NewFile.txt')
fr.close() # Close the
fw.close() # Close the
fr1 = open('NewFile.txt', 'r+') # Open the new file as read /
# read and print the first 12 characters
print(fr1.read(12))
# Print the read cursor position( position is 0 based)
print(fr1.tell())
print(fr1.write("this is the new text")) # Write some text (length 20). This is always
# Position the cursor at 12
fr1.seek(12)
print(fr1.tell())
# Read and print the next character (at cursor position 12)
print(fr1.readline(12),end="")
# Position the cursor at 15
fr1.seek(15)
print(fr1.tell())
print(fr1.readline(10))
# Read and print 10 characters from this position
print(fr1.readline(),end="")
# read() always reads the entire file irrespective of cursor position and changes the cursor position
print(fr1.read())
fr1.close() # Close the file
```

## Q5

```python
import pickle									# inports the pickle library
Students = [['John', '501', 20, 92.5],['Kohli', '502', 21, 95.5],
      ['Ganga','503', 20, 90.5],['Gayathri','504', 20, 82.5],
      ['Krishna','505', 20, 96.5]]				# Define the students in a list
fst = open("students.dat",'wb')					# Open the output file Notice the the b after w to indicate this is a binary file
for student in Students:
	pickle.dump(Students,fst)	#Fill the missing code		# Write the details of each student
fst.close()										# Close the output filr
fst = open("students.dat",'rb')					# Open the file as input binary
data = pickle.load(fst) #Fill the missing code		# Read the file record
c=0
try:											# The Endof file is indicated as EOFError exception, we need to catch this exception
  while(c!=1): 
  	for item in data:
  			print(item)
  	c=1
    # data = pickle.load(fst )
except:
	print("Bye")
print("Bye")
```

## Q6


```python
fr=open('InputData1.txt','r')
lines=fr.readlines()
for i in range(len(lines)):
	nl=lines[i]
	nls=nl.replace("\n","")
	print(nls[::-1])
```

## Q7

```python
fin = open('InputData2.txt' , 'r')
charCount = wordCount = lineCount = 0			#Initialize Counters
for line in fin:								#Read each Line
	lineCount+=1
	# write your logic here
	s=line
	l=s.split(" ")
	wordCount+=len(l)
	#Increment Line count
	for i in s:
		charCount+=len(i)
print("Line count = ", lineCount)  #Print the Counts
print("Word count = ", wordCount)
print("Char count = ", charCount)
```

## Q8

```python
import shutil
fin = open('InputData3.txt', 'r') #Open the text Files for input and output
fout = open('OutputData3.txt', 'w') #if the file is big we will read and write line by
shutil.copyfile('InputData3.txt','OutputData3.txt') #for each line
 #Write the line
fin.close() #Close the input file
fout.close() #Close the output file
  #Close the input file
   #Close the output file
fin = open('OutputData3.txt' , 'r') #Open the new file as input
print(fin.read()) #for each line
    #Print line
fin.close() 
```

