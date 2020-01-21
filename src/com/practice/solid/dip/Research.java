package com.practice.solid.dip;

import java.util.List;

public class Research {
	public Research(RelationshipBrowser relationshipBrowser) {
		List<Person> research = relationshipBrowser.findAllChildrenOf("John");
		research.forEach(p -> System.out.println("John has child called " + p.name));
	}
}
