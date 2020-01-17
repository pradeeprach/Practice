package com.practice.solid.ocp;

import java.util.List;

public class Demo {

	public static void main(String[] args) {
		Product p1 = new Product("Apple", Color.RED, Size.MEDIUM);
		Product p2 = new Product("Bottle", Color.BLUE, Size.LARGE);
		Product p3 = new Product("Leaf", Color.GREEN, Size.SMALL);
		
		List<Product> products = List.of(p1, p2, p3);
		ProductFilter pf = new ProductFilter();
		System.out.println("Old Way:");
		pf.filterByColor(products, Color.RED).forEach(p -> System.out.println(p.name + " is RED"));
		
		BetterFilter filter = new BetterFilter();
		ColorSpecification cs = new ColorSpecification(Color.GREEN);
		SizeSpecification ss = new SizeSpecification(Size.SMALL);
		System.out.println("New Way:");
		filter.filter(products, cs).forEach(p -> System.out.println(p.name + " is Green"));
		
		AndSpecification<Product> as = new AndSpecification<>(cs, ss);
		filter.filter(products, as).forEach(p -> System.out.println(p.name + " is Small and Green"));
	}

}
