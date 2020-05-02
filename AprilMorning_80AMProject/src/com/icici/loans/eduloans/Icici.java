package com.icici.loans.eduloans;

public class Icici implements Rbi
{
	
	public static void main(String[] args) 
	{
		
		Icici I = new Icici();
		I.withdrawl();
		I.deposit();
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
