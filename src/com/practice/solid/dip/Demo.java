package com.practice.solid.dip;

public class Demo {
	public static void main(String[] args) {
		Person parent = new Person("John");
		Person child1 = new Person("Alice");
		Person child2 = new Person("KB");
		
		Relationships relationships = new Relationships();
		relationships.addParentAndChild(parent, child1);
		relationships.addParentAndChild(parent, child2);
		
		Research research = new Research(relationships);
	}
}
