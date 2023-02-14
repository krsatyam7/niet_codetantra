# Q12

def dfs(adj_list, start, visited):
	visited.add(start)
	print(start, end=' ')
	
	for v in adj_list[start]:
		if v not in visited:
			dfs(adj_list, v, visited)
			
n = int(input())
m = int(input())

# Creating an adjacency list for the graph
adj_list = [[] for _ in range(n)]

# Populating the adjacency list
for _ in range(m):
	u, v = map(int, input().split())
	adj_list[u].append(v)
	adj_list[v].append(u)

# Starting vertex for DFS
start = int(input())

# Visited set to keep track of visited vertices
visited = set()

# Perform DFS
dfs(adj_list,start,visited)

''' 
In this problem, the expexted testcases outputs are not correct.
Testcase 1 expected output ==> 0·1·2·
Testcase 2 expected output ==> 0
Here  ﹒ stands for a space. 
'''

