package basic.begin;

public class VariableExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 # 변수 (Variable)
		 1. 변수는 데이터가 저장되는 공간에 이름을 붙여놓은 것 입니다.
		 2. 변수는 생성할 때 변수에 저장되는 데이터의 크기와 모양에 따라
		 적당한 데이터 타입을 선언해야한다.
		 
		 ex) int : 4바이트 정수, String : 문자열(문장)
		 
		 3. 변수는 동일한 이름으로 중복 선언할 수 없습니다.
		 4. 변수 내부의 갑ㅇㅅ은 언제든지 변경이 가능합니다.
		 
		 변수의 선언 : [자료형(데이터타입)] [변수명];
		 
		 
		 
		 */
		
		int age;
		
		age =40;
		
		System.out.println(age);
		
		int score = 95;
		int myScore = score - 20;
		
		System.out.println(myScore);
		
		
		String name = "홍길동";
		
		System.out.println(name);
		
		// 선언 및 초기화하지 않은 변수는 사용이 불가능합니다.
		
		//int result = myScore + num;
		

	}

}
