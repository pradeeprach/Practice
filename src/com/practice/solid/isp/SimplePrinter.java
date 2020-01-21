package com.practice.solid.isp;

public class SimplePrinter implements MultiPurposePrinter{
	@Override
	public void print() {
		System.out.println("Printing a document");
	}
	
	@Override //This Method is not required for simple printer
	public void scan() {
		System.out.println("Scanning a document");
	}
	
	@Override //This Method is not required for simple printer
	public void fax() {
		System.out.println("Sending a Fax");
	}
}
