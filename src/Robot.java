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
        System.out.println(task);

        if (batterielow())
        {
            System.out.println("please recharge");
        }
        else {
            batterystatus--;
        }
    }
}
