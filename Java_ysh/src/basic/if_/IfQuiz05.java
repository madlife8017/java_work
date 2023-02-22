package basic.if_;

import java.util.Scanner;

public class IfQuiz05 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("국어 점수를 입력하세요 : ");
		int kor = sc.nextInt();
		System.out.print("영어 점수를 입력하세요 : ");
		int eng = sc.nextInt();
		System.out.print("수학 점수를 입력하세요 : ");
		int mat = sc.nextInt();
		System.out.println("=============================");
		
		double a = (double)(kor+eng+mat)/3;
		System.out.printf("평균 점수 : %.1f\n",a);
		
		String g ;
		
		if (a >= 95 ) {
			g = "A+";
		} else if(94>=a && a>=90) {
			g = "A0";
		} else if(89>=a && a>=80) {
			g = "B";
		} else if(79>=a && a>=70) {
			g = "C";
		} else if(69>=a && a>=60) {
			g = "D";
		} else {
			g = "F";
		}
				
		System.out.println("당신의 학점은 " + g + " 입니다.");
		System.out.println("=============================");
		sc.close();
	}
}
