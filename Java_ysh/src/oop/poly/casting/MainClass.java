package oop.poly.casting;

public class MainClass {

	public static void main(String[] args) {
		
		Parent p = new Parent();
		p.n1 = 1;
		//p.n2 = 2;
		
		p.method1();
		p.method2();
		//p.method3();
		
		System.out.println("---------------------------------------------");
		
		Child c =new Child();
		c.n1 = 1;
		c.n2 = 2;
		
		c.method1();
		c.method2();
		c.method3();
		
		
		System.out.println("---------------------------------------------");
		
		//다형성 적용 (promotion)
		Parent p2 = new Child (); //다형성 발생
		
		/*
		 - 다형성이 적용되면 자식 클래스의 
		 본래의 멤버(필드, 메서드)를 참조하지 못하는 문제가 발생합니다.
		 - 이를 해결하기 위해 강제 타입변환해야한다.		 
		 */
		
		Child c2 = (Child)p2; //부모 타빙을 자식 타입으로 강제 변환(Downcasting)
		c2.n2 = 2;
		c2.method3();
		
		System.out.println("p2 주소값"+p2);
		System.out.println("c2 주소값"+c2);
		
		 //다형성이 한번도 발생하지 않은 경우에는 강제 형변환을 사용 xxxx
		
		Parent ppp = new Parent();
		//Child c3 = (Child)ppp;
		
		
		
		
		
		
	}
}
