public class own {

    private static void multithread(int limit,int treads)
    {
        OwnThread[] thread = new OwnThread[treads];
        for (int i = 0; i < treads; i++)
        {
            thread[i] = new OwnThread("Tread"+(i+1));
        }
        for(int i = 1; i <= limit-(treads*2); i+= (treads *2))
        {
            for (int j = 0; j < treads; j++)
            {
                thread[j].run(i + (j*2));
            }
        }
        try{
            for (int i = 0; i < treads; i++)
            {
                thread[i].join();
            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

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
                    multithread(limit,treads);
                    break;


                default: System.out.println("selection not available");break;

            }

            System.out.println("press Enter to Continue");
            Main.input.nextLine();
        }
    }

}
