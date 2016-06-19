package com.collections.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorTest {

	public static void testListIterators() {
		System.out.println("Testing simple List iterator Functionality");
		List<String> datas = new ArrayList<String>();
		Collections.addAll(datas, "1", "2", "3");
		ListIterator<String> listIte = datas.listIterator();
		while (listIte.hasNext()) {
			String data = listIte.next();
			System.out.println(data);
		}
	}

	public static void testSetUsingListIterators() {
		System.out.println("Printing List in reverse order using Iterator");
		List<String> datas = new ArrayList<String>();
		Collections.addAll(datas, "1", "2", "3");
		System.out.println("Before set: " + datas);
		ListIterator<String> listIte = datas.listIterator();
		while (listIte.hasNext()) {
			String data = listIte.next();
			if (data.equals("2")) {
				listIte.set("9");
			}
		}
		System.out.println("Post set: " + datas);
	}

	public static void printListInReverseUsingIterators() {
		System.out.println("Printing List data in reverse order using Iterator functionality");
		List<String> datas = new ArrayList<String>();
		Collections.addAll(datas, "1", "2", "3");
		System.out.println("Original: " + datas);
		ListIterator<String> listIte = datas.listIterator(datas.size());
		while (listIte.hasPrevious()) {
			System.out.println(listIte.previous());
		}

		System.out.println(listIte);
	}

	public static void main(String[] args) {
		// testListIterators();
		// testSetUsingListIterators();
		printListInReverseUsingIterators();
	}
}
