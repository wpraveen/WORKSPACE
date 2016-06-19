package com.collections.queue;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Queue;

public class ArrayDequeTest {
	public static void main(String[] args) {
		/*
		 * ArrayDeque provide better performance over LinkedList as per the
		 * javaDocs when use as Stack or Queue.
		 */
		Queue<String> que = new ArrayDeque<String>();
		Collections.addAll(que, "B", "A", "C", "F", "A", "E", "Z", "G");
		System.out.println(que);
	}
}
