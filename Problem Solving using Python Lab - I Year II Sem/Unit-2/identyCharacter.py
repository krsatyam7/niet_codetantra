char=str(input("Enter any alphabet or digit "))
if char=='0' or char=='1' or char=='2' or char=='3' or char=='4' or char=='5' or char=='6' or char=='7' or char=='8' or char=='9':
	print(char,"is a digit.")
elif char=='a' or char=='e' or char=='i'or char=='o' or char=='u' or char=='A' or char=='E' or char=='I' or char=='O' or char=='U':
	print(char,"is a vowel.")
else:
	print(char,"is a consonant.")
	
