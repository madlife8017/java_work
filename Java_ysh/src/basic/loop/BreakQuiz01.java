package basic.loop;

import java.util.Scanner;

public class BreakQuiz01 {

	public static void main(String[] args) {

	
		System.out.println("*** 연산퀴즈 ****");
		System.out.println("# 종료하시려면 0을 입력해주세요. ");
		System.out.println("=============");
		Scanner sc = new Scanner(System.in);
		
		int c1=0,c2=0;

		while(true) {
			int a = (int)(Math.random()*100+1);
			int b = (int)(Math.random()*100+1);
			int s = (int)(Math.random()*2+1);
			int r = 0;
			System.out.printf("%d",a);
			if(s==1) {
				System.out.print("+");
				r = a+b;
			}
			else{
				System.out.print("-");
				r = a-b;
			}

			System.out.printf("%d = ???\n",b);
			System.out.print(">");
			int answer = sc.nextInt();
			if(answer==0) {
				System.out.println("종료합니다.");
				System.out.println("=============");
				System.out.printf("정답 횟수 : %d\n",c1);
				System.out.printf("오답 횟수 : %d\n",c2);
				break;
			}else if(answer==r) {
				System.out.println("정답입니다.");
				c1++;
			} else {
				System.out.println("오답입니다.");
				c2++;
			}
		}
		sc.close();

	}

}
