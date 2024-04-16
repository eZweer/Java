package com.eZweer.menu;

import com.eZweer.Statics.StaticMethode;
import com.eZweer.entity.Month;

public class Monthmenu extends Menu{
	String name;
	int year;
	public Monthmenu() {
		super();
		setDescription();
		
	}
	protected void setDescription()
	{
		
		description.put(0, "END");
		description.put(1, "Translate");
		description.put(2, "Number of Month");
		description.put(3, "Days of Month");
		description.put(4, "is Leap Year");
		

	}
	protected boolean switchCaseSelection() {
		 Month month = null;
		 select = input.nextInt();
		 input.nextLine();
		 
		 
		 switch (select) {
			 case 0:
	             System.out.println("Good BY");
	             program = false;
	             break;
	
	         case 1:
	        	 name = StaticMethode.getString("enter the name  of moonth");
	    		 if (name.length() > 2)
	    		 {
	    			 month = new Month(name);
	    		 }
	    		 else
	    		 {
	    			int num = StaticMethode.stringToInt(name);
	    			month = new Month(num);
	    		 }
	        	 month.printMonths(month.getMonth());
	             break;
	         case 2:
	        	 name = StaticMethode.getString("enter the name of moonth");
	        	 Month month2 = new Month(name);
	        	 System.out.println(month2.getMonth());
	             break;
	             
	         
	
	         default:
	             System.out.println("selection not available");
	             break;
		 }

         return program;
	}
	
}

