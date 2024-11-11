class Node:
	def __init__(self, data):
		self.data = data
		self.next = None

def create_linked_list(sizes, loop_position):
	head = Node(sizes[0])
	current = head
	nodes_list = [head]
	for size in sizes[1:]:
		new_node = Node(size)
		current.next = new_node
		current = new_node
		nodes_list.append(new_node)
	if loop_position > 0 and loop_position <= len(nodes_list):
		current.next = nodes_list[loop_position - 1]
	elif loop_position == 0:
		current.next = None
	return head

def has_loop(head):
	slow = head
	fast = head
	while fast and fast.next:
		slow = slow.next
		fast = fast.next.next
		if slow == fast:
			return True
	return False

def check_loop_in_memory_allocation(N, sizes, loop_position):
	if loop_position < 0 or loop_position > N:
		return "Invalid"
	head = create_linked_list(sizes, loop_position)
	if has_loop(head):
		return True
	else:
		return False

N = int(input())
sizes = list(map(int, input().split()))
loop_position = int(input())
result = check_loop_in_memory_allocation(N, sizes, loop_position)
print(result)
