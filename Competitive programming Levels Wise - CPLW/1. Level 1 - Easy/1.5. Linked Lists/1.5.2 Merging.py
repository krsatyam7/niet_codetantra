class Node:
	def __init__(self, data):
		self.data = data
		self.next = None

def create_linked_list(values):
	if not values:
		return None
	head = Node(values[0])
	current = head
	for value in values[1:]:
		current.next = Node(value)
		current = current.next
	return head

def merge_sorted_lists(headA, headB):
	dummy = Node(0)
	tail = dummy
	while headA and headB:
		if headA.data < headB.data:
			tail.next = headA
			headA = headA.next
		else:
			tail.next = headB
			headB = headB.next
		tail = tail.next
	if headA:
		tail.next = headA
	elif headB:
		tail.next = headB
	return dummy.next

def linked_list_to_list(head):
	result = []
	while head:
		result.append(head.data)
		head = head.next
	return result

def main():
	N1, N2 = map(int, input().split())
	valuesA = list(map(int, input().split())) if N1 > 0 else []
	valuesB = list(map(int, input().split())) if N2 > 0 else []
	headA = create_linked_list(valuesA)
	headB = create_linked_list(valuesB)
	merged_head = merge_sorted_lists(headA, headB)
	merged_list = linked_list_to_list(merged_head)
	print(" ".join(map(str, merged_list)),"")

main()
