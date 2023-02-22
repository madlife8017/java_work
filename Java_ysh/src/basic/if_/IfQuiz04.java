package basic.if_;

import java.util.Scanner;

public class IfQuiz04 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int max, mid, min;

		System.out.print("첫번째 정수를 입력해주세요 : ");
		int a = sc.nextInt();
		System.out.print("두번째 정수를 입력해주세요 : ");
		int b = sc.nextInt();
		System.out.print("세번째 정수를 입력해주세요 : ");
		int c = sc.nextInt();
		System.out.println("==========================");


		if (a>b && a>c) {
			max = a;
			if(b > c) {
				mid = b;
				min = c;
			} else {
				mid = c; 
				min = b;
			}			
		}

		else if (b>a && b>c) {
			max = b;
			if(a > c) {
				mid = a;
				min = c;
			} else {
				mid = c;
				min = a;
			}			
		}

		else {
			max = c;
			if(b > a) {
				mid = b;
				min = a;
			} else  {
				mid = a;
				min = b;
			}			
		}
		
		System.out.println("max : " +max);
		System.out.println("mid : " +mid);
		System.out.println("min : " +min);
		System.out.println("==========================");
		sc.close();
	}
}
