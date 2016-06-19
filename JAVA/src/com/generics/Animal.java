package com.generics;

class Animal
{

	void printMe()
	{
		System.out.println("i am an Animal");
	}
	
	@Override
	public String toString()
	{
		return "[Animal]";
	}
}

class Dog extends Animal
{
	void printMe()
	{
		System.out.println("i am a Dog");
	}
	
	@Override
	public String toString()
	{
		return "[Dog]";
	}
}

class Cat extends Animal
{
	void printMe()
	{
		System.out.println("i am a Cat");
	}
	
	
	@Override
	public String toString()
	{
		return "[Cat]";
	}
}
