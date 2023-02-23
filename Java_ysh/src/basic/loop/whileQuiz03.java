package basic.loop;

import java.util.Scanner;

public class whileQuiz03 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("첫번째 정수를 입력하세요 : ");
		int x = sc.nextInt();
		System.out.print("두번째 정수를 입력하세요 : ");
		int y = sc.nextInt();
		int i = 0, j = 0, sum = 0, n = 0;
		
		if(x>y) {
			n = y;
			i = y;
			j = x;
			
		} else {
			n = x;
			i = x;
			j = y;						
		}
		
		while(j>=i) {
				sum += i;
				i++;			
		}	
		
		System.out.printf("%d부터 %d까지의 누적합계 : %d",n,j,sum);
	}
}
