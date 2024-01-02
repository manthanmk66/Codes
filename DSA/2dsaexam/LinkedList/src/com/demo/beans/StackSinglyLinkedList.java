package com.demo.beans;

public class StackSinglyLinkedList {

	class Node {
		private int data;
		private Node next;

		public Node(int data) {
			this.data = data;
			next = null;
		}
	}

	private Node top;

	public StackSinglyLinkedList() {
		// TODO Auto-generated constructor stub
		super();
		top = null;
	}

	public boolean isEmpty() {
		System.out.println("stack is empty");
		return top == null;
	}

	public void push(int n) {
		Node newNode = new Node(n);
		if (top != null) {
			newNode.next = top;
		}
		top = newNode;
	}

	public int pop() {
		if (isEmpty()) {
			System.out.println("Stack is empty");
			return -1;
		} else {
			Node temp = top;
			top = top.next;
			temp.next = null;
			System.out.println(temp.data + " removed");
			return temp.data;
		}
	}

	@Override
	public String toString() {
		Node temp = top;
		while (temp != null) {
			System.out.println(temp.data);
			temp = temp.next;
		}
		return "StackSinglyLinkedList [toString()=" + super.toString() + "]";
	}
}
