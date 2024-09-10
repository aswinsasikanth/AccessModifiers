package com.access.pkg2;

import com.access.pkg1.*;

public class ClassB {
	
	public static void main(String[] args) {
		ClassA ca = new ClassA();
		ca.publicMethod();
		
		ClassAA caa = new ClassAA();
		caa.methodAA();
		
		
	}

}
