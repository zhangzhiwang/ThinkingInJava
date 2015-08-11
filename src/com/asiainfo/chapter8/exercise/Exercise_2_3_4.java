package com.asiainfo.chapter8.exercise;

/**
 * p153Á·Ï°2¡¢3¡¢4
 * 
 * @author zhangzw8@asiainfo.com\n 2015Äê8ÔÂ10ÈÕ
 */
public class Exercise_2_3_4 {
	public static void main(String[] args) {
		Shape s1 = new Circle();
		s1.draw();
		s1.color();
		s1.area();
		System.out.println("--------------");

		Shape s2 = new Square();
		s2.draw();
		s2.erase();
		s2.color();
		s2.area();
		System.out.println("---------------");

		Shape s3 = new Cylinder();
		s3.draw();
		s3.erase();
	}
}

class Shape {
	public void draw() {
	}

	public void erase() {
	}

	public void color() {
		System.out.println("Shape.color");
	}

	public void area() {
		System.out.println("Shape.area");
	}
}

class Circle extends Shape {
	@Override
	public void draw() {
		System.out.println("Circle.draw");
	}

	@Override
	public void erase() {
		System.out.println("Circle.erase");
	}

	@Override
	public void area() {
		System.out.println("Circle.area");
	}
}

class Square extends Shape {
	@Override
	public void draw() {
		System.out.println("Square.draw");
	}

	@Override
	public void erase() {
		System.out.println("Square.erase");
	}
}

class Cylinder extends Shape {
	@Override
	public void draw() {
		System.out.println("Cylinder.draw");
	}

	@Override
	public void erase() {
		System.out.println("Cylinder.erase");
	}
}