public class own {

    /// search for prime numbers using multiple threads
    private static void multithreading(int limit, int numOfTreads)
    {
        OwnThread[] thread = new OwnThread[numOfTreads];

        /// create x treads
        for (int i = 0; i < numOfTreads; i++)
        {
            thread[i] = new OwnThread("Tread"+(i+1));
        }
        /// splitting the numbers across all threads
        for(int i = 1; i <= limit-(numOfTreads*2); i+= (numOfTreads *2))
        {

            for (int j = 0; j < numOfTreads; j++)
            {
                thread[j].run(i + (j*2));
            }
        }

    }


    private static void createNewCustomer(){
        DbConnector db = new DbConnector();
        

    }
    public static void start() {
        boolean program = true;
        int selected, limit, treads;
        while(program) {
            System.out.println("Select a program:");
            System.out.println("0: Back");
            System.out.println("1: Finding prime numbers with multithreading");



            selected = Main.input.nextInt();
            Main.input.nextLine();
            switch (selected) {

                case 0 :
                    program = false;
                    break;
                case 1 :
                    System.out.println("up to which number should you search for prime numbers?");
                    limit = Main.input.nextInt();
                    System.out.println("How many threads should be used?");
                    treads = Main.input.nextInt();
                    multithreading(limit,treads);
                    break;
                case 2 :
                    createNewCustomer();
                    break;

                default: System.out.println("selection not available");break;

            }

            System.out.println("press Enter to Continue");
            Main.input.nextLine();
        }
    }

}
