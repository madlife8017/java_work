package oop.string;

import java.util.Scanner;

public class StringQuiz02 {

	public static void main(String[] args) {
		/*
		 1. 주민등록번호 13자리를 입력받습니다
		 2. 주민등록번호는 -를 포함해서 받을 예정입니다.
		 3. 13자리가 아니라면 다시 입력받습니다.
		 4. 남자인지 여자인지를 구분해서 출력
		 */
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.print("주민등록 번호를 입력해주세요 : ");
			String n = sc.next();
			if(n.length()!=14) {
				System.out.println("다시 입력해주세요");
			}else{
				char a=n.charAt(7);
				if(a=='1'||a=='3') {
					System.out.println("남성입니다.");break;
				}else if(a=='2'||a=='4') {
					System.out.println("여성입니다.");break;
				}else {
					System.out.println("잘못입력하셨습니다.");break;
				}
			}
		}
		sc.close();
	}
}
