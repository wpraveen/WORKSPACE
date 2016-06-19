package com.collections.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class IteratorTest {

	public static void testIterators() {
		System.out.println("Testing simple Iterator Functionality");
		List<String> datas = new ArrayList<String>();
		Collections.addAll(datas, "1", "2", "3");
		Iterator<String> ite = datas.iterator();
		while (ite.hasNext()) {
			String data = ite.next();
			System.out.println("By Iterator: " + data);
		}
	}

	public static void removeUsingIterators() {
		System.out.println("Removing data from list using Iterator");
		List<String> datas = new ArrayList<String>();
		Collections.addAll(datas, "1", "2", "3");
		System.out.println("Data before remove: " + datas);
		Iterator<String> ite = datas.iterator();
		while (ite.hasNext()) {
			String data = ite.next();
			if (data.equals("2")) {
				/*
				 * You will get exception if you call remove, without calling
				 * next(IllegalStateException), as remove use the data fetched
				 * by next.
				 */
				ite.remove();
			}
		}
		System.out.println("Data post remove: " + datas);
	}

	public static void main(String[] args) {
		testIterators();
		// removeUsingIterators();
	}
}
