package com.eZweer.menu;

public class MainMenu extends Menu {
	
	public MainMenu() {
		super();
		setDescription();
		
	}
	protected void setDescription()
	{
		
		description.put(0, "END");
		description.put(1, "Mathematical equations");
		description.put(2, "String manipulation");
		description.put(3, "Collections");
		description.put(4, "Object Oriented Programming");
		description.put(5, "Databases and database alternatives");
		description.put(6, "Datetime");
		description.put(7, "Month");
		description.put(8, "Enumerate");
		description.put(9, "Dungens and Drangons");
		

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
            	 MathematicalEquations mathematicalEquations = new MathematicalEquations();
            	 mathematicalEquations.run();
                 break;
             case 2 :
                 StringManipulation stringManipulation = new StringManipulation();
                 stringManipulation.run();
                 break;
             case 3 :
                 Collections collections = new Collections();
                 collections.run();
                 break;
             case 4 :
                 Oop oop = new Oop();
                 oop.run();
                 break;
             case 5 :
            	 Database database = new Database();
            	 database.run();
                 break;
             case 6 :

                 System.out.println("your Text has " );
                 break;
             case 7:
            	 Monthmenu monthmenu = new Monthmenu();
            	 monthmenu.run();
                 break;    
             case 8:
            	 Enumerate enumerate = new Enumerate();
            	 enumerate.run();
                 break;    
             case 9:
            	 DandD dandD = new DandD();
            	 dandD.run();
                 break;    
    


             default: System.out.println("Auswahl nicht vorhanden");break;

         }
         return program;
	}


}
