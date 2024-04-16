package com.eZweer.menu;
import java.util.HashMap;
import java.util.Scanner;

public abstract class Menu {
	protected Scanner input;
	protected boolean program;
	protected int select;
	protected HashMap<Integer , String> description ;
	
	public Menu() {
		input = new Scanner(System.in);
		program = true;
		description = new HashMap<Integer, String>();
	}
	
	private void showMenuSelection() {
		System.out.println("Select a program:");
		for (int i = 0; i < description.size();i++)
		{
			System.out.printf("%02d : %s", i , description.get(i));
			System.out.println();
		}
	};
	
	
	protected abstract void setDescription();
	
	protected abstract boolean switchCaseSelection();
	
	public void run() {
		while(program)
		{
			showMenuSelection();
			program = switchCaseSelection();
		}
	}
	
	
}
