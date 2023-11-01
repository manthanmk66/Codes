package com.demo.beans;

import com.demo.interfaces.interface1;
import com.demo.interfaces.interface2;
import com.demo.interfaces.interface31;

public class class2 extends class1 implements interface1,interface2,interface31 {

	@Override
	public void f21() {
		System.out.println("in override method of f21");
		
	}

	@Override
	public void f11() {
		System.out.println("in override method of f11");

		
	}

}
