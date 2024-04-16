package com.eZweer.Statics;

import java.time.LocalDateTime;

import com.eZweer.entity.Enemy;
import com.eZweer.entity.Enemy.Difficulty;
import com.eZweer.entity.Enemy.Enemytype;
import com.eZweer.entity.Flights;

public class createStaticLists {

	public static void createFlights()
	{
		Flights[] flights = new Flights[] {
				new Flights(101, LocalDateTime.of(2019, 6, 12, 12, 0, 0), LocalDateTime.of(2019, 6, 12, 18, 20, 0), 1500, 12),
				new Flights(102, LocalDateTime.of(2019, 6, 12, 18, 0, 0), LocalDateTime.of(2019, 6, 13, 0, 0, 0), 1450, 14),
				new Flights(111, LocalDateTime.of(2019, 6, 12, 22, 0, 0), LocalDateTime.of(2019, 6, 13, 4, 0, 0), 1600, 18),
				new Flights(141, LocalDateTime.of(2019, 6, 13, 8, 0, 0), LocalDateTime.of(2019, 6, 13, 14, 0, 0), 1700, 5),
				new Flights(251, LocalDateTime.of(2019, 6, 13, 12, 0, 0), LocalDateTime.of(2019, 6, 13, 18, 0, 0), 1000, 34),
		        new Flights(607, LocalDateTime.of(2019, 6, 13, 18, 0, 0), LocalDateTime.of(2019, 6, 14, 0, 0, 0), 1100, 15),
		        new Flights(638, LocalDateTime.of(2019, 6, 14, 8, 0, 0), LocalDateTime.of(2019, 6, 14, 14, 0, 0), 1650, 7),
		        new Flights(703, LocalDateTime.of(2019, 6, 14, 12, 0, 0), LocalDateTime.of(2019, 6, 14, 18, 0, 0), 1450, 10),
		        new Flights(784, LocalDateTime.of(2019, 6, 14, 18, 0, 0), LocalDateTime.of(2019, 6, 15, 0, 0, 0), 1800, 2),
		        new Flights(788, LocalDateTime.of(2019, 6, 14, 22, 0, 0), LocalDateTime.of(2019, 6, 15, 4, 0, 0), 1200, 38)
	           };
	}
	
	
	public static void createEnemys()
	{
		Enemy[] enemies = new Enemy[] {
				new Enemy("Klausi Klaus", 3, Difficulty.EASY.toString(), Enemytype.HUMAN.toString()),
				new Enemy("Wolf", 5, Difficulty.EASY.toString(), Enemytype.ANIMAL.toString()),
				new Enemy("Xantana", 10, Difficulty.MEDIUM.toString(), Enemytype.SKELETT.toString()),
				new Enemy("Dead King", 20, Difficulty.HARD.toString(), Enemytype.SKELETT.toString()),
				new Enemy("Baby dragon", 10, Difficulty.MEDIUM.toString(), Enemytype.DRAGON.toString()),
				new Enemy("Gudugan", 15, Difficulty.HARD.toString(), Enemytype.ORK.toString()),
				new Enemy("Onyxia", 50, Difficulty.HELL.toString(), Enemytype.DRAGON.toString()),
				new Enemy("Peter the destroyer", 1, Difficulty.EASY.toString(), Enemytype.HUMAN.toString()),
				new Enemy("Kubanabax", 13, Difficulty.MEDIUM.toString(), Enemytype.ORK.toString()),
				new Enemy("Firefly", 100, Difficulty.HELL.toString(), Enemytype.ANIMAL.toString())
								
		};
	}
}
