    
    
    FactoryPattern pattern = new FactoryPattern();
		
		Animal animal1 = pattern.getAnimalName("Tiger");
		animal1.animalName();
		
		Animal animal2 = pattern.getAnimalName("Elephant");
		animal2.animalName();
    
    
    
    Outputs : 

    Tiger
    Elephant
