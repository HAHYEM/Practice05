package com.javaex.problem04;

public class Rectangle extends Shape implements Resizeable {

	private double width;
	private double height;
	
	public Rectangle(int width, int height) {
		this.width = width;
		this.height = height;
	}

	public double getArea() {
		return width * height;
	}

	public double getPerimeter() {
		double result = width + width + height + height;
		return result;
	}

	@Override
	public void resize(double s) {
		width = width * s;
		height = height * s;
		
	}
	
}
