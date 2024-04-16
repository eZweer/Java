package com.eZweer.entity;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayWritter {
	private static Scanner input= new Scanner(System.in);
	private static ArrayList<Integer> list = new ArrayList<Integer>();
	
	public ArrayWritter() {
		for (int i = 0; i <10; i++)
        {
            list.add(i+1);
        }
		
	}
	
	private static void printList()
    {
        for (int i = 0; i < list.size();i++) {
            System.out.println((i + 1) + ". " + list.get(i));
        }
    }
	
	
	
    private  boolean tryRemoveAt( int index) {
        boolean removed;
        try {
            list.remove(index-1);
            removed = true;
        } catch (IndexOutOfBoundsException e) {
            removed = false;
        }
        return removed;
    }
    
    private  boolean tryRemoveFromXtoY(int x , int y) {
        boolean removed = true;
        if (x > y) {
            int temp = x;
            x = y;
            y = temp;
        }
        for ( int i = x-1; i < y-1; i++)
        try {
            list.get(i);
        } catch (IndexOutOfBoundsException e) {
            removed = false;
        }
        if (removed)
            for ( int i = y-1; i >= x-1; i--){
                list.remove(i);
            }
        return removed;
    }
    
    public  void start(){
        int x,y, selected;
        
        System.out.println("The ArrayL List has the following values");
        printList();
        System.out.println("Do you want to delete one or more values?");
        System.out.println("0: No, the values should stay that way");
        System.out.println("1: yes, I would like to delete a value");
        System.out.println("2: yes, I would like to delete several values");
        selected = input.nextInt();
        input.nextLine();
        switch(selected)
        {
            case 0:
                System.out.println("ok the array list stays as it is ");
                printList();
                break;
            case 1:
                System.out.println("which value should be deleted please specify index (1-10)");
                x = input.nextInt();
                input.nextLine();
                if (tryRemoveAt(x))
                {
                    System.out.println("The deletion was successful, the array list looks like this");
                    printList();
                }
                else {
                    System.out.println("The deletion wasn`t successful, the array list looks like this");
                    printList();
                }
                break;
            case 2:
                System.out.println("which values should be deleted please specify index (1-10)");
                System.out.println("from:");
                x = input.nextInt();
                System.out.println("till:");
                y = input.nextInt();
                input.nextLine();
                if (tryRemoveFromXtoY(x,y))
                {
                    System.out.println("The deletion was successful, the array list looks like this");
                    printList();
                }
                else {
                    System.out.println("The deletion wasn`t successful, the array list looks like this");
                    printList();
                }
                break;
                default: System.out.println("selection not available");break;


        }


    }

}
