package com.collectionassingment;

import java.util.ArrayList;

class Car implements Comparable <Car>{
	
	private int ModelNo;
	private double price;
	private String color;
	private Engine engine;
	
	public Car(int modelNo, double price, String color, Engine engine) {
		super();
		ModelNo = modelNo;
		this.price = price;
		this.color = color;
		this.engine=engine;
	}
	
	public int getModelNo() {
		return ModelNo;
	}
	public void setModelNo(int modelNo) {
		ModelNo = modelNo;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice()
	{
		this.price=price;
	}
	
	public void setEngine( Engine engine) {
		this.engine = engine;
	}
	public Engine getEngine()
	{
        return engine;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	@Override
	public String toString() {
		return "Car [ModelNo=" + ModelNo + ", price=" + price + ", color=" + color + "]";
	}

	@Override
	public int compareTo(Car c) 
	{
		
	   this.getEngine().getEnginetype().compareTo(c.getEngine().getEnginetype());
		if(this.getPrice()<c.getPrice())
			return 1;
		else
			if(this.getPrice()>c.getPrice())
				return -1;
			else
				return 0;
	}
	
}



	



	
	