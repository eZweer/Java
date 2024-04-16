package com.eZweer.entity;

import java.util.ArrayList;


import com.eZweer.Statics.StaticMethode;


public class Enemy {
	public enum Enemytype{
		SKELETT,ORK,DRAGON,ANIMAL,HUMAN;
	}
	public enum Difficulty{
		EASY("green","that will be easy"),MEDIUM("orange","an equal opponent"),HARD("red","It is too dangerous to attack this enemy, get allies"),HELL("Dark Red", "RUN!!!");
		
		private final String color;
		private final String message;
		
		private Difficulty(String color, String message)
		{
			this.color = color;
			this.message = message;
		}
	}
	public static ArrayList<Enemy> enemys= new ArrayList<Enemy>();
	
	
	String name;
	int level;
	String difficulty;
	String type;
	public Enemy(String name, int level,String diffuculty, String type )
	{
		this.name = name;
		this.level = level;
		this.difficulty =diffuculty;
		this.type = type;
		enemys.add(this);
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getLevel() {
		return level;
	}
	public void setLevel(int level) {
		this.level = level;
	}
	public String getDifficulty() {
		return difficulty;
	}
	public void setDifficulty(String difficulty) {
		this.difficulty = difficulty;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public static void printEnemyList() {
		for (Enemy e: enemys)
		{
			System.out.println("[Name: " + e.getName()+" Level: "+ e.getLevel() + " difficulty: " + e.getDifficulty() + " Type = "+ e.type + " ]");
			
		}
	}	
	public static void attack_Enemy() {
			int select;
			int i = 0;
			System.out.println("Which enemy do you want to attack?");
			for (Enemy e: enemys)
			{
				
				System.out.println( ++i + "[Name: " + e.getName()+" Level: "+ e.getLevel() + "]");
				
			}	
			select = StaticMethode.getInt("Enter the Number of Enemy");
			Difficulty[] difficulty = Difficulty.values();
			for(Difficulty d : difficulty)
			{
				if(d.toString().equals( enemys.get(select-1).getDifficulty())) {
					System.out.println(d.color);
					System.out.println(d.message);
				}
			}
				
			
		
		
			
	}
}
