package com.kh.practice.point.controller;

import com.kh.practice.point.model.vo.Rectangle;

public class RectangleController {
	Rectangle r = new Rectangle();
	
	public String calcArea(int x, int y, int height, int width) {
		return "" + width * height;
	}
	
	public String calcPerimeter(int x, int y, int height, int width) {
		return "" + 2 * (width + height);
	}
}
