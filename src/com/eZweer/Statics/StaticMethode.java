package com.eZweer.Statics;

import java.util.InputMismatchException;
import java.util.Scanner;


public class StaticMethode {
	private static Scanner input = new Scanner(System.in);
	
	public static int getInt(String text)
	{
		int x = 0;
		
		do {
			try {
				System.out.println(text);
				x = input.nextInt();
				
			} catch (InputMismatchException e) {
				System.err.println("Thats not a positiv number please Try again:");
			}finally {
				input.nextLine();
			}
		
		
		}while (x <=0);
		
		return x;
		
	}
	public static String getString(String text)
	{
		System.out.println(text);
		String string = input.nextLine();
		return string;
	}
	public static float getFloat(String text)
	{
		float f = 0;
		String string= "";
		do {
			System.out.println(text);
			string = input.nextLine();
			string = string.replace(",", ".");
			f = stringToFloat(string);
		}while (f <=0);
		
		return f;
	}
	
	public static float stringToFloat(String string)
	{float f = 0;
		try {
			
			f = Float.parseFloat(string);
			
		} catch (NumberFormatException e) {
			System.err.println("Thats not a floating point number please Try again:");
	
		}
		return f;
	}	
	public static char getChar(String text)
	{
		char c;
		System.out.println(text);
		c = input.next().charAt(0);
		input.nextLine();
		return c;
	}
	
	 public static boolean isEven(int x) {
	        return (x % 2 == 0)?true:false;
	    }
	 public static boolean leapYear(int year)
	    {
	        return year % 4 == 0 && (year % 100 != 0 || year % 400 == 0);
	    }
	 public static int stringToInt(String s) {
		 int x = 0;
		 try {
				x = Integer.parseInt(s);
				
			} catch (NumberFormatException e) {
				System.err.println("Thats not a floating point number please Try again:");
		
			}
		 return x;
	 }
}
