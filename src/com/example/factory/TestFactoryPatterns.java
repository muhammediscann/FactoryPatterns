package com.example.factory;

import com.example.factory.main.base.Animal;
import com.example.factory.pattern.FactoryPattern;

public class TestFactoryPatterns {

	public static void main(String[] args) {
		
		FactoryPattern pattern = new FactoryPattern();
		
		Animal animal1 = pattern.getAnimalName("Tiger");
		animal1.animalName();
		
		Animal animal2 = pattern.getAnimalName("Elephant");
		animal2.animalName();
	}

}
