package q13671;
import java.util.Scanner;
class Node {
	int data;
	Node next;
	Node(int data) {
		this.data = data;
		this.next = null;
	}
}
public class CTJ13671 {
	static Node head;
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		head = null;
		for (int i = 0; i < N; i++) {
			int value = scanner.nextInt();
			addNode(value);
		}
		rearrange(head);
		printList(head);
	}
	static void addNode(int data) {
		Node newNode = new Node(data);
		if (head == null) {
			head = newNode;
		} else {
			Node temp = head;
			while (temp.next != null) {
				temp = temp.next;
			}
			temp.next = newNode;
		}
	}
	static void rearrange(Node head) {
		if (head == null || head.next == null) {
			System.out.println("Invalid");
			return;
		}
		boolean less = true;
		Node current = head;
		while (current != null && current.next != null) {
			if (less) {
				if (current.data >= current.next.data) {
					swap(current, current.next);
				}
			} else {
				if (current.data <= current.next.data) {
					swap(current, current.next);
				}
			}
			less = !less;
			current = current.next;
		}
	}
	static void swap(Node node1, Node node2) {
		int temp = node1.data;
		node1.data = node2.data;
		node2.data = temp;
	}
	static void printList(Node head) {
		Node current = head;
		while (current != null) {
			System.out.print(current.data + " ");
			current = current.next;
		}
		System.out.println();
	}
}
