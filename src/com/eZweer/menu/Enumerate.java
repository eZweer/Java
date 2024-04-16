package com.eZweer.menu;

import com.eZweer.entity.Calculate;
import com.eZweer.entity.Crosssum;
import com.eZweer.enumerate.Kyu;
import com.eZweer.enumerate.YesNoMaybe;

public class Enumerate extends Menu{
	
	public Enumerate() {
		super();
		setDescription();
		
	}
	protected void setDescription()
	{
		
		description.put(0, "END");
		description.put(1, "Yes No Maybe");
		description.put(2, "kyu belt");
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
            	 
            	 YesNoMaybe.doYouLikeJAva();
                 break;
             case 2 :
            	 Kyu.run();
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
