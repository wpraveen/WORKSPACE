package com.generics;


import java.util.ArrayList;
import java.util.List;

public class GenericSuperAndExtend
{

	
	
	public void addDogWithExtendAnimal(List<? extends Animal> animals)
	{	
		// Compile time error.
		//animals.add(new Dog());
		System.out.println(animals);
	
	}
	
	
	public void addDogWithSuperDog(List<? super Dog> animals)
	{	
		// Will work
		animals.add(new Dog());
		System.out.println(animals);
	
	}
	public static void main(String[] args)
	{
		
		GenericSuperAndExtend gse = new GenericSuperAndExtend();
		List<Animal> animalsList = new ArrayList<Animal>();
		animalsList.add(new Animal());
		gse.addDogWithSuperDog(animalsList);
		
	}
}
