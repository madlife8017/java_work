package oop.string;

import java.util.Scanner;

public class StringQuiz01 {

	public static void main(String[] args) {
		/*
		 1. 스캐너를 통해 id 입력받습니다.
		 2. 말썽꾸러기 사용자는 id에 공백을 입력할 확률이 굉장히 높다
		 3. 공백을 제거한 아이디가 5글자 미만이라면 다시 입력 받으세요.
		 4. 5글자 이상 입력되었다면 "id가 등록되었습니다."출력후 종료하세요.
		 */
		
		Scanner sc = new Scanner(System.in);
		String id;
		while(true){
						
			System.out.print("생성할 아이디를 입력해주세요 : ");
			id = sc.nextLine();
			
			String a = id.replace(" ","");
			String b = a.trim();
			int length = b.length();
			System.out.println("입력된 아이디 :" +b);
			System.out.println("아이디길이 : "+length);
			if(length>=5) {
				System.out.println("id가 등록되었습니다.");
				break;
			} else System.out.println("다시입력해주세요");
		}
	}
}
