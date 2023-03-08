package oop.static_.calc;

public class Calculator {
	
	
	/*
	 - static 공용으로 쓰기 적합
	 - 계산기 마다 색깔이 각각 다를 숭 ㅣㅆ기 때문에 color같은 변수는 데이터 공유안한다, 객체별로 따로따로 관리 ㄱㄱㄱ
	 - 반면에 pi같은 원주율값은 계산기마다 값이 동일해야하기 때문에 공유 ㄱㄱㄱ static으로 
	 */
	String color;
	static double pi = 3.141592; 
	
	/*
	 - 메서드 내부에서 non-static 데이터를 참조하고 있는 메서드는
	 해당변수의 정환한 위치(객체의 주소값)ㅇㄹ 알려줘야하기때문에
	 정적 메서드로 선언하기가 부적합합니다. 
	 */
	
	public void paint(String color) {
		System.out.println("계산기에" +color+"색을 칠합니다.");
		this.color = color;
	}
	/*
	 - 메서드 내부에서 인스턴스 변수를 사용하지 않고 범용성 있게 사용하는 메서드는
	 static이 좋다
	 */
	public double areaCircle(int r) {
		return r *r*pi;
	}
}
