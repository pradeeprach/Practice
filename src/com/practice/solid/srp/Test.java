package com.practice.solid.srp;

import java.io.IOException;

public class Test {

	public static void main(String[] args) throws IOException {
		Journal journal = new Journal();
		journal.add("I am Pradeep");
		journal.add("I am writing code");
		
		System.out.println(journal);
		
		Persistance persistance = new Persistance();
		persistance.save(journal, "D:\\output.txt", true);
		Runtime.getRuntime().exec("notepad.exe D:\\output.txt");
	}

}
