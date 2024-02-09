package com.task;

public class RunnableDemo implements Runnable {
	
	public void run() {
		for (int j = 0; j < 2; j++) {
			System.out.println("j value is = " +j);
		}
		Thread.currentThread().setPriority(Thread.MAX_PRIORITY);
		System.out.println("This is child Thread Priority - " +Thread.currentThread().getPriority());
		if (Thread.currentThread().getName().equals("Thread-0")) {
			Thread.currentThread().setName("Child-0");
		} else if (Thread.currentThread().getName().equals("Thread-1")) {
			Thread.currentThread().setName("Child-1");
		}
		System.out.println("Child Thread Name - " +Thread.currentThread().getName());
	}
	
	public static void main(String[] args) {
		RunnableDemo r = new RunnableDemo();
		Thread t1 = new Thread(r);
		Thread t2 = new Thread(r);
		t1.start();
		t2.start();
		Thread.currentThread().setPriority(Thread.MIN_PRIORITY);
		for (int i = 0; i < 2; i++) {
			System.out.println("i value is = " +i);
		}
		System.out.println("This is main Thread Priority - " +Thread.currentThread().getPriority());
		System.out.println("Main Thread Name - " +Thread.currentThread().getName());

	}

}
