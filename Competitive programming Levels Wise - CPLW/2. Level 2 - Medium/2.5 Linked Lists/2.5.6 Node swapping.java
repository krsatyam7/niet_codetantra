package q14743;
import java.util.Scanner;
class ListNode {
	int val;
	ListNode next;
	ListNode(int val) {
		this.val = val;
		this.next = null;
	}
}

public class CTJ14743 {
	public static ListNode swapPairs(ListNode head) {
		if (head == null || head.next == null) {
			return head;
		}
		ListNode newHead = head.next;
		ListNode prev = null;
		while (head != null && head.next != null) {
			ListNode first = head;
			ListNode second = head.next;
			first.next = second.next;
			second.next = first;
			if (prev != null) {
				prev.next = second;
			}
			prev = first;
			head = first.next;
		}
		return newHead;
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		ListNode head = null, tail = null;
		for (int i = 0; i < n; i++) {
			int value = scanner.nextInt();
			ListNode newNode = new ListNode(value);
			if (head == null) {
				head = newNode;
				tail = head;
			} else {
				tail.next = newNode;
				tail = tail.next;
			}
		}
		ListNode result = swapPairs(head);
		while (result != null) {
			System.out.print(result.val + (result.next != null ? " " : " "));
			result = result.next;
		}
		System.out.println();
		scanner.close();
	}
}
