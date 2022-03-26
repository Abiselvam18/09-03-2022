package com.ExceptionHandling;

public class Example3 {

	public static void main(String[] args) {
		int a=10, b=0, c=0;
		int ar[]=new int[4];
		System.out.println("Before exception");
		try {
			System.out.println("Inside try");
			c=a/b;//Arithmetic Exception
			ar[6]=8;
		}
		catch(ArithmeticException e) {
			System.out.println("Arithmetic Exception");
			e.printStackTrace();
		}
		try {
			ar[6]=8;//ArrayIndexOutOfBoundsException
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("ArrayIndexOutOfBoundsException");
			e.printStackTrace();
		}
		finally {
			System.out.println("finally block");
		}
	}
	
}
