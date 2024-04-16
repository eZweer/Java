package com.eZweer.entity;

import com.eZweer.Statics.StaticMethode;

public class Crosssum {
	String s;
	int i = 0;
	int sum;
	public Crosssum()
	{
		do {
			try {
				s = StaticMethode.getString("Enter a positive number and the cross sum will be calculated");
				i = Integer.parseInt(s, 10);
				System.out.println(i);
			} catch (NumberFormatException e) {
				System.err.println("Thats not a positiv number please Try again:");
			}
		}while(i <= 0);
	}
	public int whitModulo() {
		
		while (i > 0)
		{
			sum+= i % 10;
			i /= 10;
		}
		return sum;
	}
	public int whitoutModulo() {
		int num;
		for (int i = 0; i < s.length(); i++)
        {
            num = s.charAt(i) - 48;
            sum += num;
        }
		return sum;
	}
}
