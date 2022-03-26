package com.ExceptionHandling;

public class Example4 {

	public static void main(String[] args) {
		String s="abc";
		try {
		int i=Integer.parseInt(s);
		}catch(NumberFormatException e) {
			e.printStackTrace();
		}
		System.out.println(s);
	}
}
