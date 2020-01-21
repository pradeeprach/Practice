package com.practice.solid.isp;

public class MultiFunctionDevice implements Printer, Scanner, FaxMachine {
	@Override
	public void print() {
		System.out.println("Printing a document");
	}
	
	@Override
	public void scan() {
		System.out.println("Scanning a document");
	}
	
	@Override
	public void fax() {
		System.out.println("Sending a Fax");
	}
}
