package com.generics;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayGenericGotcha
{

	public void checkAnimal(Animal[] animals)
	{
		for (Animal animal : animals)
		{
			animal.printMe();
		}
	}
	
	public void checkAnimal(List<Animal> animals)
	{
		for (Animal animal : animals)
		{
			animal.printMe();
		}
	}
	
	public void addDogInAnimal(List<Animal> animals)
	{
		animals.add(new Dog());
		System.out.println(animals);
	
	}
	
	public void addDogInAnimal(Animal[] animals)
	{
		animals[2] = new Dog();
		
		System.out.println(Arrays.toString(animals));
	
	}
	
	
	
	public static void main(String[] args)
	{
		
		ArrayGenericGotcha agg = new ArrayGenericGotcha();
		
		List<Animal> animalsList = new ArrayList<Animal>();
		animalsList.add(new Animal());
		Animal[] animalArray = new Animal[animalsList.size()];
		
		List<Dog> dogs = new ArrayList<Dog>();
		dogs.add(new Dog());
		
		animalArray = animalsList.toArray(animalArray);
		
	//	agg.checkAnimal(animalArray);
		//agg.checkAnimal(dogsArray);
		
		//This will work
		agg.checkAnimal(animalsList);
		// But this will not.
		//agg.checkAnimal(dogs);
		
		

		// This will not work.
		//agg.checkAnimal(dogs);
		
		
		
		Animal[] animalDogCat = new Animal[3];
		animalDogCat[0] = new Animal();
		animalDogCat[1] = new Cat();
		
	//	agg.addDogInAnimal(animalDogCat);
		
		animalsList.add(new Cat());
		//agg.addDogInAnimal(animalsList);
		
		List<Cat> catList = new ArrayList<Cat>();
		catList.add(new Cat());
		Cat[] catArr = new Cat[3];
		catArr[0] = new Cat();
		// java.lang.ArrayStoreException: you can't have different type of object in same array
		//agg.addDogInAnimal(catArr);
		//agg.addDogInAnimal(catList);
		
		
	}
}
