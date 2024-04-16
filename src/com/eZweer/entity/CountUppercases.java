package com.eZweer.entity;

public class CountUppercases {
	String string;
	int sum ;
	
	public CountUppercases(String string) {
		this.string = string;
		sum =0;
	}
	
	public int countUppercases() {
		for (int i = 0; i < string.length();i++)
        {
           if (Character.isUpperCase(string.charAt(i)))
           {
               sum++;
           }
        }
        return sum;
	}
	
}
