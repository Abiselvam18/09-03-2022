package com.ExceptionHandling;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Example5 {

	public static void main(String[] args) {
		InputStreamReader is = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(is);
		//or
		//BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter your name");
		String n=null;
		try {
			n=br.readLine();
		}catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("Your Name="+n);
	}

}
