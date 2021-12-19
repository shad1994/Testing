package DP;

public class LinkedList {

	Node head = null;
	Node tail = null;

	public void add(int i) {
		Node node = new Node(i);
		if (head == null) {
			head.next = node;
			tail.next = node;
		} else {
			tail.next = node;
			tail = node;
		}

	}

	public void delete(int value) {
		Node temp = head;
		if (head.data == value) {
			head = head.next;
		} else {
			while (temp.next.data != value) {
				temp = temp.next;
			}
		}
		if (temp.next.next != null) {
			temp.next = temp.next.next;
		} else {
			temp.next = null;
			tail=temp;
		}
	}

	public boolean isPlaindrom(LinkedList list) {
		while (head.next != tail) {

		}
		return false;
	}
}

class Node {

	int data;
	Node next;

	Node(int n) {
		data = n;
		next = null;
	}
}
