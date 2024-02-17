package com.java.practice;

public class StaticInterafce {

	public static void main(String[] args) {
		
		Rectangle rect = new Rectangle();
		rect.draw();
		System.out.println("cube of a Rectangle: "+Drawable.cube(4));
		
	}

}

interface Drawable {
	
	void draw();
	
	static int cube(int x)
	{
		return x*x*x;
	}
}


class Rectangle implements Drawable{

	@Override
	public void draw() {
		System.out.println("Drawing a Rectangle");
		
	}
	
}