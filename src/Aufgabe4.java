import static java.time.LocalDate.parse;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.InputMismatchException;

public class Aufgabe4 {
	/*
	Aufgabe 0
	Schreiben Sie bitte ein Java-Programm, das 
	a) einen Integer-Wert so lange abfragt, bis er mindestens die Größe 1 hat
	b) bei jeder zu kleinen Eingabe eine Fehlermeldung ausgibt
	c) bei einer Eingabe von mindestens 10 mit einer Erfolgsmeldung das Programm beendet

	*/

		private static void alwayspositive()
		{
			Integer num = null;
			do {
				if (num == null) {
				System.out.println("Enter a positiv number ");
				}
				else {
					System.out.println("thats not an positiv number , please enter a positiv number ");
				}
				num = Main.input.nextInt();
				Main.input.nextLine();
				
			}while(num <1);
			
			System.out.println("Your number is " + num);
		}
		/* Aufgabe 1
		 * Schreiben Sie eine statische Methode, die vom Benutzer eine Zahl abfragt und die eingegebene Zahl als Integer zurückgibt.
		  Wenn der Benutzer etwas eingibt, was keine ganze Zahl ist, soll eine Fehlermeldung erscheinen und die Abfrage wird wiederholt.
		 * Geben Sie zum Testen die eingegebene Zahl in der Konsole aus.
		 * Rückgabewert: Die eingegebene Zahl
		 */
		private static Integer onlyEnterNumbers() {
			Integer num = null;
			boolean isNumber = false;
			System.out.println("Enter a number ");
			do {
				try {
				num = Main.input.nextInt();
				isNumber = true;
				}catch(InputMismatchException  e) {
					System.out.println("thats not an number , please enter a number " );
				}finally {
					Main.input.nextLine();
				}
			}
			while(!isNumber);
			
			return num;
		}
		/*
	    Schreiben Sie bitte ein Programm, in dem  ...
	    - in einer Schleife pro Durchlauf so lange 2 Double-Zahlen vom User abgefragt werden, bis deren Differenz (auf 2 Nachkommastellen gerundet) 0 beträgt
	    - pro Durchlauf wird jeweils die aktuelle Differenz ausgegeben

	    HINWEIS:
	    Je nach Reihenfolge der Differenzbildung (bzw. Eingabe der Zahlen) kann die Differenz positiv, oder negativ sein ...
	    ... sorgen Sie bitte bei der Ausgabe dafür, dass die Differenz stets als ein Wert größer gleich 0 ausgegeben wird.
	    Zum Runden oder zum Bilden des positiven Betrags eines Wertes gibt es passende Methoden in der Math-Klasse
	*/
	    private static void doubleDifferenzCheck()
	    {
	    	double d1 = 0,d2 = 0,count = 0;
	    	
	    	do {
	    		if (count == 0)
	    		{
	    			System.out.println("Please enter 2 floating point numbers whose difference up to the second decimal number = 0");
	    		}
	    		else
	    		{
	    			System.out.println("The difference between "+ d1 + " and " + d2 +" up to 2 decimal places is not 0. Try again");
	    		}
	    		
	    		System.out.println("Enter the first floating point number separated by a comma");
	    		d1 = Main.input.nextDouble();
	    		System.out.println("Enter the second floating point number separated by a comma");
	    		d2 = Main.input.nextDouble();
	    		Main.input.nextLine();
	    		d1 = (double)(Math.round(d1 *100)) / 100;
	    		d2 = (double)(Math.round(d2 *100)) / 100;
	    		count++;
	    	}while(d1 - d2 != 0.00);
	    }
	    /*

	    Schreiben Sie bitte die folgende Funktion (und testen Sie diese im Main)
	    Name: inputINT
	    Übergabewert: 1 String als User-Information-Text (z.B."Geben Sie bitte eine ganze Zahl ein: ")
	    Funktion: Fragt vom User eine ganze Zahl ab (OHNE Überprüfung der Korrektheit der User-Eingabe)
	    Rückgabewert: User-Eingabe*/
	  
	    private static int inputInt(String text)
	    {
	    	int i;
	    	System.out.println(text);
	    	i = Main.input.nextInt();
	    	Main.input.nextLine();
	    	
	    	return i;
	    }
	    /*  Schreiben Sie bitte ein Java-Programm, in dem (unter Verwendung der Funktion aus Teilaufgabe A) ...
	    - eine Schleife solange durchlaufen wird, bis der User die Eingabe 42 tätigt
	    - bei jeder falschen Eingabe eine Fehlermeldung auf der Konsole erscheint
	    - bei der ersten korrekten Eingabe die Schleife beendet und eine Erfolgsmeldung ausgegeben wird*/
	    private static void onlyOneCorrectNumber() 
	    {
	    	Integer i = null ;
	    	do {
	    		if (i != null)
	    		{
	    			System.out.println("why should it be "+ i +" ?");
	    		}
	    		i = inputInt("There is only one correct number, find it ");
	    	}while(i != 42); 
	    }
	    /* Schreiben Sie ein Programm, das...
	     * eine Zufallszahl von 1 bis inklusive 99 auswürfelt
	     * und den Benutzer in einer Schleife über eine Eingabe die Zahl erraten lässt.
	     * Dabei wird die eingegebene Zahl in einen Integer geparst. Bei falscher Eingabe soll wiederholt werden.
	     * Das Programm teilt nun dem Benutzer mit, ob die Schätzung kleiner oder größer als die gewürfelte Zahl war.
	     * Die Schleife endet, wenn die gewürfelte Zahl getroffen wurde.
	     * Dem Benutzer wird die Anzahl der Versuche ausgegeben.
	     */
	    
	    private static void findTheRandomNumber()
	    {
	    	int random, enter, count;
	    	enter = 0;
	    	count = 0;
	    	random = (int)(Math.random()*100);
	    	do {
	    		if (count == 0) {
	    			System.out.println("find the random number between 0 and 99");
	    		}
	    		else {
	    			if (enter < random) {
	    				System.out.println("thats to less. try again");
	    			}
	    			else {
	    				System.out.println("thats to much. try again");
	    			}		
	    		}
	    		try {
	    			enter = Main.input.nextInt();
	    			
	    		}catch(InputMismatchException  e) {
	    			System.err.println("thats not a number");
	    			
	    		}finally {
	    			Main.input.nextLine();
	    			count++;
	    		}
	    		
	    	}while(enter != random);
	    	System.out.println("you got it the right numer ist " + random);
	    }
	    
	    /*
	     * Schreiben Sie eine Funktion, die die Stromkosten im Jahr für einen Computer berechnet.
	     * Es soll der Verbrauch des Computers (in Watt),
	     * die durchschnittliche Zeit, die der Computer am Tag läuft in Stunden
	     * und die Stromkosten pro kWh als Argumente an die Funktion übergeben werden.
	     * Wer die Werte seines Computers, oder die Stromkosten pro kWh seines Anbieters nicht kennt,
	     * sollte mit folgenden Werten arbeiten:
	     * Verbrauch eines Laptops: 70
	     * Stromkosten kWh: 25 Cent
	     */
	    private static void electricitCosts(boolean owninforamtion) {
	    	double watt, timePerDay, price, totalCost;
	    	if (owninforamtion)
	    	{
	    		System.out.println("Enter the watt consumption of the computer");
	    		watt = Main.input.nextDouble();
	    		System.out.println("enter the price of electricity");
	    		price = Main.input.nextDouble();
	    		
	    	}
	    	else {
	    		watt = 70;
	    		price = 0.25;
	    	}
	   
	    	System.out.println("How many hours on average is the computer switched on per day?");
	    	timePerDay = Main.input.nextDouble();
    		Main.input.nextLine();
    		
    		totalCost = (watt * timePerDay * 365)/ 1000 * price;
    		totalCost = (double)Math.round(totalCost*100) / 100;
    		
    		
	    	System.out.println("Your annual electricity costs for the computer amount to "+totalCost+" €");
	    }
	    
	    private static boolean trueOrFalse(String text) {
	    	boolean getAnswer = false, trueOrFalse = false;
	    	String enter;
	    	
	    	do {
	    		System.out.println(text);
	    		System.out.println("enter yes/no or y/n");
		    	enter = Main.input.nextLine();
		    	enter = enter.toLowerCase();
		    	System.out.println(enter);
	    		if (enter.equals("y")  || enter.equals("yes"))
		    	{
		    		trueOrFalse = true;
		    		getAnswer = true;
		    	}
	    		else if(enter.equals("n") || enter.equals("no"))
	    		{
	    			trueOrFalse = false;
	    			getAnswer = true;
	    		}
	    	}while(!getAnswer);
	    	
	    	return trueOrFalse;
	    }
	    /*
	     * In ihrem Unternehmen werden neue Artikelnummern vergeben. Sie bestehen aus 5 Zahlen und einer Prüfziffer.
	     * Sie sollen ein Programm entwerfen, dass 5 einstellige Zahlen einliest und daraus die Prüfziffer errechnet und sie auf der Console ausgibt. Wie Sie mit Fehleingaben umgehen, bleibt Ihnen überlassen.
	     * Folgende Informationen erhalten Sie für die Berechnung der Prüfziffer:
	     * - die geraden Zahlen werden addiert, die ungeraden Zahlen werden mit 3 multipliziert und anschließend addiert.
	     * - die Prüfziffer ergibt sich aus der letzten Stelle der Summe.
	    */
	    
	    private static String inputString(String text)
	    {
	    	String input ;
	    	
	    	System.out.println(text);
	    	input = Main.input.nextLine();
	    	
	    	return input;
	    	
	    }
	    private static boolean stringIsAInteger(String integer)
	    {
	    	boolean stringIsAInteger = true;
	    	
	    	try {
	    		Integer.parseInt(integer);
	    	}catch(NumberFormatException e) {
	    		System.out.println(integer + " is not a natural number" );
	    		stringIsAInteger = false;
	    	}
	    	return stringIsAInteger;
	    	
	    }
	    
	    private static void checkdigit()
	    {
	    	int odd = 0, even = 0, sum = 0, digit;
	    	String articlenumber;
	    	do{
	    		articlenumber = inputString("please enter the 5-digit article number");
	    	}while(articlenumber.length() != 5 || stringIsAInteger(articlenumber) != true );
	    	
	    	for (int i = 0; i < 5; i++)
	    	{
	    		digit = articlenumber.charAt(i)-48;
	    		if (digit % 2 == 0)
	    		{
	    			even = even + digit;
	    		}
	    		else 
	    		{
	    			odd = odd + (digit * 3);
	    		}
	    	}
	    	sum = even + odd;
	    	digit = sum % 10;
	    	
	    	System.out.println(articlenumber + "-" + digit);
	    	
	    }
	    
	    public static void start() {
	        boolean  ownInformation, program = true;
	        int selected, num;
	        while(program) {
	            System.out.println("Select a program:");
	            System.out.println("0: Back");
	            System.out.println("1: Enter a positive number");
	            System.out.println("2: Only enter numbers");
	            System.out.println("3: Double differenze check");
	            System.out.println("4: It can only be one number");
	            System.out.println("5: Find the random number");
	            System.out.println("6: electricity cost calculator");




	            selected = Main.input.nextInt();
	            Main.input.nextLine();
	            switch (selected) {

	                case 0 :
	                    program = false;
	                    break;

	                case 1 :
	                	alwayspositive();
	                    break;

	                case 2  :
	                	num = onlyEnterNumbers();
	                	System.out.println("Your number is " + num);
	                	break;
	                case 3  :
	                	doubleDifferenzCheck();
	    
	                	break;	
	                case 4 :
	                	onlyOneCorrectNumber();
	                	break;
	                case 5 :
	                	findTheRandomNumber();
	                	break;
	                case 6 :
	                	ownInformation = trueOrFalse("Do you have information about your computer's power consumption and the current electricity price?");
	                	electricitCosts(ownInformation);
	                	break;
	                case 7 :
	                	checkdigit();
	                	break;
	                default: System.out.println("selection not available");break;

	            }

	            System.out.println("press Enter to Continue");
	            Main.input.nextLine();
	        }
	    }
}
