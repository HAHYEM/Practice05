package com.javaex.problem04;

public class RectTriangle extends Shape  {

	private double width;
	private double height;
	
	public RectTriangle(double width, double hieght) {
		this.width = width;
		this.height = hieght;
	}
	
	public double getArea() {
		return width * height * 0.5;
	}
	
	public double getPerimeter() {
		return width + height + Math.sqrt(height * height + width * width);
	}
	
	
}
