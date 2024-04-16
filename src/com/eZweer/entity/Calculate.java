package com.eZweer.entity;

import com.eZweer.Statics.StaticMethode;
import com.eZweer.menu.Menu;

public class Calculate extends Menu {
	int num1, num2;	
	
	public Calculate() {
		super();
		num1 = StaticMethode.getInt("pleace enter the first number");
		num2 = StaticMethode.getInt("pleace enter the secound number");
		setDescription();
		
	}
	
	protected void setDescription()
	{
		
		description.put(1, "+");
		description.put(2, "-");
		description.put(3, "*");
		description.put(4, "/");
		description.put(5, "%");

	}
	protected boolean switchCaseSelection() {
		 select = input.nextInt();
		 input.nextLine();
		 switch (select)
	        {
	            case 1:
	                System.out.println(num1 + num2);
	                break;
	            case 2:
	                System.out.println(num1 - num2);
	                break;
	            case 3:
	                System.out.println(num1 * num2);
	                break;
	            case 4:
	                System.out.println(num1 / num2);
	                break;
	            case 5:
	                System.out.println(num1 % num2);
	                break;
	            default:
	                System.out.println("selection not available");
	                break;
	        }

         return program;
	}
}
