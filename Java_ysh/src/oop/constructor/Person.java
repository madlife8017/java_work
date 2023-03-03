package oop.constructor;

public class Person {
	String name;
	int age;
	int t;
	Person(){}
	Person(String n,int a, int t2){
		name = n;
		age = a;
		t = t2;
	}
	void info() {
		System.out.printf("이름 : %s / 나이 : %d세 / 키 : %dcm",name,age,t);
	}
}
	