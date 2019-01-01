package com.example.factory.pattern;

import com.example.factory.main.Elephant;
import com.example.factory.main.Tiger;
import com.example.factory.main.base.Animal;

public class FactoryPattern {
	
	public Animal getAnimalName(String name) {
		
		if (name.equalsIgnoreCase("Tİger")) {
			return new Tiger();
		} else if (name.equalsIgnoreCase("Elephant")) {
			return new Elephant();
		}
		
		return null;
	}

}
