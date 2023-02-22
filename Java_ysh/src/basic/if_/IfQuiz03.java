package basic.if_;

import java.util.Scanner;

public class IfQuiz03 {
	
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력해주세요 : ");
		int a = sc.nextInt();
		System.out.println("========================");
		
		if (a==0) {
			System.out.println("0입니다.");			
		} else if (a%7==0) {
			System.out.println("7의 배수입니다.");
		} else {
			System.out.println("7의 배수가 아닙니다.");
		}
		
		System.out.println("========================");		
		sc.close();		
	}
}
