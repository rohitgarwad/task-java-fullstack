package com.task;


class Table {
	synchronized void printTable (int n) {
		for(int i=1; i<=5; i++) {
			System.out.println(n*i);
		}
	}
}

class MyThread1 extends Thread {
	Table t;
	MyThread1(Table t) {
		this.t = t;
	}
	public void run() {
		t.printTable(5);
	}
}

class MyThread2 extends Thread {
	Table t;
	MyThread2(Table t) {
		this.t = t;
	}
	public void run() {
		t.printTable(6);
	}
}

public class ThreadEx {
	public static void main(String[] args) {
		Table t = new Table();
//		new MyThread1(t).start();
//		new MyThread2(t).start();
		MyThread1 m1 = new MyThread1(t);
		MyThread2 m2 = new MyThread2(t);
		m1.start();
		m2.start();
		
	}
}
