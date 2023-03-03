package oop.constructor;

public class PhoneMain {

	public static void main(String[] args) {
		
	
		Phone basic = new Phone(); // 객체호출문 == 생성자호출문
		basic.showSpec();
		
		Phone galaxy23 = new Phone("갤럭시");
		galaxy23.showSpec();
		
		Phone iPhone14 = new Phone ("아이폰 14","화이트");
		iPhone14.showSpec();
	}

}
