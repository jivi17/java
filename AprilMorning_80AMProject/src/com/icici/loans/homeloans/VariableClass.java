package com.icici.loans.homeloans;

public class VariableClass {

	 // primitive variable.
	int x =100;//instance or non static or global variable
	static String Cname = "Vmware"; //static variable
	static VariableClass obj;
	public void m1()
	{
		int x=10;
		System.out.println(this.x);
		System.out.println(x);
		System.out.println(VariableClass.Cname);
	}
	
	public static void m2()
	{
		obj=new VariableClass();
		System.out.println(obj.x);
		System.out.println(VariableClass.Cname);
	}
	
	public static void main(String[] args)
	{
		//reference variables
		obj = new VariableClass();
		System.out.println(obj.x); //reference variable
		System.out.println(VariableClass.Cname);

	}

}
