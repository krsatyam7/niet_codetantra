package q13629;
import java.util.*;
public class CTJ13629 {
	static class Node {
		int data;
		Node next;
		Node(int data) {
			this.data = data;
			this.next = null;
		}
	}
	
	static class LinkedList {
		Node head;
		public void append(int data) {
			if (head == null) {
				head = new Node(data);
				return;
			}
			Node current = head;
			while (current.next != null) {
				current = current.next;
			}
			current.next = new Node(data);
		}
		
		public void removeDuplicates() {
			Set<Integer> seen = new HashSet<>();
			Node current = head;
			Node prev = null;
			while (current != null) {
				if (seen.contains(current.data)) {
					prev.next = current.next;
				} else {
					seen.add(current.data);
					prev = current;
				}
				current = current.next;
			}
		}
		
		public void printList() {
		Node current = head;
		while (current != null) {
			System.out.print(current.data + (current.next != null ? " " : " "));
			current = current.next;
		}
		System.out.println();
		}
		
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		LinkedList list = new LinkedList();
		for (int i = 0; i < N; i++) {
			list.append(scanner.nextInt());
		}
		list.removeDuplicates();
		list.printList();
		scanner.close();
	}
}
