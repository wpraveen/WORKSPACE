package com.enums;

public enum Branch
{
	ELECTRONICS("Electronics"), COMPUTER_SCIENCE("Computer Science"), BIO_TECH("Bio Tech");
	
	String value;
	Branch(String value)
	{
		this.value = value;
	}
	
	@Override
	public String toString()
	{
		
		return "" + this.value;
	}
}
