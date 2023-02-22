package basic.loop;

public class WhileExample1 {

	public static void main(String[] args) {
		
		
		/*
		 # while 문의 진행 순서...
		 1. 제어변수를 선언함. (시작값이 정해짐)
		 2. while문의 조건식을 검사해서 true면 반복문이 시작.
		 false 라면 반복문 종료.
		 3. while문 블록 내부가 한번 진행되면 (끝까지 내려가면)
		 다시 조건식을 검사하며 true 라면 반복문 계속 진행,
		 false라면 반복문 종료.
		 4. 반복문 내에는 증각식을 배치해서 제어변수의 값을 조정.
		 
		 */
		
		int n = 1; //제어변수 : 반복문의 횟수를 제어할 변수. (begin)
		while(10>=n) { //true면 돌아감/ 논리형 조건식 : 반복문의 끝을 지정. (end)
			System.out.println("안녕하세요. 반갑습니다~!"+n);
			n++; //증감식 : 반복문의 종료를 위해 제어변수의 값을 조정 (step)
		}
		
		System.out.println("----------------------------------------------");
		//1~10까지의 누적합계
		
		int a= 1 , sum= 0 ;
		while(10>=a){			
			sum = sum + a;
			a++;
		}
		System.out.println("1~10까지의 누적합 : " + sum);
	}
}
