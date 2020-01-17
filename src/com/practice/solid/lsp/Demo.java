package com.practice.solid.lsp;

public class Demo {

	public static void main(String[] args) {
		Rectangle rectangle = new Rectangle(10, 20);
		System.out.println("Area of Rectangle: " + rectangle.getArea());
		
		Rectangle square = new Square(10);
		System.out.println("Area of Square:" + square.getArea());
		
		square.setHeight(15);
		System.out.println("Area of Rectangle:" + square.getArea());
	}
}
