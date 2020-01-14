package com.practice.solid.srp;

import java.util.ArrayList;
import java.util.List;

public class Journal {
	private final List<String> entries;
	private int counter;
	
	public Journal() {
		entries = new ArrayList<>();
		counter = 0;
	}
	
	public void add(String entry) {
		entries.add((++counter) + " : " + entry);
	}
	
	public void remove(int index) {
		entries.remove(index);
	}
	
	@Override
	public String toString() {
		return String.join(System.lineSeparator(), entries);
	}
}
