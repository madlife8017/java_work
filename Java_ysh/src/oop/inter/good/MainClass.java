package oop.inter.good;

import java.util.Scanner;

public class MainClass {
	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);

		System.out.println("진행하실 번호를 입력하세요");
		System.out.println("1.가입 2.로그인 3.수정 4.삭제");
		System.out.print("> ");
		int menu = sc.nextInt();
		
		IUserService sv;

		if(menu ==1) {
			
			sv = new Join();
			sv.execute();

		} else if (menu ==2 ) {
			
			sv = new Login();
			sv.execute();

		} else if (menu==3) {
			
			sv = new Update();
			sv.execute();

		} else if (menu==4) {
			
			sv = new Delete();
			sv.execute();

		}

		sc.close();
	}

}
