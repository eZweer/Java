import java.util.Scanner;

public class Main {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
            // create variable
            boolean program = true;
            int selected;

            // start main program
            while (program) {
                // Print program selection

                System.out.println("Select a program:");
                System.out.println("0: END");
                System.out.println("1: W1 D2");
                System.out.println("2: W1 D3");
             /* System.out.println("3: ");
                System.out.println("4: ");
                System.out.println("5: ");
                System.out.println("6: ");*/

                // select program
                selected = Main.input.nextInt();
                switch (selected) {

                    case 0:
                        System.out.println("Good BY");
                        program = false;
                        break;
                    case 1:
                        Aufgabe1.start();
                        break;
                    case 2:
                        Aufgabe2.start();
                        break;
                  /*  case 3:

                        break;
                    case 4:

                        break;
                    case 5:

                        break;
                    case 6:

                        break;
*/
                    default:
                        System.out.println("selection not available");
                        break;

                }
            }
    }
}