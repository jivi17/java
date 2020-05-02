package com.icici.loans.eduloans;

public class ThirdClass 
{
	int a=10,b=20,c; //properties;
	
	public void add()
	{
	c=a+b;	
    System.out.println("Addition of A & B is :" + c);		
	}
	                               // concrete behaviours
	
	public void mul()
	{
		c=a*b;	
	    System.out.println("Multiplication of A & B is :" + c);
	}
	
	public static void main(String[] args)
	{
		ThirdClass obj=new ThirdClass();
		obj.add();
		obj.mul();
		
		ThirdClass obj1=new ThirdClass();
		obj1.add();
		obj1.mul();
		
	}

}
