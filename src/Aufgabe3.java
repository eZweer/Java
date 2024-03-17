import java.time.LocalDate;
import java.time.chrono.ChronoLocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Date;

import static java.time.LocalDate.*;

public class Aufgabe3 {
    static LocalDate date = LocalDate.now();
    /*
    Schreiben Sie ein Programm, bei dem eine Methode eine Division ausführt.
    Erzwingen Sie bei Aufruf dieser eine 0 Division und fangen Sie den dazugehörigen Fehler ab.
 */
    private static void catchZero()
    {
        System.out.println("please enter the first Number");
        int x = Main.input.nextInt();
        System.out.println("please enter the second Number");
        int y = Main.input.nextInt();
        Main.input.nextLine();
        try {
            System.out.println(x + " / " + y + " = " + x/y);
        }
        catch(ArithmeticException ae){
            System.out.println("ArithmeticException occured!");
            System.out.println("it´s impossible to divide by zero");
        }

    }
    /*

    Schreiben Sie eine statische Funktion, die die Quersumme einer Zahl berechnet.
    Übergabewert (Parameter): int zahl
    Rückgabewert: die berechnete Quersumme.
    Ist die übergebene Zahl negativ, soll eine IllegalArgumentException ausgelöst werden.
    Im Main rufen Sie die Methode innerhalb einer passenden Try-Catch-Anweisung auf.
    Der Catch-Teil soll dabei eine passende Fehlermeldung ausgeben.
    Hinweis: Zur Berechnung bietet sich der Modulo-Operator % an.

 */
    private static void checkCrossSum()
    {
        int x;
        System.out.println("Enter an positiv Number");
        x = Main.input.nextInt();
        Main.input.nextLine();
        try {
            if (x < 0) {
                throw new ArithmeticException(Integer.toString(x));
            } else {
                System.out.println(Aufgabe1.crosssum(x));
            }
        }
        catch (ArithmeticException ae){
            System.out.println("ArithmeticException occured!");
            System.out.println("the number u entered is less than zero");
        }

    }
    private static void cheackArrayLenth()
    {
        char c;
        int i = 0,x;
        boolean anotherNumber = true;
        int[] arr = new int[5];

        while(anotherNumber)
        {
            System.out.println("do u want enter another number? y or n");
            c = Main.input.next().charAt(0);
            if (c == 'y')
            {
                System.out.println("Enter a number");
                x = Main.input.nextInt();
                try {
                    arr[i] = x;
                }
                catch(ArrayIndexOutOfBoundsException iob) {
                    System.out.println("Array index out of bounds.");
                    anotherNumber = false;
                }
                i++;
            }
            else {
                anotherNumber = false;
            }
            Main.input.nextLine();
        }
        for (int j : arr)
        {
            System.out.println(j);
        }
    }
    /*
    Schauen Sie sich, um diese Aufgabe zu lösen, das Thema DatumsFormat aus den Codebeispielen an.

    Führen Sie bitte zunächst die folgende Methode ein:
    Methodenname: tryStringZuDatum
    Übergabewerte: String s
    Funktion: - Versucht s in LocalDate zu konvertieren
              - Fängt bei DateTimeParseException die Fehlermeldung ab

    Rückgabewert: das LocalDate Objekt, FALLS Konvertierung klappte, sonst null

    Testen Sie diese Funktion.
*/
    private static LocalDate tryStringToDate(String s)  {
        LocalDate d;
    	try {
            DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd.MM.yyy");
            d = parse(s,dtf);
        }catch(DateTimeParseException e){
            System.out.println("DateTimeParseException");
            d = null;

        }
        return d;

    }
    public static void start() {
        boolean program = true;
        int selected;
        while(program) {
            System.out.println("Select a program:");
            System.out.println("0: Back");
            System.out.println("1: Divided with catch by zero");
            System.out.println("2: cross sum catch less than zero");
            System.out.println("3: create array with lenth check");
            System.out.println("4: Date Time exception");



            selected = Main.input.nextInt();
            Main.input.nextLine();
            switch (selected) {

                case 0 :
                    program = false;
                    break;

                case 1 :
                        catchZero();
                    break;

                case 2 :
                    checkCrossSum();
                    break;

                case 3 :
                    cheackArrayLenth();
                    break;

                case 4 :
                    System.out.println("Enter a date dd.mm.yyyy");
                    String dateText = Main.input.nextLine();
                    LocalDate dateCheck = tryStringToDate(dateText);
                    System.out.println(dateCheck);
                    break;

                default: System.out.println("selection not available");break;

            }

            System.out.println("press Enter to Continue");
            Main.input.nextLine();
        }
    }
}
