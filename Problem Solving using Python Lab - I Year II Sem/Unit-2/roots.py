a=int(input("Enter value of a "))
b=int(input("Enter value of b "))
c=int(input("Enter value of c "))
d=(b**2)-(4*a*c)
root1=(-b+((d)**(0.5)))/(2*a)
root2=(-b-((d)**(0.5)))/(2*a)
if d>0:
    print("Roots are real and distints.")
    print("x1 =",root1,", x2 =",root2)
elif d==0:
	print("Roots are real and equal.")
	print("x1 =",root1,", x2 =",root2)
else:
	print("Roots are imaginary.")
	
