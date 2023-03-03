package oop.constructor;

import java.util.Scanner;

public class PersonMain {

	public static void main(String[] args) {
		
		/*
		이름 ,나이, 키를 입력받아서
		해당 정보 저장하는 객체를 디자인 해보세요.
		
		객체 내에는 해당 사람의 정보를 모두 출력해주는 info()메서드가 존재합니다. 
		 */
		Scanner sc = new Scanner(System.in);
		System.out.print("이름을 입력해주세요 : ");
		String name = sc.next();
		System.out.print("나이를 입력해주세요 : ");
		int age = sc.nextInt();
		System.out.print("키를을 입력해주세요 : ");
		int h = sc.nextInt();
		
		Person n1 = new Person(name,age,h);
		n1.info();
		sc.close();
		
	}
}
