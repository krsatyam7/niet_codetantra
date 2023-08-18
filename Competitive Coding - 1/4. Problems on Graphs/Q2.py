import sys
r = int(sys.argv[1])
c = int(sys.argv[2])
m = sys.argv[3]
start = sys.argv[4]
cheese = sys.argv[5]
def lengthOfShortestPath(r, c, m, start, cheese):
    # Write code from here
    start_row, start_col = map(int, start.split(','))
    cheese_row, cheese_col = map(int, cheese.split(','))
    visited = [[False for _ in range(c)] for _ in range(r)]
    q = [(start_row, start_col, 0)]
    visited[start_row][start_col] = True
    row = [-1, 0, 1, 0]
    col = [0, 1, 0, -1]
    while q:
        cell = q.pop(0)
        if cell[0] == cheese_row and cell[1] == cheese_col:
            return cell[2]
        for i in range(4):
            new_row = cell[0] + row[i]
            new_col = cell[1] + col[i]
            if (new_row >= 0 and new_row < r and new_col >= 0 and new_col < c and not visited[new_row][new_col] and m[new_row*c + new_col] == '1'):
                visited[new_row][new_col]= True
                q.append((new_row, new_col, cell[2]+1))
    return -1
	# ends here
print(lengthOfShortestPath(r, c, m, start, cheese))
