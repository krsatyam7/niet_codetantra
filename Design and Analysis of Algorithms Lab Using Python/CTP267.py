# Q12

def dfs(graph, start, visited):
	visited.add(start)
	if n>0 and m>0:
		print(start, end=" ")
	else:
		print(start, end="")
	
	for neighbor in graph[start]:
		if neighbor not in visited:
			dfs(graph, neighbor, visited)
			
n = int(input())
m = int(input())

# Creating an adjacency list for the graph
graph = {i: [] for i in range(n)}

# Populating the adjacency list
for i in range(m):
	u, v = map(int, input().split())
	graph[u].append(v)
	graph[v].append(u)

# Starting vertex for DFS
start = int(input())

# Visited set to keep track of visited vertices
visited = set()

# Perform DFS
dfs(graph,start,visited)

# failing 1 hidden testcase :(
