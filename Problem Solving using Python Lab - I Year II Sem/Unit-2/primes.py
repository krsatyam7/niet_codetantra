term1=int(input("Enter first number "))
term2=int(input("Enter last number "))
print("Prime numbers from ",term1,"to",term2,"are")
for i in range(term1,term2+1):
	if i==4:
		pass
	else:
		flag=0
		for j in range(2,i):
			if i%j==0:
				flag=1
				break
	if flag==0:
		print(i,end=' ')
		
	
