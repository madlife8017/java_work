package oop.static_.method;


public class Count {
	
	public int a;
	public static int b;
	
	
	/* 
	 인스턴스 메서드 : 객체를 생성하여 주ㅅ값을 통해 접근한 후 호출하는 메서드
	 인스턴스 메서드 안에서는 정적(static)변수와 인스턴ㅅ 변수 모두를 참조할 수 있습니다.
	 
	 
	 */
	public int method1() {
		
		return this.a + Count.b;
		
	}
	/*
	 -static블록(메서드, 정적 초기화자) 내부에서는
	 static이 붙은 변수나 메서드만 사용할 수 있습니다.
	 this는 사용할 수 없습니다. -> 나타낼 주소가 없음 -> 객체생성없이도 호출됨
	 
	 -static브록 내부에서 non-static멤버를 사용하려면
	 객체생성하고 주소값을 통해 참조해야합니다.
	 */
	
	public static int method2() { //어짜피 static 공간에 따로 저장된거니 객체 주소값이 없다.
		
		Count ccc = new Count();
		return ccc.a + Count.b;
		/* static은 객체생성을 안함, 그래서 주소값을 받는 this가 가져올 주소값이 없다.
		 
		 	객체생성 따로 안하려면 static / 객체랑무관함
		 	그래서 어디서든 주소값없이 부를수잇음
		 	
		 */
		
	}
	

}
