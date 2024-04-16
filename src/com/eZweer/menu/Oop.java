package com.eZweer.menu;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Random;

import com.eZweer.Statics.StaticMethode;
import com.eZweer.Statics.createStaticLists;
import com.eZweer.entity.Album;
import com.eZweer.entity.Course;
import com.eZweer.entity.Flights;
import com.eZweer.entity.Footballfield;
import com.eZweer.entity.Song;

public class Oop extends Menu{
	

	public Oop() {
		super();
		setDescription();
		
	}
	protected void setDescription()
	{
		
		description.put(0, "END");
		description.put(1, "Create musik album");
		description.put(2, "Is the football field suitable for DFB football?");
		description.put(3, "Create courses and compare ID");
		description.put(4, "Bording");
		

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
            	 String songName, interpret;
            	 int sec;
                 String albumname = StaticMethode.getString("What should the music album be called?");
                 select = StaticMethode.getInt("How many songs are on the album?");
                 Album album = new Album(albumname);
                 for(int i = 0; i< select; i++) {
                	 songName = StaticMethode.getString("What should the " + (i+1)+ " song be called?");
                	 interpret = StaticMethode.getString("Who is the interpreter");
                     sec = StaticMethode.getInt("How many seconds is the song?");
                	 Song song = new Song(songName,sec,interpret);
                	 album.setSongs(song);
                 }
                 
                 album.playSongs();
                 break;
             case 2 :
            	 int width = StaticMethode.getInt("Whats the width of the footballfield?");
            	 int lenth = StaticMethode.getInt("Whats the lenth of the footballfield?");
            	 Footballfield footballfield = new Footballfield(width, lenth);
            	 
            	 String text = (footballfield.getSuitable())? "The football field is suitable for DFB football ":"The football field is not suitable for DFB football" ;
            	 System.out.println(text);
            	 
                 break;     
             case 3 :
            	 Random random = new Random();
            	 int maxValue = StaticMethode.getInt("enter the max value of courses");
            	 Course.setMaxValue(maxValue);
            	 for (int i = 0; i< maxValue; i++)
            	 {
            		
            		 Course course; new Course((random.nextInt(11)+1));
            	 }
            	 System.out.println("Here are the courses");
            	 Course.printCourses();
                 break;
             case 4 :
                 createStaticLists.createFlights();
                 ArrayList<Flights> f = Flights.checkAvailability(LocalDateTime.of(2019, 6, 12, 12, 0, 0),2 );
                 Flights.printFlights(f);
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
