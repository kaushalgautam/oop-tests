package com.oop.guitar;

public class Guitar {
	private String serialNumber, model;
	private double price;
	private Builder builder;
	private Type type;
	private Wood backWood, topWood;
	
	
	public Guitar(String serialNumber, double price, Builder builder, String model, Type type, Wood backWood, Wood topWood) {
		this.serialNumber = serialNumber;
		this.builder = builder;
		this.model = model;
		this.type = type;
		this.backWood = backWood;
		this.topWood = topWood;
		this.price = price;
	}

	public String getSerialNumber() {
		return serialNumber;
	}

	public Builder getBuilder() {
		return builder;
	}

	public String getModel() {
		return model;
	}

	public Type getType() {
		return type;
	}

	public Wood getBackWood() {
		return backWood;
	}

	public Wood getTopWood() {
		return topWood;
	}

	public double getPrice() {
		return price;
	}
	
	public void setPrice(float newPrice) {
		this.price = newPrice;
	}
	
}