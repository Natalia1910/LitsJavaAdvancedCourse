package com.homeworkOne;

public class Main {
	public static void main(String[] args) {
	    TickTock tt = new TickTock();
	    MyThread myThread1 = new MyThread("Tick", tt);
	    MyThread myThread2 = new MyThread("Tock", tt);

	    myThread1.run();
	    myThread2.run();

	}
}

