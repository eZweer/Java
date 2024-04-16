package com.eZweer.entity;

public class Faculty {

	public static int faculty(int x)
    {
        if (x == 1)
        {
            return x;
        }
        else
        {
            return x * faculty(x-1);
        }
    }
	
}
