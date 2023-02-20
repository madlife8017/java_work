package basic;

public class CastingExample1 {

	public static void main(String[] args) {
		
		byte b = 10;
		int i = b;
		System.out.println(i);
		
		/*
		 * 크기가 작은 데이터 타입의 자료를 큰 데이터 타입으로 변활할 때는
		 * 자바 가상 머신(JVM)이 자동으로 타입을 올려서 변환해줍니다.
		 * (promotion,UpCasting)
	 */
		
		char c = 'A';
		int j = c;
		
		// int > char (char 는 65000까지 밖에 없음)
		System.out.println("A의 문자 번호 : " + j);
		
		int k = 500;
		double d = k;
		System.out.println(d);
		// double > int

	}

}
