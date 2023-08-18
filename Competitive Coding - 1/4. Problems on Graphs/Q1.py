import sys

s = sys.argv[1]
start = int(sys.argv[2])
end = int(sys.argv[3])

def shortestDistance(s, start, end):
  # write code from here
	s=s.split()
	n=int(len(s)**0.5)
	costs = [float('inf') for i in range(n)]
	stack = [start-1]
	s =list(map(int,s))
	graph = []
	for i in range(n):
		temp = []
		for j in range(n):
			temp.append(s.pop(0))
		graph.append(temp)
	costs[start-1] = 0
	while(stack):
		current = stack[0]
		for i in range(n):
			if graph[current][i]!=0:
				newcost = graph[current][i]+costs[current]
				if newcost<costs[i]:
					costs[i]=newcost
					stack.append(i)
		stack.pop(0)
	return costs[end-1]
  # ends here
print(shortestDistance(s, start, end))
