package com.threads;

class NewThread implements Runnable {
	String threadName;

	Thread thread;

	NewThread(String threadName) {
		this.threadName = threadName;
		thread = new Thread(this, this.threadName);
		System.out.println("New thread: " + thread);
		thread.start();
	}

	@Override
	public void run() {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			System.out.println(this.threadName + " interrupted.");
		}
		System.out.println(this.threadName + " exiting.");

	}

}

public class JoinTest {
	public static void main(String args[]) {
		NewThread ob1 = new NewThread("One");
		NewThread ob2 = new NewThread("Two");
		NewThread ob3 = new NewThread("Three");

		try {
			System.out.println("Waiting for threads to finish.");
			ob1.thread.join();
			ob2.thread.join();
			ob3.thread.join();
		} catch (InterruptedException e) {
			System.out.println("Main thread Interrupted");
		}
		System.out.println("Main thread exiting.");

	}
}
