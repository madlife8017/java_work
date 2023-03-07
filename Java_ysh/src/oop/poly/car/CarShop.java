package oop.poly.car;

public class CarShop {
	/*
	 - 키워드 instanceof 는 객체가 지정한 클래스타입을 가질 수 있는
	 객체인지를 검사할때 사용하는 연산자
	 - instanceof를 기준으로 좌항의 객체가 우항의 클래스 타입을 가질수 있는지를 물어봐서
	 그렇다면 true, 그렇지 않다면 false 를 도출합니다. 좌 가 우타입을 가질수있냐
	 
	 */
	
	public void carPrice(Car c) {
		
		if(c instanceof Sonata) {
			System.out.println("소나타의 가격은 3천만원입니다.");
		} else if(c instanceof Tesla) {
			System.out.println("테슬라의 가격은 7천만원입니다.");
		} else if(c instanceof Porsche) {
			System.out.println("포르쉐의 가격은 2억4천만원입니다.");
		}
	}
}
