package com.practice.solid.ocp;

public interface Specification<T> {
	public boolean isSatisfied(T item);
}
