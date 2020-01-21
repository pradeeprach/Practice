package com.practice.solid.dip;

import java.util.List;

public interface RelationshipBrowser {
	public List<Person> findAllChildrenOf(String name);
}
