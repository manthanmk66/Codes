package com.demo.beans;

public class QueueLL {
	private Node front, rear;
	public static int cnt = 0;

	class Node {
		int data;
		Node next;

		public Node(int data) {
			this.data = data;
			next = null;
		}
	}

	public QueueLL() {
		// TODO Auto-generated constructor stub
		front = null;
		rear = null;
	}

	public boolean isEmpty() {
		return front == null && rear == null;
	}

	public void enqueue(int data) {
		Node temp = new Node(data);
		if (isEmpty()) {
			front = temp;
		} else {
			rear.next = temp;
		}
		rear = temp;
		cnt++;
	}

	public void dequeue() {
		if (isEmpty()) {
			System.out.println("empty");
			return;
		} else {
			Node temp = front;
			front = front.next;
			temp.next = null;
			System.out.println(temp.data + " removed");
			cnt--;
		}
	}

	public int GetSize() {
		return cnt;
	}

	public void print() {
		Node temp = front;
		while (temp != null) {
			System.out.println(temp.data);
			temp = temp.next;
		}
	}

	@Override
	public String toString() {
		Node temp = front;
		while (temp != null) {
			System.out.print(temp.data + "->");
			temp = temp.next;

		}
		return "QueueLL [front=" + front + ", rear=" + rear + ", toString()=" + super.toString() + "]";
	}

}
