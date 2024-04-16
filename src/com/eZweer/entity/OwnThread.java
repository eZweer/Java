package com.eZweer.entity;

public class OwnThread extends  Thread{
    String name;

    public OwnThread(String name)
    {
        this.name = name;
    }


    public void run(int number)
    {
        /// test if the number is a prime number and output it
        boolean isPrime = true;
        for (int i = 3; i <= (int)Math.sqrt(number); i = i +2 )
        {
            if (number % i == 0)
            {
                isPrime = false;
                break;
            }

        }
        if (isPrime)
        {
            System.out.println(name + ": " +number);
        }
    }
    

}