package q14748;
import java.util.Scanner;
class ListNode {
	int val;
	ListNode next;
	ListNode(int val) {
		this.val = val;
		this.next = null;
	}
}

public class CTJ14748 {
	public static int maxTwinSum(ListNode head) {
		ListNode slow = head;
		ListNode fast = head;
		while (fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
		}
		ListNode secondHalf = reverseList(slow);
		ListNode firstHalf = head;
		int maxSum = 0;
		while (secondHalf != null) {
			maxSum = Math.max(maxSum, firstHalf.val + secondHalf.val);
			firstHalf = firstHalf.next;
			secondHalf = secondHalf.next;
		}
		return maxSum;
	}
	
	public static ListNode reverseList(ListNode head) {
		ListNode prev = null;
		while (head != null) {
			ListNode next = head.next;
			head.next = prev;
			prev = head;
			head = next;
		}
		return prev;
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
		int result = maxTwinSum(head);
		System.out.println(result);
		scanner.close();
	}
}
