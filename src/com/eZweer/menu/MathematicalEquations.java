package com.eZweer.menu;

import com.eZweer.Statics.StaticMethode;
import com.eZweer.entity.Calculate;
import com.eZweer.entity.Crosssum;
import com.eZweer.entity.Faculty;

public class MathematicalEquations extends Menu {
	public MathematicalEquations() {
		super();
		setDescription();
		
	}
	protected void setDescription()
	{
		
		description.put(0, "END");
		description.put(1, "Faculty");
		description.put(2, "Crossum with modulo");
		description.put(3, "Crossum without modulo");
		description.put(4, "Calculator");
		

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
            	 int x = StaticMethode.getInt("Please enter a positiv number and the factorial will be calculated");
                 int fakulty = Faculty.faculty(x);
                 System.out.printf("The factorial of %d is = %d", x, fakulty);
                 System.out.println();
                 break;
             case 2 :
            	 Crosssum crosssum = new Crosssum();
            	 crosssum.whitModulo();
                 break;
             case 3 :
            	 Crosssum crosssum1 = new Crosssum();
            	 crosssum1.whitoutModulo();
                 break;
             case 4 :
                 Calculate calculate = new Calculate();
                 calculate.run();
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
