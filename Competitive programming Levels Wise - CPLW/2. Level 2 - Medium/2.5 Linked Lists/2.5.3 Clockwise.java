package q13670;
import java.util.Scanner;
class Node {
	int val;
	Node next;
	Node(int val) {
		this.val = val;
		this.next = null;
	}
}

public class CTJ13670 {
	public static Node rotateClockwise(Node head, int k) {
		if (head == null || head.next == null || k == 0) {
			return head;
		}
		Node current = head;
		int length = 1;
		while (current.next != null) {
			current = current.next;
			length++;
		}
		current.next = head;
		k = k % length;
		if (k == 0) {
			current.next = null;
			return head;
		}
		int stepsToNewHead = length - k;
		current = head;
		for (int i = 0; i < stepsToNewHead - 1; i++) {
			current = current.next;
		}
		Node newHead = current.next;
		current.next = null;
		return newHead;
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
		int k = scanner.nextInt();
		head = rotateClockwise(head, k);
		Node current = head;
		while (current != null) {
			System.out.print(current.val + (current.next != null ? " " : " "));
			current = current.next;
		}
		System.out.println();
		scanner.close();
	}
}
