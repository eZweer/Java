package com.eZweer.menu;

import java.util.ArrayList;
import java.util.HashMap;


import com.eZweer.Statics.StaticMethode;


public class Player {
	public static ArrayList<Player> players = new ArrayList<Player>();
	
	
	public enum Classes{
		MAGE(1f,3f,2f,5f,0.5f,1f,0.5f,2f),WARRIOR(5f,3f,3f,1f,2f,1f,1f,0.25f),RANGER(3f,5f,2f,2f,1f,2f,0.5f,0.5f);
		
		private final float strength;
		private final float agility;
		private final float vitality;
		private final float intelligencer;
		private final float strengthLVL;
		private final float agilityLVL;
		private final float vitalityLVL;
		private final float intelligencerLVL;
		
		
		
		private Classes(float... stats)
		{
			strength = stats[0];
			agility = stats[1];
			vitality = stats[2];
			intelligencer = stats[3];
			strengthLVL = stats[4];
			agilityLVL = stats[5];
			vitalityLVL = stats[6];
			intelligencerLVL = stats[7];
		}

		public float getStrength() {
			return strength;
		}

		public float getAgility() {
			return agility;
		}

		public float getVitality() {
			return vitality;
		}

		public float getIntelligencer() {
			return intelligencer;
		}

		public float getStrengthLVL() {
			return strengthLVL;
		}

		public float getAgilityLVL() {
			return agilityLVL;
		}

		public float getVitalityLVL() {
			return vitalityLVL;
		}

		public float getIntelligencerLVL() {
			return intelligencerLVL;
		}
		public static String selection()
		{
			StringBuilder sBuilder = new StringBuilder();
			Classes[] classes = Classes.values();
			for (int i = 0; i < classes.length;i++)
			{
				sBuilder.append(classes[i].toString());
				if (i < classes.length -1) {
					sBuilder.append(" / ");
				}
				
			}
			return sBuilder.toString();
		}
		
	}	

	
	private String name;
	private int level;
	private String char_class;
	int bagback_size ;
	int dmg;
	int magic_dmg;
	HashMap<String, Integer> stats = new HashMap<String, Integer>();
	HashMap<String, Equipment> equipment = new HashMap<String, Equipment>();
	HashMap<Integer, String> bagpack = new HashMap<Integer, String>();
	public Player(String name, int level, String char_class)
	{
		setName(name);;
		this.level = level;
		setChar_class(char_class);
		bagback_size = level% 10 + 10;
		setStats(char_class);
		setDmg();
		setMagic_dmg();
		
		Player.players.add(this);
	}
	public String getName() {
		return name;
	}
	public int getLevel() {
		return level;
	}
	public String getChar_class() {
		return char_class;
	}
	public int getBagback_size() {
		return bagback_size;
	}
	public int getDmg() {
		return dmg;
	}
	public int getMagic_dmg() {
		return magic_dmg;
	}
	
	public HashMap<String, Integer> getStats() {
		
		return stats;
	}
	public HashMap<String, Equipment> getEquipment() {
		return equipment;
	}
	public HashMap<Integer, String> getBagpack() {
		return bagpack;
		
	}
	public void setName(String name) {
		boolean taken;
		
		do {
		taken = false;	
		for (Player p: players)
		{
			if (p.name.equals(name))
			{
				name = StaticMethode.getString("this name ist taken. please enter a new name");
				taken = true;
				break;
			}
		}
		}while(taken);
			
		this.name = name;
	}
	public void setLevel(int level) {
		this.level = level;
	}
	public void setChar_class(String char_class) {
		if (this.char_class == null){
			Classes[] classses = Classes.values();
			while (this.char_class == null) {
				for (Classes c : classses)
				{
					if (c.toString().equals( char_class.toUpperCase())) {
						this.char_class = char_class.toUpperCase();
						break;
					}
					
				}
				if (this.char_class == null)
				{
					char_class = StaticMethode.getString("Whats class ist your Charater?\n" + Player.Classes.selection());
				}
			}}
		else {
			System.err.println("You cant change your Class");
		}
		
	}
	public void setBagback_size(int bagback_size) {
		this.bagback_size = bagback_size;
	}
	public void setDmg() {
		Classes[] classses = Classes.values();
		dmg = 0;
		for (Classes c : classses)
		{
			if (c.toString() == char_class.toUpperCase()) {
				dmg =(int)(stats.get("strength") + (0.5 *(stats.get("agility"))));
			}
			
		}
	}
	public void setMagic_dmg() {
		Classes[] classses = Classes.values();
		magic_dmg = 0;
		for (Classes c : classses)
		{
			if (c.toString() == char_class.toUpperCase()) {
				 magic_dmg =(int)(stats.get("intelligencer") + (0.5 *(stats.get("agility"))));
			}
			
		}
	}
	public void setStats(String char_class) {
		Classes[] classses = Classes.values();
		Integer strength,agility,vitality,intelligencer, life;
		for (Classes c : classses)
		{
			if (c.toString() == char_class.toUpperCase()) {
				strength = (int)(c.getStrength() + (c.getStrength() * level));
				agility =(int)(c.getAgility() + (c.getAgilityLVL() * level));
				vitality = (int)(c.getVitality() + (c.getVitalityLVL() * level));
				intelligencer = (int)(c.getIntelligencer() + (c.getIntelligencerLVL() * level));
				life = vitality *100;
				
				stats.put("strength",strength);
				stats.put("agility",agility);
				stats.put("vitality",vitality);
				stats.put("intelligencer",intelligencer);
				stats.put("life",life);
				
			}
			
		}
		
		
	}
	public void setEquipment(HashMap<String, Equipment> equipment) {
		this.equipment = equipment;
	}
	public void setBagpack(HashMap<Integer, String> bagpack) {
		this.bagpack = bagpack;
	}
	
	public void printallData()
	{
		StringBuilder sBuilder = new StringBuilder();
		sBuilder.append("Neme: " + name + "\n");
		sBuilder.append("Level: " + level + "\n");
		sBuilder.append("Class: " + char_class + "\n");
		for (String s : stats.keySet()) {
			sBuilder.append(s + ": " + stats.get(s));
			}
		
		System.out.println(sBuilder.toString());
		
	}
	public static void printallChars()
	{
		for (Player player:players)
		{
			player.printallData();
		}
		
		
	}
	
}
