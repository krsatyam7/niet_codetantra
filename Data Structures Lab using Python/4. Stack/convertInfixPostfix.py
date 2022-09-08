op = set(['*','-','+','/','(',')','^'])  #Operator
pr = {'+':1,'-':1,'*':2,'/':2,'^':3}     #PrecedenceOfOperator
def convertInfixPostfix(exp):
	stk=[]
	output=''
	for ch in exp:
		if ch not in op:
			output+=ch
		elif ch == '(':
			stk.append('(')
		elif ch == ')':
			while stk and stk[-1]!='(':
				output+=stk.pop()
			stk.pop()
		else:
			while stk and stk[-1]!='(' and pr[ch]<=pr[stk[-1]]:
				output+=stk.pop()
			stk.append(ch)
	while stk:
		output+=stk.pop()
	return output

data = input("Enter infix expression")
print("infix expression: ",data)
print("postfix expression: ",convertInfixPostfix(data))
