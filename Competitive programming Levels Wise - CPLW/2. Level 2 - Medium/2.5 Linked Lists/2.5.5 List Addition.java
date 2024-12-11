package q14742;
import java.util.Scanner;
class ListNode {
	int val;
	ListNode next;
	ListNode(int val) {
		this.val = val;
		this.next = null;
	}
}

public class CTJ14742 {
	public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		ListNode dummyHead = new ListNode(0);
		ListNode current = dummyHead;
		int carry = 0;
		while (l1 != null || l2 != null || carry > 0) {
			int sum = carry;
			if (l1 != null) {
				sum += l1.val;
				l1 = l1.next;
			}
			if (l2 != null) {
				sum += l2.val;
				l2 = l2.next;
			}
			carry = sum / 10;
			current.next = new ListNode(sum % 10);
			current = current.next;
		}
		return dummyHead.next;
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int m = scanner.nextInt();
		ListNode l1 = null, tail1 = null;
		for (int i = 0; i < m; i++) {
			int value = scanner.nextInt();
			ListNode newNode = new ListNode(value);
			if (l1 == null) {
				l1 = newNode;
				tail1 = l1;
			} else {
				tail1.next = newNode;
				tail1 = tail1.next;
			}
		}
		int n = scanner.nextInt();
		ListNode l2 = null, tail2 = null;
		for (int i = 0; i < n; i++) {
			int value = scanner.nextInt();
			ListNode newNode = new ListNode(value);
			if (l2 == null) {
				l2 = newNode;
				tail2 = l2;
			} else {
				tail2.next = newNode;
				tail2 = tail2.next;
			}
		}
		ListNode result = addTwoNumbers(l1, l2);
		while (result != null) {
			System.out.print(result.val + (result.next != null ? " " : " "));
			result = result.next;
		}
		System.out.println();
		scanner.close();
	}
}
