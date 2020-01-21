package com.practice.solid.isp;

public class PhotoCopier implements Printer, Scanner {
	@Override
	public void print() {
		System.out.println("Printing a document");		
	}
	
	@Override
	public void scan() {
		System.out.println("Scanning a document");		
	}
}
