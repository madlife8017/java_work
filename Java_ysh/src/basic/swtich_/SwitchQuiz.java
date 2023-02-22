package basic.swtich_;

import java.util.Scanner;

public class SwitchQuiz {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("첫번째 정수를 입력해주세요 : ");
		int a = sc.nextInt();

		System.out.print("연산자를 입력해주세요 [+,-,*,/]: ");
		String b = sc.next();

		System.out.print("두번째 정수를 입력해주세요 : ");
		int c = sc.nextInt();


		System.out.println("========================");

		/*
		switch (b) {

		case "+" :
			System.out.printf("Result : %d\n",a+c);
			break;

		case "-" :
			System.out.printf("Result : %d\n",a-c);
			break;

		case "*" :
			System.out.printf("Result : %d\n",a*c);
			break;

		case "/" :
			if(c==0) {
				 System.out.println("연산할 수 없는 입력값입니다.");
				 break;
			}
			double result;
			result = (double) a / c;
			System.out.printf("Result :%.2f\n",result);
			break;

		default :
			System.out.println("올바른 사칙연산자를 입력하세요 [+,-,*,/]");
		}
		
		*/
		 
		int result=0;
		boolean flag = false;
		
		switch (b) {

		case "+" :
			result = a+c;
			break;

		case "-" :
			result = a-c;
			break;

		case "*" :
			result = a*c;
			break;

		case "/" :
			if(c==0) {				
				System.out.println("연산할 수 없는 입력값입니다.");
				flag = true;
				break;
			}
			result = a / c;
			
			break;

		default :
			System.out.println("올바른 사칙연산자를 입력하세요 [+,-,*,/]");
			flag = true;			
		}
		
		if(!flag) {			
			 	System.out.printf("Result : "+ result);
				System.out.println();			
		}
		System.out.println("========================");
		sc.close();			 
	}
}
