package basic.loop;

import java.util.Scanner;

public class WhileQuiz02 {
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("값을 입력해 주세요 : ");
		int a = sc.nextInt();
		int i = 1, sum = 0;
		while(a>=i) {
			
			if(a%i==0) {
				sum = sum + i;
			}
			i++;
		}
		System.out.printf("입력값 약수의 총합 : %d",sum);
	}
}
