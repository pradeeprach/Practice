package com.practice.solid.ocp;

public class AndSpecification<T> implements Specification<T>  {
	
	private Specification<T> s1, s2;
	
	public AndSpecification(Specification<T> s1, Specification<T> s2) {
		this.s1 = s1;
		this.s2 = s2;
	}
	
	@Override
	public boolean isSatisfied(T item) {
		return s1.isSatisfied(item) && s2.isSatisfied(item);
	}
}
