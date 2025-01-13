package q13060;
import java.util.Scanner;
class Node {
	int data;
	Node next;
	Node(int data) {
		this.data = data;
		this.next = null;
	}
}
public class CTJ13060 {
	static Node head;
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		head = null;
		while (true) {
			int value = scanner.nextInt();
			if (value == -1) break;
			addNode(value);
		}
		head = removeDuplicates(head);
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
	static Node removeDuplicates(Node head) {
		if (head == null) return null;
		Node current = head;
		while (current != null && current.next != null) {
			if (current.data == current.next.data) {
				current.next = current.next.next;
			} else {
				current = current.next;
			}
		}
		return head;
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
