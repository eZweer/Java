package com.eZweer.entity;

import java.util.concurrent.TimeUnit;

public class Robot {
    int battery;
    String task;
    public Robot(int battery, String task){
        this.battery = battery;
        this.task = task;
    }

    public void setBatterie(int battery){
        this.battery = battery;
    }
    public void setTask(String task){
        this.task = task;
    }
    public int getBattery(){
        return battery;
    }
    public String getTask()
    {
        return task;
    }
    public boolean isBatterieLow()
    {
        return battery < 2;
    }
    
    // execute the task or charge if battery is low
    public void executeTask() throws InterruptedException {

        if (!isBatterieLow()) {
            System.out.println(task);
            battery--;
        }
        else{
            System.err.println("Battery have to charge");
            TimeUnit.SECONDS.sleep(1);
            charge();
        }
    }
    // Charge battery, requires 1 second per charging level
    private void charge() throws InterruptedException {

        while (battery <5)
        {
            for (int i = 0; i < 3 ; i++)
            {
                System.out.println("loading");
                TimeUnit.SECONDS.sleep(1);
            }
            battery++;
            System.out.println("batterystatus : " + battery);
        }
    }

}

