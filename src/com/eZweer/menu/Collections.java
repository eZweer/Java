package com.eZweer.menu;

import com.eZweer.entity.ArrayWritter;

public class Collections extends Menu{
	

	public Collections() {
		super();
		setDescription();
		
	}
	protected void setDescription()
	{
		
		description.put(0, "END");
		description.put(1, "Edit arrays");
		

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
            	 ArrayWritter arrayWritter = new ArrayWritter();
            	 arrayWritter.start();

                 break;
             case 2 :
                 System.out.println("Enter a Integer");

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
