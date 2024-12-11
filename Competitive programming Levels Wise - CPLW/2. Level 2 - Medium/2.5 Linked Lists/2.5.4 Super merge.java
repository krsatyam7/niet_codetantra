package q14734;
import java.util.*;
class ListNode {
	int val;
	ListNode next;
	ListNode(int val) {
		this.val = val;
		this.next = null;
	}
}

public class CTJ14734 {
	public ListNode mergeKLists(List<ListNode> lists) {
		if (lists == null || lists.size() == 0) {
			return null;
		}
		PriorityQueue<ListNode> minHeap = new PriorityQueue<>(Comparator.comparingInt(node -> node.val));
		for (ListNode head : lists) {
			if (head != null) {
				minHeap.add(head);
			}
		}
		ListNode dummy = new ListNode(0);
		ListNode current = dummy;
		while (!minHeap.isEmpty()) {
			ListNode smallestNode = minHeap.poll();
			current.next = smallestNode;
			current = current.next;
			if (smallestNode.next != null) {
				minHeap.add(smallestNode.next);
			}
		}
		return dummy.next;
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int K = scanner.nextInt();
		List<ListNode> lists = new ArrayList<>();
		for (int i = 0; i < K; i++) {
			int size = scanner.nextInt();
			ListNode dummyHead = new ListNode(0);
			ListNode current = dummyHead;
			for (int j = 0; j < size; j++) {
				int value = scanner.nextInt();
				current.next = new ListNode(value);
				current = current.next;
			}
			lists.add(dummyHead.next);
		}
		CTJ14734 merger = new CTJ14734();
		ListNode mergedHead = merger.mergeKLists(lists);
		ListNode current = mergedHead;
		while (current != null) {
			System.out.print(current.val + (current.next != null ? " " : ""));
			current = current.next;
		}
		System.out.println(" ");
	}
}
