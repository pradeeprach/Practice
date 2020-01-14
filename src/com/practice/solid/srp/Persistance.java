package com.practice.solid.srp;

import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.net.URL;

public class Persistance {
	
	public void save(Journal journal, String filename, boolean override) throws FileNotFoundException {
		try (PrintStream ps = new PrintStream(filename)) {
			ps.print(journal);
		}
	}
	
	public void load(String filename) {
		
	}
	
	public void load(URL url) {
		
	}
}
