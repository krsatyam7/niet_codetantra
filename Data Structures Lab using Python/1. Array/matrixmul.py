print("Enter values for matrix - A")
m=int(input("Number of rows, m = "))
n=int(input("Number of columns, n = "))
matrix_A=[]
for i in range(1,m+1):
	mat_A=[]
	for j in range(1,n+1):
		print("Entry in row:",i,"column:",j)
		temp1=int(input())
		mat_A.append(temp1)
	matrix_A.append(mat_A)
print("Enter values for matrix - B")
p=int(input("Number of rows, m = "))
q=int(input("Number of columns, n = "))
matrix_B=[]
for k in range(1,p+1):
	mat_B=[]
	for l in range(1,q+1):
		print("Entry in row:",k,"column:",l)
		temp2=int(input())
		mat_B.append(temp2)
	matrix_B.append(mat_B)
print("Matrix - A =",matrix_A)
print("Matrix - B =",matrix_B)
#EmptyList for the resultant matrix
resultant=[]
#Our resultant will be row of first matrix x column of second
for a in range(m):
	row=[]
	for b in range(q):
		row.append(0)
	resultant.append(row)
for c in range(m):
	for d in range(q):
		for e in range(n):
			resultant[c][d]+=matrix_A[c][e]*matrix_B[e][d]
final=[]
for row in resultant:
	final.append(row)
print("Matrix - A * Matrix- B =",final)
