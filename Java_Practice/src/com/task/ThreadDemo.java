package com.task;

public class ThreadDemo extends Thread {

	
	public void run () {
		for (int i = 0; i <= 10; i++) {
			System.out.println("i value is = "+i);
			try {
				Thread.sleep(2000);
			} catch (Exception e) {
				System.out.println(e);
			}
		}
		for (int k = 0; k <= 10; k++) {
			System.out.println("k value is = "+k);
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				System.out.println(e);
			}
		}
	}
	
	public static void main(String[] args) {
		ThreadDemo d = new ThreadDemo();
//		d.run();//sync
		d.start();//async
		for (int j = 0; j <= 10; j++) {
			System.out.println("j value is = "+j);
			try {
				Thread.sleep(3000);
			} catch (Exception e) {
				System.out.println(e);
			}
		}

		
	}

}
