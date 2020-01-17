package com.practice.solid.lsp;

public class Rectangle {
	protected int width;
	protected int height;
	
	public Rectangle() {
		
	}
	
	public Rectangle(int width, int height) {
		this.width = width;
		this.height = height;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public void setHeight(int height) {
		this.height = height;
	}
	
	@Override
	public String toString() {
		return "Width: " + width + "\n Height: " + height;
	}
	
	public int getArea() {
		return width * height;
	}
}
