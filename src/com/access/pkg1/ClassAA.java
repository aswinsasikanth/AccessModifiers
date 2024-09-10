package com.access.pkg1;

public class ClassAA {

	public static void main(String[] args) {
		ClassA ca = new ClassA();
		ca.defaultMethod();
		
//		Throw error as method has access identifier as "Private"
//		ca.privateMethod();
	}
	public void methodAA() {
		System.out.println("Method AA");
	}
}
