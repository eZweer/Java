public class Aufgabe2 {

    /*
     * Sie bauen einen Roboter. In diesen ist eine Batterie eingebaut.
     * Erzeugen Sie eine Integer-Variable "batterieLaufzeit" mit dem Wert 5.
     * Anschließend implementieren Sie eine Methode "istBatterieLaufzeitNiedrig"
     * Diese Methode soll true zurückgeben, wenn die Laufzeit kleiner 2 ist, sonst false.
     *
     * Erstellen Sie eine String-Variable "aufgabe" und weisen Sie ihr "Ich reiche Butter." zu.
     * Implementieren Sie eine Methode "führeAufgabeAus", die auf dem Bildschirm die Variable "aufgabe" ausgibt,
     * wenn "istBatterieLaufzeitNiedrig" false liefert und dann die Batterie Laufzeit um 1 reduziert,
     * sonst soll "Ich muss aufgeladen werden" in der Konsole erscheinen.
     *
     * Lassen Sie in der Main den Roboter fünfmal die Aufgabe ausführen.
     */
    private static void startRobot()
    {
        System.out.println("Enter Battery Status");
        int batterystatus = Main.input.nextInt();
        Main.input.nextLine();
        System.out.println("Whats the task of The Robot?");
        String task = Main.input.nextLine();
        System.out.println("How often should the task be executed ");
        int x = Main.input.nextInt();
        Main.input.nextLine();

        Robot r = new Robot(batterystatus, task);
        for (int i = 0; i< x; i++) {
            r.executeTask();
        }
    }
    /*
     * Führen Sie 3 Integer-Variablen ein: auswahl, zahl1 und zahl2.
     * Über auswahl soll in einem Switch-Case eine Wahl getroffen werden, welche der 4 Grundrechenarten als Methode aufgerufen wird.
     * Sollte eine falsche Auswahl getroffen werden soll eine Ausgabe auf der Konsole erscheinen die anzeigt, welche Auswahl getroffen
     * wurde und das diese nicht korrekt oder verfügbar ist.
     * Schreiben Sie für jede Rechenart eine separate Methode und übergeben Sie an sie die für die Berechnung notwendigen Parameter
     * zahl1 und zahl2.
     * In der Methode soll dann die Berechnung durchgeführt und das Ergebnis an die main zurückgegeben werden.
     * Die Ausgabe des Ergebnisses soll dann auf der Konsole erscheinen.
     *
     * Beachten: Geben Sie eine Fehlermeldung auf der Konsole aus, wenn durch 0 dividiert wird.
     */
    private static void calculate()
    {
        System.out.println("Enter First Number");
        int num1 = Main.input.nextInt();
        System.out.println("Enter Second Number");
        int num2 = Main.input.nextInt();
        Main.input.nextLine();
        System.out.println("which type of calculation should be carried out");
        System.out.println("1: +");
        System.out.println("2: -");
        System.out.println("3: *");
        System.out.println("4: /");
        System.out.println("5: %");
        int selected = Main.input.nextInt();
        Main.input.nextLine();

        switch (selected)
        {
            case 1:
                System.out.println(num1 + num2);
                break;
            case 2:
                System.out.println(num1 - num2);
                break;
            case 3:
                System.out.println(num1 * num2);
                break;
            case 4:
                System.out.println(num1 / num2);
                break;
            case 5:
                System.out.println(num1 % num2);
                break;
            default:
                System.out.println("selection not available");
                break;
        }
    }
    /*
     * Schreiben Sie ein Programm, das Ihnen ausgibt, ob das über die Integer-Variable "jahr" eingeführte Jahr ein Schaltjahr ist.
     * Durch 4 ohne Rest teilbare Jahre sind normalerweise Schaltjahre.
     * Durch 100 ohne Rest teilbare Jahre sind keine Schaltjahre.
     * Durch 400 ohne Rest teilbare Jahre sind jedoch Schaltjahre.
     * Nutzen Sie zu Umsetzung die Boolesche Variable schaltjahr und lassen Sie sich das Jahr, sowie ob es ein Schaltjahr ist oder nicht, auf der Konsole ausgeben.
     */
    private static void leapYear()
    {
        System.out.println("Enter a Year");
        int year = Main.input.nextInt();
        Main.input.nextLine();
        System.out.println((year % 4 == 0 && (year % 100 != 0 || year % 400 == 0))? "leap year": "not a leap year");

    }
    private static boolean leapYear(int year)
    {
        return year % 4 == 0 && (year % 100 != 0 || year % 400 == 0);
    }
    /*
     * Schreiben Sie ein Programm das Ihnen zu jedem Monat im Jahr, den Sie mit der String-Variable "monat" einführen, die Tage des Monats ausgibt.
     * Nutzen Sie für die Monats-Auswahl ein Switch-Case. Bei falscher Monatsangabe soll eine Fehlermeldung auf der Konsole erscheinen.
     * Für den Monat Februar sind 28 Tage anzugeben.
     * Ausgabe auf der Konsole soll wie folgt lauten: "Der "+monat+" hat "+tage+" Tage."
     */
    private static void month() {
        System.out.println("Enter the name of Month");
        String month = Main.input.nextLine();
        month = month.toLowerCase();
        int days = 0;

        switch (month) {
            case "january":
                days = 31;
                break;
            case "february":
                days = 28;
                break;
            case "march":
                days = 31;
                break;
            case "april":
                days = 30;
                break;
            case "may":
                days = 31;
                break;
            case "june":
                days = 30;
                break;
            case "july":
                days = 31;
                break;
            case "august":
                days = 31;
                break;
            case "september":
                days = 30;
                break;
            case "october":
                days = 31;
                break;
            case "november":
                days = 30;
                break;
            case "december":
                days = 31;
                break;
            default:
                System.out.println("the month u has called ist not available");
                break;
        }
        if (days != 0) {
            System.out.println(month + " has " + days + " days");
        }


    }

        /*
         * Erweitern Sie die Aufgabe 3 mit der Angabe einer Integer-Variable "jahr" um ein bestimmtes Jahr einzuführen.
         * Danach führen sie eine Kontrollmethode istSchaltjahr ein, die das Jahr kontrolliert, ob es ein Schaltjahr ist.
         * Wenn ja soll anstatt 28 im Februar 29 Tage ausgegeben werden.
         * Die neue Konsolenausgabe soll dann lauten: "Der "+monat+" hat im Jahr "+jahr"+" : "+tage+" Tage.
         */
        private static void month(int year) {
            System.out.println("Enter the name of Month");
            String month = Main.input.nextLine();
            month = month.toLowerCase();
            int days = 0;

            switch (month) {
                case "january":
                    days = 31;
                    break;
                case "february":
                    days = (leapYear(year)) ? 29 : 28;
                    break;
                case "march":
                    days = 31;
                    break;
                case "april":
                    days = 30;
                    break;
                case "may":
                    days = 31;
                    break;
                case "june":
                    days = 30;
                    break;
                case "july":
                    days = 31;
                    break;
                case "august":
                    days = 31;
                    break;
                case "september":
                    days = 30;
                    break;
                case "october":
                    days = 31;
                    break;
                case "november":
                    days = 30;
                    break;
                case "december":
                    days = 31;
                    break;
                default:
                    System.out.println("the month u has called ist not available");
                    break;
            }
            if (days != 0) {
                System.out.println(month + " has " + days + " days in year " + year);
            }

    }
    public static void start() {
        boolean program = true;
        int selected;
        while(program) {
            System.out.println("Select a program:");
            System.out.println("0: Back");
            System.out.println("1: Robot");
            System.out.println("2: Calculate");
            System.out.println("3: leap year");
            System.out.println("4: days of the month");
            System.out.println("5: days of the month with year");



            selected = Main.input.nextInt();
            Main.input.nextLine();
            switch (selected) {

                case 0 :
                    program = false;
                    break;

                case 1 :
                    startRobot();
                    break;

                case 2 :
                    calculate();
                    break;

                case 3 :
                    leapYear();
                    break;

                case 4 :
                    month();
                    break;

                case 5 :
                    System.out.println("Enter the Year");
                    selected = Main.input.nextInt();
                    Main.input.nextLine();
                    month(selected);
                    break;

                default: System.out.println("selection not available");break;

            }

            System.out.println("press Enter to Continue");
            Main.input.nextLine();
        }
    }
}
