package basic.loop;

import java.util.Scanner;

public class WhileExample3 {

	public static void main(String[] args) {
		/*
		  소수 판별
		  */
		
		Scanner sc = new Scanner(System.in);
		System.out.print("값을 입력해주세요 : ");
		int a = sc.nextInt();
		int i = 2, n=0;
		while(a>i) {
			if(a%i==0) {
			n++;
			}
			i++;
		}
		if (a==1 || a==0) 
		{ 
			System.out.println("소수가 아닙니다.");
		} else if (n==0){
			System.out.println("소수입니다.");
		} else {
			System.out.println("소수가 아닙니다.");
		}
		
		System.out.println("======================");
		
		int j=2;
		while(a%j!=0) {j++;}
		System.out.println(a==j ? "소수입니다." : "소수가 아닙니다.");		
	}
}
