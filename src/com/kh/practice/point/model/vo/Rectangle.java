package com.kh.practice.point.model.vo;

public class Rectangle extends Point {
	private int width;
	private int height;
	
	public Rectangle() {}
	public Rectangle(int x, int y, int width, int height) {
		super.setX(x);
		super.setY(y);
		this.width = width;
		this.height = height;
	}
}
