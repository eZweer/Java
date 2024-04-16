package com.eZweer.menu;

import com.eZweer.Statics.StaticMethode;
import com.eZweer.entity.CountUppercases;
import com.eZweer.entity.Pattern;

public class StringManipulation extends Menu{
	

		public StringManipulation() {
			super();
			setDescription();
			
		}
		protected void setDescription()
		{
			
			description.put(0, "END");
			description.put(1, "Pattern");
			description.put(2, "Count uppercases");
			

		}
		protected boolean switchCaseSelection() {
			 select = input.nextInt();
			 input.nextLine();
	         switch (select) {

	             case 0 :
	                 System.out.println("Good BY");
	                 program = false;
	                 break;
	             case 1 :
	            	 int i = StaticMethode.getInt("How often should the pattern be issued?");
	            	 char c =StaticMethode.getChar("Please provide a character that appears in the pattern");
	            	 float f =StaticMethode.getFloat("Please enter a floating point number that appears in the pattern");	
	                 Pattern pattern = new Pattern(c, i, f);
	                 pattern.getPatternString();
	                 break;
	             case 2 :
	                 String string = StaticMethode.getString("enter a text, all uppercases are counted");
	                 CountUppercases countUppercases = new CountUppercases(string);
	                 System.out.println(countUppercases.countUppercases() + "are uppercases in the text");
	                 break;
	             case 3 :
	                 System.out.println("Enter a Integer");

	                 break;
	             case 4 :
	                 System.out.println("Enter a Integer");

	                 break;
	             case 5 :

	                 break;
	             case 6 :

	                 System.out.println("your Text has " );
	                 break;

	             default: System.out.println("Auswahl nicht vorhanden");break;

	         }

	         return program;
		}

}
