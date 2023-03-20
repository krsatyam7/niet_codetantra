# Q15

from collections import defaultdict

class Graph:
	def __init__(self, vertices):
		self.V = vertices
		self.graph = []
		
	def add_edge(self, u, v, w):
		self.graph.append([u, v, w])
	    	                    	        
	def find(self, parent, i):
		if parent[i] == i:
			return i
		return self.find(parent, parent[i])
			                    
	def union(self, parent, rank, x, y):
		xroot = self.find(parent, x)
		yroot = self.find(parent, y)
		
		if rank[xroot] < rank[yroot]:
			parent[xroot] = yroot
		elif rank[xroot] > rank[yroot]:
			parent[yroot] = xroot
		else:
			parent[yroot]
			rank[xroot] += 1
	
	def kruskal_mst(self):
		result = []
		i = 0
		e = 0
		self.graph = sorted(self.graph,key=lambda item: item[2])
		parent = []
		rank = []
		
		for node in range(self.V):
			parent.append(node)
			rank.append(0)
		
		num_connected_components = self.V
		for u,v,w in self.graph:
			x,y=self.find(parent,u),self.find(parent,v)
			if x != y:
				num_connected_components -= 1
				self.union(parent,rank,x,y)
				
		if num_connected_components > 1:
			return None
		for node in range(self.V):
			parent[node]=node
			rank[node]=node
					
					
		while e < self.V - 1:
			u,v,w = self.graph[i]
			i += 1
			x,y=self.find(parent,u),self.find(parent,v)
			if x != y:
				e += 1
				result.append([u,v,w])
				self.union(parent ,rank,x,y)
		return result
V=int(input())
e=int(input())

g=Graph(V)

for _ in range(e):
	u,v,w=map(int,input().split())
	g.add_edge(u,v,w)
	        
result=g.kruskal_mst()
	        
for u,v,w in result:
	print(f"{u} - {v} ----> {w}")
