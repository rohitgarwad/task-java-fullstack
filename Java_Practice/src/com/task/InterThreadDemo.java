package com.task;


class ThreadB extends Thread {
	int total = 0;
	synchronized public void run() {
		for (int i=1; i<=100; i++) {
			total = total+i;
		}
		this.notify();
	}
}

public class InterThreadDemo {
	public static void main(String[] args) throws InterruptedException {
		ThreadB t = new ThreadB();
		t.start();
		synchronized(t) { t.wait(); }
		System.out.println("Total value is "+t.total);
	}
}
