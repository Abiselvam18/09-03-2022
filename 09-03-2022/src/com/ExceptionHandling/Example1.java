package com.ExceptionHandling;

import java.util.Scanner;

public class Example1 {

	public static void main(String[] args) {
		int a,b,c;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number");
		a=sc.nextInt();
		System.out.println("Enter second number");
		b=sc.nextInt();
		System.out.println("Befor Division");
		try {
		c=a/b;
		}
		catch(ArithmeticException e) {
			e.printStackTrace();
			System.out.println("catch block executes only when exception occured");
		}
		finally {
			System.out.println("finally block executes always");
		}
		System.out.println("After Division");
		System.out.println("Program other ststements");
	
	}

}
