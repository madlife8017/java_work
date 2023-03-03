package oop.constructor;

public class BreadMain {

	public static void main(String[] args) {
		
		/*
		 -클래그 bread
		 -똑같이 피자빵, 초코케이크 정보를 호출 생성자는 마음대로
		 */
		
		Bread pizza = new Bread("피자빵",1000,"치즈");
		pizza.show();
		Bread choco = new Bread("초코빵",1500,"초코");
		choco.show();
		

	}

}
