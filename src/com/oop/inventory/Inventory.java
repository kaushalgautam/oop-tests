package com.oop.inventory;

import java.util.LinkedList;
import java.util.List;

import com.oop.guitar.Builder;
import com.oop.guitar.Guitar;
import com.oop.guitar.Type;
import com.oop.guitar.Wood;

public class Inventory {

	private List<Guitar> guitars;
	
	public Inventory() {
		guitars = new LinkedList<Guitar>();
	}
	
	public void addGuitar(String serialNumber, 
			double price, Builder builder, String model,
			Type type, Wood backWood, Wood topWood) {
		
		Guitar guitar = new Guitar(serialNumber, price, builder, model, type, backWood, topWood);
		
		guitars.add(guitar);
	}
	
	public Guitar getGuitar(String serialNumber) {
		for (Guitar guitar : guitars) {
			if(guitar.getSerialNumber().equals(serialNumber)) {
				return guitar;
			}
		}
		return null;
	}
	
	public List<Guitar> search(Guitar searchGuitar) {
		
		List<Guitar> matchingGuitars = new LinkedList<Guitar>();
		for (Guitar guitar : guitars) {

			String searchGuitarModel = searchGuitar.getModel().toLowerCase();
			if((searchGuitarModel != null) 
					&& (!searchGuitarModel.equals("")) 
					&& (!searchGuitarModel.equals(guitar.getModel().toLowerCase())))
				continue;
			
			if(searchGuitar.getBuilder() != guitar.getBuilder())
				continue;
						
			if(searchGuitar.getType() != guitar.getType())
				continue;
			
			if(searchGuitar.getTopWood() != guitar.getTopWood())
				continue;
			
			if(searchGuitar.getBackWood() != guitar.getBackWood())
				continue;
			
			matchingGuitars.add(guitar);
		}
		
		return matchingGuitars;
	}
}
