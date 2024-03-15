public class Aufgabe2 {

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


        private static void month(int year)
        {
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
