package com;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Test {
	
	public static void main(String[] args) {
		
		List<String> l1 = Arrays.asList("1","2","3");
		List<String> l2 = Arrays.asList("4","5");
		List<String> l3 = Arrays.asList("6");
		
		List<String> finalList = new ArrayList<String>();
		Collections.addAll(finalList, "1","2");
		
	}

}
