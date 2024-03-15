import java.util.*;



public class Aufgabe1 {


    /*
    Erstellen Sie eine Funktion, die die Fakultät einer übergebenen Zahl berechnet und das Ergebnis zurückgibt.

    Fakultät = mathematische Funktion, die eine natürliche Zahl n auf n! = 1 * 2 * … * n abbildet
    */

    public static int faculty(int x)
    {
        
        return (x == 1)? x:x * faculty(x-1);
    }
    /*
     * Schreiben Sie eine statische Methode, die die Quersumme einer Zahl berechnet.
     * Übergabewert (Parameter): int zahl
     * Rückgabewert: Die berechnete Quersumme.
     * Hinweis: Zur Berechnung bietet sich der Modulo-Operator % an.
     */
    public static int crosssum(int x)
    {
        int sum = 0;
        String len = "" + x;
        for (int i = 0; i < len.length(); i++)
        {
            sum += x % 10;
            x = x / 10;
        }

        return sum;
    }
    public static int crosssum2(int x)
    {
        {
            int sum = 0;
            int num;
            String len = Integer.toString(x);
            for (int i = 0; i < len.length(); i++)
            {
                num =len.charAt(i) - 48;
                sum += num;
            }
            return sum;
        }
    }
    /*
     * Schreiben Sie ein Java-Programm das kontrolliert, ob eine Zahl gerade oder ungerade ist und dann einen String ausgibt der sagt "Die Zahl ist ungerade" oder
     * "Die Zahl ist gerade".
     * Hinweis: Zur Vergleichsberechnung bietet sich der Modulo-Operator % an.
     */
    public static void oddornot(int x) {

        if (x % 2 == 0) {
            System.out.println("even");
        } else {
            System.out.println("odd");
        }
    }
    /*
    Schreiben Sie bitte ein Java-Programm, das
    a) eine Integer-Variable i einführt (deren Wert sie selbst bestimmen können)
    b) eine Float-Variable f einführt (deren Wert sie selbst bestimmen können)
    c) eine Char-Variable c einführt (deren Wert sie selbst bestimmen können)
    d) einen String s einführt, der durch eine for-Schleife wie folgt initialisiert werden soll:
        - die Schleife soll i-mal durchlaufen werden
        - bei jedem Durchlauf soll s um c und f verlängert werden
    e) eine for-Schleife startet, die 3-mal durchlaufen wird und pro Durchlauf s (mit Umbruch) ausgibt

    */
    public static String pattern()
        {
            System.out.println("Enter a Integer");
            int i = Main.input.nextInt();
            System.out.println("Enter a Float");
            float f = Main.input.nextFloat();
            System.out.println("Enter a Char");
            char c = Main.input.next().charAt(0);
            String output = "";
            for (int j = 1; j < i ; j++)
            {
                output = output + c + f;
            }
            return output;
        }
    public static void output(String output, int x)
    {
        for(int i = 0; i < x;i++)
        {
            System.out.println(output);
        }
    }
    /*
    Erstellen Sie ein Programm, welches zählt, wie viele Großbuchstaben in einer Zeichenkette vorkommen.
    For-Schleifen und If-Else funktionieren hier exakt wie Sie auch schon aus C bekannt sind.
    Die Länge einer Zeichenkette können Sie mit length() geprüft werden.
    Ob ein Zeichen ein Großbuchstabe ist, erfahren Sie über Character.isUpperCase().
     */
    public static int uppercaseCount(String text)
    {

        int count = 0;
        for (int i = 0; i < text.length();i++)
        {
           if (Character.isUpperCase(text.charAt(i)))
           {
               count++;
           }
        }
        return count;
    }
    public static void start() {
        boolean program = true;
        int count, selected;
        while(program) {
            System.out.println("Select a program:");
            System.out.println("0: END");
            System.out.println("1: Faculty");
            System.out.println("2: cross sum with Modulo");
            System.out.println("3: cross sum without Modulo");
            System.out.println("4: Odd or Not");
            System.out.println("5: Pattern");
            System.out.println("6: Uppercase counter");


            selected = Main.input.nextInt();
            Main.input.nextLine();
            switch (selected) {

                case 0 :
                    System.out.println("Good BY");
                    program = false;
                    break;
                case 1 :
                    System.out.println("Enter a Integer");
                    selected = Main.input.nextInt();
                    System.out.println(faculty(selected));
                    Main.input.nextLine();
                    break;
                case 2 :
                    System.out.println("Enter a Integer");
                    selected = Main.input.nextInt();
                    System.out.println(crosssum(selected));
                    Main.input.nextLine();
                    break;
                case 3 :
                    System.out.println("Enter a Integer");
                    selected = Main.input.nextInt();
                    System.out.println(crosssum2(selected));
                    Main.input.nextLine();
                    break;
                case 4 :
                    System.out.println("Enter a Integer");
                    selected = Main.input.nextInt();
                    oddornot(selected);
                    Main.input.nextLine();
                    break;
                case 5 :
                    String output = pattern();
                    System.out.println("How often should the sample be issued");
                    selected = Main.input.nextInt();
                    output(output, selected);
                    Main.input.nextLine();
                    break;
                case 6 :
                    System.out.println("please Enter a Text");
                    String text = Main.input.nextLine();
                    count = uppercaseCount(text);
                    System.out.println("your Text has " + count + " uppercase" );
                    break;

                default: System.out.println("Auswahl nicht vorhanden");break;

            }
            if (program) {
                System.out.println("selection not available");
                Main.input.nextLine();
            }
        }
    }
}