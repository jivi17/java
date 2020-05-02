package com.icici.loans.eduloans;

public class Hdfc implements Rbi
{

	public static void main(String[] args) 
	{
		Hdfc h = new Hdfc();
		h.withdrawl();
		h.deposit();

	}

	@Override
	public void withdrawl() {
		System.out.println("Overriden withdrawl from rbi");
		
	}

	@Override
	public void deposit() {
		System.out.println("Overriden deposit from rbi");
		
	}
	

	
	

}
