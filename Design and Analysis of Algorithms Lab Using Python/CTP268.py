# Q13

from collections import defaultdict

def bfs(graph, start):
	visited = set()
	queue = []
	visited.add(start)
	queue.append(start)
	
	
	while queue:
		vertex = queue.pop(0)
		print(vertex, end=' ')
		for neighbor in graph[vertex]:
			if neighbor not in visited:
				visited.add(neighbor)
				queue.append(neighbor)
				
n = int(input())
m = int(input())
graph = defaultdict(list)

for i in range(m):
	u, v = map(int, input().split())
	graph[u].append(v)
	graph[v].append(u)

start_vertex = int(input())
bfs(graph, start_vertex)


# failing 1 hidden testcase :(
