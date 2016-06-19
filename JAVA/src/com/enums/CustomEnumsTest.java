package com.enums;


enum CustomEnums
{
	ELECTRONICS(1), COMPUTER_SCIENCE(2), BIO_TECH(3);
	
	int value;
	CustomEnums(int value)
	{
		this.value = value;
	}
	
	@Override
	public String toString()
	{
		
		return "" + this.value;
	}
}

public class CustomEnumsTest
{
	public static void main(String[] args)
	{
		for (CustomEnums customEnums : CustomEnums.values())
		{
			
			System.out.println(customEnums);
			
		}
	}
}
