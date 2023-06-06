package com.adt.resources;

public class Printer {
	public synchronized void print() {
		System.out.println("Printing");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Printing Completed");
		synchronized(this) {
			
		}
	}

}
