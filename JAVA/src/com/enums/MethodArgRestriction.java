package com.enums;


public class MethodArgRestriction
{
	/*
	 * This method take Only branch type and nothing else, though underneath it
	 * is still String But we manage to put restriction on it. Point is we can
	 * force user not to provide wrong value.
	 * 
	 * Bonus: We can use switch also :) (ya, but in java 7 we can use switch on String too)
	 */
	public void checkValidBranch(Branch branch)
	{
		switch (branch)
		{
		case ELECTRONICS:
			System.out.println("We got: " + branch);
			break;
		case COMPUTER_SCIENCE:
			System.out.println("We got: " + branch);
			break;
		case BIO_TECH:
			System.out.println("We got: " + branch);
		}

	}

	/*
	 * I can put anything in this method. Yes, we can manage to identify wrong
	 * branch, but it too late. User all ready provided wrong value Point use
	 * there is no way to restrict the user, only thing we can do is, just
	 * return null or provide some error message or exception.
	 */
	public void checkValidBranch(String branch)
	{
		if (branch.equals("Electronics"))
		{
			System.out.println("We got Electronics");
		}
		else
			if (branch.equals("Computer Science"))
			{
				System.out.println("We got Computer Science");
			}
			else
				if (branch.equals("Bio Tech"))
				{
					System.out.println("We got Bio Tech");
				}
				else
				{
					System.out.println("Sorry wrong input, please try again");
				}

	}

	public static void main(String[] args)
	{
		MethodArgRestriction res = new MethodArgRestriction();

		res.checkValidBranch(Branch.BIO_TECH);
		res.checkValidBranch("anything");
		System.out.println("Trying again...");
		res.checkValidBranch("Bio Tech");

	}
}
