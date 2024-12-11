package q13669;
import java.util.*;
class Node {
	int val;
	Node next;
	Node(int val) {
		this.val = val;
		this.next = null;
	}
}

public class CTJ13669 {
	public static void CompressList(Node head) {
		if (head == null) return;
		Map<Integer, Integer> countMap = new HashMap<>();
		Node current = head;
		while (current != null) {
			countMap.put(current.val, countMap.getOrDefault(current.val, 0) + 1);
			current = current.next;
		}
		
		Node dummy = new Node(0);
		Node prev = dummy;
		current = head;
		while (current != null) {
			if (countMap.get(current.val) == 1) {
				prev.next = current;
				prev = prev.next;
			}
			current = current.next;
		}
		prev.next = null;
		Node resultHead = dummy.next;
		if (resultHead == null) {
			System.out.println("null");
		} else {
			while (resultHead != null) {
				System.out.print(resultHead.val + (resultHead.next != null ? " " : " "));
				resultHead = resultHead.next;
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		Node head = null;
		Node tail = null;
		for (int i = 0; i < N; i++) {
			int value = scanner.nextInt();
			Node newNode = new Node(value);
			if (head == null) {
				head = newNode;
				tail = head;
			} else {
				tail.next = newNode;
				tail = tail.next;
			}
		}
		CompressList(head);
		scanner.close();
	}
}
