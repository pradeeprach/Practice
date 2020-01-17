package com.practice.solid.lsp;

public class Square extends Rectangle {
	
	public Square() {}
	
	public Square(int side) {
		this.width = this.height = side;
	}
	
	/** Violated LSP Here
	public void setHeight(int height) {
		this.width = this.height = height;
	}
	
	public void setWidth(int width) {
		this.width = this.height = width;
	}*/
}
