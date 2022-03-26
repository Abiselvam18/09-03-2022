package com.ExceptionHandling;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Example6 {

	public static void main(String[] args) throws IOException {
		String name="";
		int age=0;
		float salary=0.0f;
		
		InputStreamReader is = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(is);
		//or
		//BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter your name");
		
		name = br.readLine();
		System.out.println("Enter age");
		age=Integer.parseInt(br.readLine());
		System.out.println("Enter salary");
		salary=Float.parseFloat(br.readLine());
		
		System.out.println("Details of Employee");
		System.out.println("Name="+name);
		System.out.println("Age="+age);
		System.out.println("Salary="+salary);
		}

}

