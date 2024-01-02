package com.demo.test;

import com.demo.beans.StackSinglyLinkedList;

public class stacktest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StackSinglyLinkedList st = new StackSinglyLinkedList();
		st.isEmpty();
		st.push(5);
		st.push(10);
		st.push(10);
		st.push(12);
		st.pop();
		System.out.println(st);
	}

}
