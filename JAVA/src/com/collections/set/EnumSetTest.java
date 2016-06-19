package com.collections.set;

import java.util.ArrayList;
import java.util.Collections;
import java.util.EnumSet;
import java.util.List;

public class EnumSetTest {

	public static void main(String[] args) {
		System.out.println("Only advantage EnumSet provide is, it enforces the requirement "
				+ "that the elements must be of the specified enum type.");
		EnumSet<Size> enumsSet = EnumSet.of(Size.XL, Size.XXL, Size.XXXL);
		System.out.println("Enums by EnumSet: " + enumsSet);
		
		List<Size> enumsList = new ArrayList<Size>();
		Collections.addAll(enumsList, Size.XL, Size.XXL, Size.XXXL);
		System.out.println("enums by Arraylist: " + enumsList);
	}
}

enum Size {
	S, M, L, XL, XXL, XXXL;

}
