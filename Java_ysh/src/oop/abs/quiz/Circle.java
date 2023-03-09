package oop.abs.quiz;

public class Circle extends Shape {
	
	private int rad;
	
	public Circle(String name,int rad) {
		super(name);//super(); 기본셋팅 // 지금은 부모객체에 기본생성자가 없음...
		this.rad= rad;
	}
	
	@Override
	public double getArea() {
		
		return rad*rad*Math.PI;
	}
	
	
}
