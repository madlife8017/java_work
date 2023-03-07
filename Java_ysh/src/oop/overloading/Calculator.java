package oop.overloading;

public class Calculator {

	/*
	 # 오버로딩 (중복) 하나의 클래스 내부에서 같은 이름을 가진 메서드나
	 생성자를 여러개 중복해서 선언할 수있게 해주는 문법.

	 -오버로딩 적용조건
	 1. 매개 변수의 데이터타입이 다를것 or
	 2. 매개 변수의 전달 순서가 다를석 or
	 3. 매개 변수의개수가 다를것.
	 */
	int calRectArea(int a) {
		return a*a;
	}
	int calRectArea(int a, int b) {
		return a*b;
	}

	double calRectArea(int a,int b, int c) {
		return (a+b)*c/2.0;
	}

	/*
	 *  
	 *int inputData(int number) {
		return
	}
	int inputData (int number){
	return 0; 
	}
	반환 유형은 오버로딩에 영향을 및지 못합니다. 
	 */


}
