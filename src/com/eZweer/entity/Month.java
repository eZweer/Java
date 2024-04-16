package com.eZweer.entity;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class Month {
	private static String[][] lang = monthArray();
	int month, year;
	String monthstring;
	boolean program;
	
	
	public Month(int month){
		this.month = month;
	}
	public Month(String month) {
		this(numberOfMonth(month));
		this.monthstring = month;
	}
	public int getMonth() {
		return month;
	}
	private boolean leapYear()
    {
        return year % 4 == 0 && (year % 100 != 0 || year % 400 == 0);
    }
	private static String[][] monthArray()
	{
		String[][] lang;
		File file;
		int i = 0;
		Scanner sc = null;
		lang = new String [6][12];
		try {
            file = new File("Source/month.txt");
            sc = new Scanner(file);
        } catch (FileNotFoundException e) {
            System.err.println("File not Found");
        }
		if (sc != null) {
	        while (i < 12) {
	            String line = sc.nextLine();
	
	            String[] helper = new String[line.split(",").length];
	            helper = line.split(",");
	            lang[0][i] = helper[0];
	            lang[1][i] = helper[1];
	            lang[2][i] = helper[2];
	            lang[3][i]= helper[3];
	            lang[4][i] = helper[4];
	            lang[5][i] = helper[5];
	            i++;
	        }
		}
		return lang;
	}
	 public void printMonths(int x){
		 x--;
	        try {
				System.out.println("German : " + lang[0][x]);
				System.out.println("English : " + lang[1][x]);
			    System.out.println("Spanish : " + lang[2][x]);
			    System.out.println("French : " + lang[3][x]);
			    System.out.println("Russian : " + lang[4][x]);
			    System.out.println("Chinese : " + lang[5][x]);
			} catch (ArrayIndexOutOfBoundsException e) {
				e.printStackTrace();
			}
	       

	    }
	 private static int numberOfMonth(String name)
	    {
	        int numOfMonth = -1;

	        for (int i = 0; i < 12; i++)
	        {
	        	for (String[] s: lang)
	        	{
	        		if (s[i].equalsIgnoreCase(name))
	        		{
	        			numOfMonth = i +1;
		                break;
	        		}
	        	}
	        }

	        return numOfMonth;
	    }
		 private  void days() {
		        
		        int days = 0;

		        switch (monthstring) {
		            case "january":
		                days = 31;
		                break;
		            case "february":
	                    days = (leapYear()) ? 29 : 28;
	                    break; 
		            case   "march":
		                days = 31;
		                break;
		            case "april":
		                days = 30;
		                break;
		            case "may":
		                days = 31;
		                break;
		            case "june":
		                days = 30;
		                break;
		            case "july":
		                days = 31;
		                break;
		            case "august":
		                days = 31;
		                break;
		            case "september":
		                days = 30;
		                break;
		            case "october":
		                days = 31;
		                break;
		            case "november":
		                days = 30;
		                break;
		            case "december":
		                days = 31;
		                break;
		            default:
		                System.out.println("the month u has called ist not available");
		                break;
		        }
		
		 }
}

