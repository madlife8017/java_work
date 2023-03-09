package oop.abs.quiz;

public class Rect extends Shape {
	
	private int leng;	
	public Rect(String name,int leng) {
		super(name);
		this.leng = leng;
	}

	@Override
	public double getArea() {
		return leng*leng;
	}

}
