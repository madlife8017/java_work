package oop.abs.quiz;

public class Rect extends Shape {

	int l;
	
	public Rect(String name,int l) {
		super(name);
		this.l= l;
	}
	
	@Override
	public double getArea() {
		
		return l*l;
	}
	
	
}

