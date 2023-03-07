package oop.obj_arr;

import java.util.Scanner;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class ArrayInsert {

	public static void main(String[] args) {
		/*
        - 스캐너를 이용하여 Person객체를 생성하는 데 필요한
         정보를 입력받으시면 되겠습니다.
         입력받은 정보를 토대로 Person객체를 생성한 후
         여러 개의 Person 객체를 배열에다 담아 둘 생각입니다.

        - 배열의 크기는 3개로 하겠습니다. 반복문을 이용하여
         입력을 반복해서 받아주시면 됩니다.

        - 입력이 끝나면 배열 안에 있는 모든 주소값을 순회하여
         각 객체의 personInfo()를 호출해 보세요. 
        */
		
		Scanner sc = new Scanner(System.in);
		Person[] people = new Person[3];
		
		for(int i =0;i<people.length;i++) {
			
			System.out.printf("%d번째 사람 이름을 입력해주세요 : ",i+1);
			String inName = sc.next();
			System.out.printf("%d번째 사람 나이를 입력해주세요 : ",i+1);
			int inAge = sc.nextInt();
			System.out.printf("%d번째 사람 성별을 입력해주세요 : ",i+1);
			String inGender = sc.next();
			
			people[i] = new Person(inName,inAge,inGender);
			System.out.printf("***%d번째 사람 정보 입력완료***\n\n",i+1);
			
			
			if(i==people.length-1) {
				System.out.println("\n==============");
				for(int j=0;j<people.length;j++) {
					people[j].personInfo();
				}
			}
					
		}
		System.out.println("==============");
		sc.close();
	}
}
