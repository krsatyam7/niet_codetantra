n=int(input("Enter n: "))
space=n-2
star=1
for i in range(1,n):
	for j in range(space):
		print(' ',end=' ')
	for k in range(star):
		print('*',end=' ')
	space-=1
	star+=2
	print()
