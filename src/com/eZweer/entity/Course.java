package com.eZweer.entity;

public class Course {
	private int id;
	private static int counter;
	private static int  maxValue;
	private static Course[] course ;
	public Course(int id)
	{	
		for (Course c : course)
		{
			if (c == null)
				break;
			else if(c.getId() == id)
			{
				System.err.println("this ID is already taken");
				id = -1;
			}
		}
	
		this.id = id ;
		insertIntoCourse();
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public static int getCounter() {
		return counter;
	}
	public static void setCounter(int counter) {
		Course.counter = counter;
	}
	public static int getMaxValue() {
		return maxValue;
	}
	public static void setMaxValue(int maxValue) {
		if (maxValue != 0)
			Course.maxValue = maxValue;
			setCourse();
		    
	}
	public static Course[] getCourse() {
		return course;
	}
	private static void setCourse() {
		Course.course = new Course[maxValue];
	}
	private void insertIntoCourse()
	{
		course[counter] = this;
		counter++;
		
	}
	public static void printCourses()
	{
		for (Course c : course)
		{
			if(c.getId() == -1)
			{
				System.err.println("Course found with wrong ID");
			}
			else {
				System.out.println(c.getId());
				
			}
		}
	}
	
	

}
