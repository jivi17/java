package com.icici.loans.eduloans;

import java.util.Scanner;

public class ArrayDemo {

	public static void main(String[] args){
		/*
		 * int[] a = {10,20,30,40,50}; for(int i=0;i<a.length;i++) {
		 * System.out.println("a["+i+"]="+a[i]);
		 * 
		 * }
		 */
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Array Size: ");
		int asize = sc.nextInt();
		
		int[] a = new int[asize];
		int sum=10;
		
		System.out.println("Enter Array Elements: ");
		for(int i=0;i<a.length;i++) 
		{
			a[i]=sc.nextInt();
			System.out.println("a["+i+"]="+a[i]);
			sum=sum +a[i];
			System.out.println("sum of Array : "+ sum );
		}
		
		/*
		int[] a = new int[asize];
	    a[0]=10;
	    a[1]=20;
	    a[2]=30;
	    a[3]=40;
	    for(int i=0;i<a.length;i++) {
	     System.out.println("a["+i+"]="+a[i]);
	  }*/
		
	}
}
