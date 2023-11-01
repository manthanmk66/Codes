package com.demo.interfaces;

public interface interface1 {
	
	void f11();
	
	// we can add body in interface method by using default keyword 
	// to method  from java 1.8
	
	default void f12() {
		System.out.println("in default interface method of f12");
	}

}
