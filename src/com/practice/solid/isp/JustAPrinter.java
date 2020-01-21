package com.practice.solid.isp;

public class JustAPrinter implements Printer {
	@Override
	public void print() {
		System.out.println("Printing a document");		
	}
}
