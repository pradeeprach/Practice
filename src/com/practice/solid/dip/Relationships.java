package com.practice.solid.dip;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.javatuples.Triplet;

public class Relationships implements RelationshipBrowser {
	private List<Triplet<Person, Relationship, Person>> relationships = new ArrayList<>();
	
	public void addParentAndChild(Person parent, Person child) {
		relationships.add(new Triplet<Person, Relationship, Person>(parent, Relationship.CHILD, child));
		relationships.add(new Triplet<Person, Relationship, Person>(child, Relationship.PARENT, parent));
	}

	public List<Triplet<Person, Relationship, Person>> getRelationships() {
		return relationships;
	}
	
	@Override
	public List<Person> findAllChildrenOf(String name) {
		return relationships.stream()
					.filter(p -> p.getValue0().name.equals("John") && p.getValue1().equals(Relationship.CHILD))
					.map(Triplet::getValue2)
					.collect(Collectors.toList());
	}
}
