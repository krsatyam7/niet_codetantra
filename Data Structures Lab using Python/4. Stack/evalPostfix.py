class evalPostfix:
	def __init__(self,data):
		self.top=-1
		self.data=data
		self.array=[]
	def isempty(self):
		return Turn if self.top == -1 else False
	def peak(self):
		return self.array[-1]
	def pop(self):
		if not self.isempty():
			self.top-=1
			return self.array.pop()
		else:
			return "$"
	def push(self,op):
		self.top+=1
		self.array.append(op)
	def EPF(self,exp):
		for i in exp:
			if i.isdigit():
				self.push(i)
			else:
				val1=self.pop()
				val2=self.pop()
				self.push(str(eval(val2+i+val1)))
		return self.pop()
exp = input("Enter Postfix expression")
obj = evalPostfix(len(exp))
find = obj.EPF(exp)
print(f"Result of Postfix expression {exp} is {int(float(find))}")
