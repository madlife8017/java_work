package oop.constructor;

public class Bread {

	int price;
	String name, ing;
	
	Bread(){}//내용없어도 기본생성자는 만들어두는게 좋다

	Bread(String n,int p, String i){
		name = n;
		price = p;
		ing = i;
	}
	void show() {
		System.out.println("================");		
		System.out.println("빵 이름 : "+name);
		System.out.println("빵 가격 : "+price);
		System.out.println("주 재료 : "+ing);
		System.out.println("================");
		System.out.println();
	}
}
