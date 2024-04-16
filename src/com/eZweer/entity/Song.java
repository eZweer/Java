package com.eZweer.entity;

import com.eZweer.Statics.StaticMethode;

public class Song {
	String title, interpret;
	int sec;
	
	public Song(String title, int sec, String interpret) {
		this.title = title;
		this.sec = sec;
		this.interpret = interpret;
	}


	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getInterpret() {
		return interpret;
	}

	public void setInterpret(String interpret) {
		this.interpret = interpret;
	}

	public int getSec() {
		return sec;
	}

	public void setSec(int sec) {
		this.sec = sec;
	}
	public float getMin() {
		String min = sec/60 + "." + ((sec%60 > 10)?sec%60: "0"+ sec%60);
		return StaticMethode.stringToFloat(min);
	}
	public void play() {
	System.out.println("Title: "+ title );
	System.out.println("Interprter: "+ interpret);
	System.out.println("Playtime: " +String.format("%.02f", getMin()).replace(",", ".") + " MIN");
	}
}