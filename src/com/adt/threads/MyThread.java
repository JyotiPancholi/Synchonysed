package com.adt.threads;

import com.adt.resources.Printer;

public class MyThread extends Thread {
	private Printer printer;
	public MyThread(Printer printer) {
		this.printer=printer;
	}
	@Override
	public void run() {
		printer.print();
		
	}
}
