package com.adt.test;

import com.adt.resources.Printer;
import com.adt.threads.MyThread;

public class Test {
	public static void main(String[] args) {
		Printer printer=new Printer();
		MyThread t1=new MyThread(printer);
		MyThread t2=new MyThread(printer);
		MyThread t3=new MyThread(printer);
		t1.start();
		t2.start();
		t3.start();
	}
}
