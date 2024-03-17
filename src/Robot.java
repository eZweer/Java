public class Robot {
    int batterystatus;
    String task;
    public Robot(int batterystatus, String task)
    {
        this.batterystatus = batterystatus;
        this.task = task;
    }
    private boolean batterielow()
    {
        return batterystatus < 2;
    }
    
    public void executeTask()
    {
       

        if (batterielow())
        {
            System.out.println("please recharge");
        }
        else {
        	System.out.println(task);
            batterystatus--;
        }
    }
}
