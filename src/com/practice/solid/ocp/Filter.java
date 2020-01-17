package com.practice.solid.ocp;

import java.util.List;
import java.util.stream.Stream;

public interface Filter<T> {
	public Stream<T> filter(List<T> items, Specification<T> specification);
}
