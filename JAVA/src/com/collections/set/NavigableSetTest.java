package com.collections.set;

import java.util.Collections;
import java.util.Set;
import java.util.TreeSet;

public class NavigableSetTest {
	public static void main(String[] args) {
		/*
		 * TreeSet implements NavigableSet interface.
		 */
		TreeSet<String> treeSet = new TreeSet<String>();
		Collections.addAll(treeSet,  "B", "A", "C","F" ,"A","E","Z","G");
		System.out.println("Default TreeSet values: sorted order: " + treeSet);
		Set<String> subVal = treeSet.subSet("C", "F");
		System.out.println("Way to get the range values(using NavigableSet): " + subVal);
		
	}

}
