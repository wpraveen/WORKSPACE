package com.enums;




public class SimpleEnums
{
	public static void main(String[] args)
	{
		for (Branch branch : Branch.values())
		{
			System.out.println(branch.compareTo(Branch.COMPUTER_SCIENCE) + " ");
			System.out.println(branch.equals(Branch.COMPUTER_SCIENCE) + " ");
			System.out.println(branch == Branch.COMPUTER_SCIENCE);
			System.out.println(branch.getDeclaringClass());
			System.out.println(branch.name());
			System.out.println("----------------------");
		}
	}
}
