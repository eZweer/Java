package com.eZweer.menu;

import com.eZweer.Statics.StaticMethode;
import com.eZweer.Statics.createStaticLists;
import com.eZweer.entity.Enemy;

public class DandD extends Menu{
	
	public DandD() {
		super();
		setDescription();
		
	}
	protected void setDescription()
	{
		
		description.put(0, "END");
		description.put(1, "Enemy List");
		description.put(2, "Attack Enemy");
		description.put(3, "Create character");
		description.put(4, "Print all character");
	
		

	}
	protected boolean switchCaseSelection() {
		 if( Enemy.enemys.isEmpty())
		 {
			 createStaticLists.createEnemys();
		 } 
		 select = input.nextInt();
		 input.nextLine();
         switch (select) {

             case 0 :
                 System.out.println("Good BY");
                 program = false;
                 break;
             case 1 :
            	 Enemy.printEnemyList();
                 break;
             case 2 :
                 Enemy.attack_Enemy();
                 break;
             case 3 :
	             String name = StaticMethode.getString("Whats the name of you Charater?");
	             int level = StaticMethode.getInt("Whats the Level of your Charater?");
	             String char_class = StaticMethode.getString("Whats class ist your Charater?\n" + Player.Classes.selection());
                 Player player = new Player(name, level, char_class);
                 System.out.println("11");
                 player.printallData();
                 break;
             case 4 :
                 Player.printallChars();
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


             default: System.out.println("Auswahl nicht vorhanden");break;

         }
         return program;
	}


}
