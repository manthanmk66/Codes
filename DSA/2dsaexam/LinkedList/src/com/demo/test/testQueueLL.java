package com.demo.test;

import java.util.Scanner;

import com.demo.beans.QueueLL;

public class testQueueLL {

	public static void main(String[] args) {
		QueueLL q = new QueueLL();
//		q.isEmpty();
//		q.enqueue(5);
//		q.enqueue(10);
//		q.enqueue(20);
//		System.out.println(q);
//		q.dequeue();
//		System.out.println(q);
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("Enter choice");
			System.out.println("1.Enque  2. Dequeue  3.Get size 4. print 5.Exit");
			int choice = sc.nextInt();
			switch (choice) {
			case 1:
				System.out.println("Enter data");
				int data = sc.nextInt();
				q.enqueue(data);
				break;
			case 2:
				q.dequeue();
				System.out.println("Queue's Dequeued op is peroformed");
				break;
			case 3:
				System.out.println("Get size");
				int n = q.GetSize();
				System.out.println("Size:" + n);
				break;
			case 4:
				q.print();
				break;
			case 5:
				System.exit(0);
				break;
			default:
				break;
			}
		}

	}
}
