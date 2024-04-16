package com.eZweer.entity;

public class Footballfield {
	float width;
	float lenth;
	boolean suitable;
	public Footballfield(float width, float lenth) {
		this.width = width;
		this.lenth = lenth;
		suitable = (width >= 64 && width <= 75 && lenth >= 100 && lenth <= 110);
		
	}
	public float getWidth() {
		return width;
	}
	public void setWidth(float width) {
		this.width = width;
		setSuitable(suitable);
	}
	public float getLenth() {
		return lenth;
	}
	public void setLenth(float lenth) {
		this.lenth = lenth;
		setSuitable(suitable);
	}
	public boolean getSuitable() {
		return suitable;
	}
	private void setSuitable(boolean suitable) {
		suitable = (width >= 64 && width <= 75 && lenth >= 100 && lenth <= 110);
	}
	
}
