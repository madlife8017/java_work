package oop.static_.singleton;

public class MainClass {

	public static void main(String[] args) {
		
//		Singleton s1 = Singleton.s;
//		s1.method1();
//		s1.method2();
		
		Singleton s1 = Singleton.getInstance();
		s1.method1();
		s1.method2();
	}
}
