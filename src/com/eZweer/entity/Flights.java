package com.eZweer.entity;

import java.time.LocalDateTime;
import java.util.ArrayList;


public class Flights {
	int id;
	LocalDateTime departure;
	LocalDateTime arrival;
	float price;
	int freePlaces;
	public static ArrayList<Flights> flights = new ArrayList<Flights>();

	public Flights(int id, LocalDateTime departure, LocalDateTime arrival, float price, int freePlaces) {
		this.id = id;
		this.departure = departure;
		this.arrival = arrival;
		this.price = price;
		this.freePlaces = freePlaces;
		
		flights.add(this);
	}
		
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public LocalDateTime getDeparture() {
		return departure;
	}

	public void setDeparture(LocalDateTime departure) {
		this.departure = departure;
	}

	public LocalDateTime getArrival() {
		return arrival;
	}

	public void setArrival(LocalDateTime arrival) {
		this.arrival = arrival;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public int getFreePlaces() {
		return freePlaces;
	}

	public void setFreePlaces(int freePlaces) {
		this.freePlaces = freePlaces;
	}
	public static void printFlights(ArrayList<Flights> flights)
	{
		for (Flights f : flights)
		{
			System.out.println("Flight ID : " +f.getId());
			System.out.println("Flight departure : " +f.getDeparture());
			System.out.println("Flight arrival : " +f.getArrival());
			System.out.println("Flight price : " + (String.format("%.02f",f.getPrice())));
			System.out.println("Flight freePlaces : " +f.getFreePlaces());
			
		}
	}
	private static ArrayList<Flights> sort(ArrayList<Flights> list)
	{
		Flights cheep = null;
		float last = 0;
		ArrayList<Flights> newList = new ArrayList<Flights>();
		while(list.size() > newList.size())
		{
			float price = Float.MAX_VALUE;
			for (Flights f : list)
			{
				if(f.price < price && f.price > last)
				{
					cheep = f;
				}
				newList.add(cheep);
				last = cheep.getPrice();
			}
		}
		return newList;
		
	}
	
	public static ArrayList<Flights> checkAvailability(LocalDateTime departure, int places)
	{	
		ArrayList<Flights> possible = new ArrayList<Flights>();
		
		for (Flights f : flights)
		{
			if(f.getDeparture().equals(departure) && places <= f.getFreePlaces() )
			{
				possible.add(f);
			}
		}
		possible = sort(possible);
		return possible;
	}
	
	
	

}
