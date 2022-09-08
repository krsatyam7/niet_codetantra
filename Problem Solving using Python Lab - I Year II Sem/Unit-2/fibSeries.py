n=int(input("Enter number of terms "))
t1,t2=-1,1
sumt=0
for i in range(1,n+1):
	nextterm=t1+t2
	sumt=sumt+nextterm
	t1=t2
	t2=nextterm
print("Sum of Fibonacci series upto ",n,"th terms",sumt)
