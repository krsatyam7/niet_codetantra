terms=int(input("Enter number of terms "))
evensum=0
oddsum=0
for i in range(0,terms+1):
	if i%2==0:
		evensum=evensum+i
	else:
		oddsum=oddsum+i
print("EVEN =",evensum)
print("ODD =",oddsum)
