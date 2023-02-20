package basic;

public class TextureExample {

	public static void main(String[] args) {
		
		char c1 = 'A';
		System.out.println(c1);
		
		char c2 = 44033;
		System.out.println(c2);
		
		//char 2byte 사용 따옴표하나로 표현
		
		/*
		 문자열을 저장할 수 있는 데이터 타입 String
		 - 저장하고 싶은 문자열을 겹따옴표
		 - 기본데이터타입은 아닌데 자주쓰여서 기본취급함(사실은 객체타입)
		 
		 */
		
		String s1 = "my dream ";
		String s2 = "is a programmer.";
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s1+s2);
		
		//자바에서는 문자열의 덧셈 연산을 지원
		//연산결과로는 문자열 연결해서 결합한 결과가 도출
		
		
		//문자열과 다른데이터 타입 간의 연산
		//결과는 무조건 문자열의 덧셈 연산과 같습니다.
		
		int a = 3;
		
		System.out.println("----------------");
		System.out.println(a+a);
		System.out.println("100"+"100");
		System.out.println("100"+100);
		System.out.println(3.14+"hi");
		
		
		System.out.println(s1+a);
		
		
		
		int month = 10;
		int day =  13;
		
		//내 생일은 10월 13일 입니다.
		System.out.println("내 생일은 " +month +"월 "+day+"일 입니다.");
	

	}

}
