package com.eZweer.enumerate;

import com.eZweer.Statics.StaticMethode;

public enum Kyu {
	BROWN(1), BLUE(2),GREEN(3),ORANGEGREEN(4),ORANGE(5),YELLOWORANGE(6),YELLOW(7),YELLOWWHITE(8),WHITE(9);
	
	private final int degree;
	
	private Kyu(int i) {
		this.degree = i;
	}



	public int getDegree()
	{
		return degree;
	}
	
	public static String degreeToColor(int degree)
	{
		Kyu[] kyu = Kyu.values();
		
		for (Kyu k : kyu)
		{
			if (k.getDegree() == degree) {
				return k.toString();
			}
			
		}
		return "";
	}
	public static int colorToDegree(String color)
	{
		Kyu[] kyu = Kyu.values();
		
		for (Kyu k : kyu)
		{
			if (k.toString().equals(color)) {
				return k.getDegree();
			}
			
		}
		return 0;
	}
	public static String nextDegree(String color)
	{
		int x = colorToDegree(color) -1;
	
		return ( (x) > 0)? degreeToColor(x): "You got the highest degree" ;
	}
	public static String valuetest(String text)
	{
		String answerString ;
		Kyu[] kyu = Kyu.values();	
		text = text + "\n";
		for (int i = 0; i < kyu.length;i++)
			{
				text = text + kyu[i];
				if (i < kyu.length-1)
				{
					text = text + "\n";
				}
			}
		
		do {
			answerString = StaticMethode.getString(text);
			answerString = answerString.toUpperCase(); 
			try {
					
				answerString = Kyu.valueOf(answerString).toString();
				return answerString;
			} catch (IllegalArgumentException e) {
					
				System.err.println("selection not available try again");
		
				}
		}while(true);
	}
	public static void run()
	{
		Select.selectAction();
	}
}
enum Select{
	DEGREE_TO_COLOR, COLOR_TO_DEGREE, NEXT_DEGREE;
	
	public static void selectAction() {
		boolean program;
		String answerString ;
		Select[] s = Select.values();
		String text = "Do you like Java ? ";
		for (int i = 0; i < s.length;i++)
		{
			text = text + s[i];
			if (i < s.length-1)
			{
				text = text + "/";
			}
		}
		
		
		do {
			answerString = StaticMethode.getString(text);
			answerString = answerString.toUpperCase(); 
			try {
				
				answerString = Select.valueOf(answerString).toString();
				program = false;
			} catch (IllegalArgumentException e) {
				System.err.println("selection not available try again");
				program = true;
			}
		}while(program);
		
		switch (answerString) {
			case "DEGREE_TO_COLOR": 
					int degree = StaticMethode.getInt("Enter the number of degree 1-9");
					System.out.println(Kyu.degreeToColor(degree));
					break;
			case "COLOR_TO_DEGREE":
					String colorString = Kyu.valuetest("enter a color");
					System.out.println(Kyu.colorToDegree(colorString));
					
					break;
			case "NEXT_DEGREE":
					String colorString1 = Kyu.valuetest("enter a color");
					System.out.println(Kyu.nextDegree(colorString1));
					break;
			default:
					break;
		}
}}
