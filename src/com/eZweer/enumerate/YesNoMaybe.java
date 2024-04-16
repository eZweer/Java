package com.eZweer.enumerate;


import com.eZweer.Statics.StaticMethode;

public enum YesNoMaybe {
	YES, NO , MAYBE;
	
	    
	public static void doYouLikeJAva() {
		boolean program;
		String answerString ;
		YesNoMaybe[] ynm = YesNoMaybe.values();
		String text = "Do you like Java ? ";
		for (int i = 0; i < ynm.length;i++)
		{
			text = text + ynm[i];
			if (i < ynm.length-1)
			{
				text = text + "/";
			}
		}
		
		
		do {
			answerString = StaticMethode.getString(text);
			answerString = answerString.toUpperCase(); 
			try {
				
				answerString = YesNoMaybe.valueOf(answerString).toString();
				program = false;
			} catch (IllegalArgumentException e) {
				System.err.println("selection not available try again");
				program = true;
			}
		}while(program);
		
		switch (answerString) {
			case "YES": 
					System.out.println("it's clear. java is awesome!!!!");
					break;
			case "NO":
					System.out.println("then you probably just don't know it properly.");
					break;
			case "MAYBE":
				System.out.println("keep using it and you will love it.");
					break;
			default:
					break;
		}
		
		
		
	}
	
	
}
