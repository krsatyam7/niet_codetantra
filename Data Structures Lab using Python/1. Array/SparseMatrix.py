print("Enter values for Matrix ")
m = int(input("Number of rows, m = "))
n = int(input("Number of columns, n = "))
result=[]
for i in range(1,m+1):
	temp=[]
	for j in range(1,n+1):
		print("Entry in row:",i,"column:",j)
		temp2=int(input())
		temp.append(temp2)
	result.append(temp)
print("Matrix  =",result)
print("Sparse Matrix: ")
for i in range(len(result)):
	for j in range(len(result[i])):
		if result[i][j] !=0:
			print(i,j,result[i][j],"")
	
