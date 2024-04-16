package com.eZweer.menu;


public class Inheritance extends Menu {
	
	public Inheritance() {
		super();
		setDescription();
		
	}
	protected void setDescription()
	{
		
		description.put(0, "END");

		

	}
	protected boolean switchCaseSelection() {
		 select = input.nextInt();
		 input.nextLine();
         switch (select) {

             case 0 :
                 System.out.println("Good BY");
                 program = false;
                 break;
             

             default: System.out.println("Auswahl nicht vorhanden");break;

         }

         return program;
	}

}

