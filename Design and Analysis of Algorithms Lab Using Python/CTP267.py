# Q12 (answer updated)

n = int(input())
m = int(input())

graph = [[] for _ in range(n)]
for _ in range(m):
	u, v = map(int, input().split())
	graph[u].append(v)

for i in range(n):
	graph[i].sort(reverse=True)
	        
start_vertex = int(input())
	        
def dfs(graph, start_vertex):
	visited = [False] * len(graph)
	stack = [start_vertex]
	
	while stack:
		vertex = stack.pop()
		if not visited[vertex]:
			print(vertex, end=' ')
			visited[vertex] = True
			for neighbor in graph[vertex]:
				if not visited[neighbor]:
					stack.append(neighbor)
dfs(graph, start_vertex)
