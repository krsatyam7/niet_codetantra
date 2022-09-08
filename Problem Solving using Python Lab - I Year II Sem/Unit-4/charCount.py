str1=input("Please enter sentence: ")
mylist=[]
for i in str1:
	if i not in mylist:
		mylist.append(i)
mylist.sort()
for j in mylist:
	print("'"+str(j)+"'",str1.count(j),sep="\t")
print(mylist)
