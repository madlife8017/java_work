package basic.loop;

import java.util.Scanner;

public class WhileQuiz01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("구구단을 입력하세요 : ");
		int a = sc.nextInt();
		System.out.printf("\n*** 구구단 %d 단 ***\n\n",a);
		int i = 1;
		while(9>=i) {
			System.out.printf("%d X %d = %d\n",a,i,a*i);
			i++;			
		}	
		sc.close();
	}
}
