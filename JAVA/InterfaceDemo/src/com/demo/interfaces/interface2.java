package com.demo.interfaces;

public interface interface2 {
	
	
	void f21();
	
	
	
	default void f22() {
		System.out.println("in default interface method of f22");
	}

}
