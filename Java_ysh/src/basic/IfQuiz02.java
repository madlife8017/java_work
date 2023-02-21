package basic;

import java.util.Scanner;

public class IfQuiz02 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫번째 정수를 입력해주세요 : ");
		int a = sc.nextInt();
		
		System.out.print("두번째 정수를 입력해주세요 : ");
		int b = sc.nextInt();
		
		System.out.println("========================");
		
		if(a>b) {
			
			System.out.printf("입력받은 수 : %d, %d -> %d이 큰 수 입니다.",a,b,a);
			System.out.println();
			
		} else if(a<b) {
			
			System.out.printf("입력받은 수 : %d, %d -> %d이 큰 수 입니다.",a,b,b);
			System.out.println();
			
		} else if(a==b) {
			
			System.out.printf("입력받은 수 : %d, %d -> 같은 수 입니다.",a,b);
			System.out.println();
		}
	
		System.out.println("========================");
		sc.close();
		
	}
}
