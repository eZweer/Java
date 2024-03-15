import java.util.*;



public class Aufgabe1 {


    public static int faculty(int x)
    {
        if (x == 1)
        {
            return x;
        }
        else
        {
            return x * faculty(x-1);
        }
    }
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
    public static void oddornot(int x) {

        if (x % 2 == 0) {
            System.out.println("even");
        } else {
            System.out.println("odd");
        }
    }
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
                System.out.println("press Enter to Continue");
                Main.input.nextLine();
            }
        }
    }
}