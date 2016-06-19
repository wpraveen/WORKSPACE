package com.threads;

class Queue {

	synchronized void get() {
		System.out.println("Consumed..");
		System.out.println();
		notify();
		try {
			wait();
		} catch (InterruptedException e) {
			System.out.println("InterruptedException caught");
		}
	}
	
	private void someHeavyTask()
	{
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	synchronized void put() {
		notify();
		someHeavyTask();
		System.out.println("Produced..");
		try {
			wait();
		} catch (InterruptedException e) {
			System.out.println("InterruptedException caught");
		}
	}
}

class Producer implements Runnable {
	Queue queue;

	Producer(Queue queue) {
		this.queue = queue;
		new Thread(this, "Producer").start();
	}

	public void run() {
		while (true) {
			queue.put();
		}
	}

}

class Consumer implements Runnable {
	Queue queue;

	Consumer(Queue queue) {
		this.queue = queue;
		new Thread(this, "Consumer").start();
	}

	public void run() {
		while (true) {
			queue.get();
		}
	}
}

public class ProducerConsumerTest {

	public static void main(String[] args) {
		Queue queue = new Queue();
		new Producer(queue);
		new Consumer(queue);
		System.out.println("Press Control-C to stop.");
	}
}
