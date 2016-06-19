package com.collections.queue;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueTest {
	public static void main(String[] args) {
		
		Queue<String> que = new PriorityQueue<String>();
		Collections.addAll(que,  "B", "A", "C","F" ,"A","E","Z","G");
		System.out.println("Default come in sorted order as priority describe by comprator");
		System.out.println(que);

	}

}
