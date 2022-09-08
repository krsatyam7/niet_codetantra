fin = open('InputData2.txt' , 'r')
charCount = wordCount = lineCount = 0			#Initialize Counters
for line in fin:								#Read each Line

	# write your logic here
	line.strip("\n")
	words=line.split()

	#Increment Line count
	lineCount+=1

	#split() gives the words in a list
	wordCount+=len(words)

	#Increment Character Count
	charCount+=len(line)

fin.close()
print("Line count = ", lineCount)  #Print the Counts
print("Word count = ", wordCount)
print("Char count = ", charCount)
