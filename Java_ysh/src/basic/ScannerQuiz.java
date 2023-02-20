package basic;

import java.util.Scanner;

public class ScannerQuiz {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		System.out.print("이름 :");
		String name = sc.nextLine();
		
		System.out.print("나이 :");
		int age = sc.nextInt();
		
		System.out.printf("이름 : %s\n",name);
		System.out.printf("나이 : %d세\n",age);
		
		int year = 2023-age+1;
				
		System.out.println("출생연도 : " + year +"년");
		sc.close();
		System.out.println("d");
		
		
		
	}
}
