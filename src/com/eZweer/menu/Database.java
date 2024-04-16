package com.eZweer.menu;

public class Database extends Menu{
	

	public Database() {
		super();
		setDescription();
		
	}
	protected void setDescription()
	{
		
		description.put(0, "END");
		description.put(1, "Mathematical equations");
		

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
                 System.out.println("Enter a Integer");
 
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
