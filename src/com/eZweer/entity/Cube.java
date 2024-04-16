package com.eZweer.entity;

public class Cube {

		private float x;
		
		
		public Cube(float x) {
		this.x = x;
		}
		// calculate area of cube
		private float getArea()
		{
			return x *x *6;
		}
		// calculate volume of cube
		private float getVolume() {
			return x *x *x;
		}
		// return String whit area and volume
		public String getAreaAndVolume()
		{
			return String.format("Area : %02f   Volume: %02f", getArea() , getVolume());
		}
}
