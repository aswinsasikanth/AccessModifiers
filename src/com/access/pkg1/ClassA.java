package com.access.pkg1;
 
 public class ClassA {
//	 If Class A cannot be accessed out the pkg1 as its access modifier is default.
	
	public int publicVariable = 1;
	int defaultVariable = 2;
	private int privateVariable = 3;
	protected int protectedVariable = 4;
	
	
	public void publicMethod() {
		System.out.println("Public Method");
	}
	
	void defaultMethod() {
		System.out.println("Default Method");
	}
	
	private void privateMethod() {
		System.out.println("Private Method");
	}
	
	protected void protectedMethod() {
		System.out.println("Protected Method");
	}
	
	public static void main(String[] args) {
		ClassA ca = new ClassA();
		ca.defaultMethod();
	}

}
