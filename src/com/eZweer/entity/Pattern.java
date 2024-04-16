package com.eZweer.entity;

public class Pattern {
	String string = "";
	char c;
	int i;
	float f;
	public Pattern(char c, int i, float f)
	{
		this.c = c;
		this.i = i;
		this.f = f;
	}
	
	public void getPatternString()
	{
		for (int j = 0; j <i; j++) {
			
			string = string  +c +f + c;
			
		}
		for (int j = 0; j <i; j++) {
			
			System.out.println(getString());
			
		}
		
	}
	private String getString()
	{
		return string;
	}
	
}
