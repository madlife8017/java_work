package basic.begin;

import java.util.Scanner;

public class ScannerQuiz {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		System.out.print("이름 :");
		String name = sc.nextLine();
		
		System.out.print("만 나이 :");
		int age = sc.nextInt();
		
		System.out.println("======================");
		System.out.printf("이름 : %s\n",name);
		System.out.printf("나이 : 만 %d세\n",age);
		
		int year = 2023-age;
				
		System.out.println("출생연도 : " + year +"년");
		System.out.printf("======================");
		sc.close();
	}
}
