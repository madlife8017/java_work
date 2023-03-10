package etc.api.lang.wrapper;

public class WrapperExample {

	public static void main(String[] args) {
		
		int a = 100;
		boolean b = false;
		char c ='A';
		double d = 3.14;
		
		//boxing : 기본 데이터타입을 객체타입으로 변환하는 과정 (권장 x)
		Integer v1 = new Integer(a);
		Boolean v2 = new Boolean(b);
		Character v3 = new Character(c);
		Double v4 = new Double(d);
		
//		int i = v1.intValue(); 너무 귀찮스
		
		
		//autoboxing : 기본 탕비을 자동으로 객체형으로 변환.
		Integer x1 = a;
		Boolean x2 = b;
		Character x3 = c;
		Double x4 = d;
		
		//autounboxing : 객체 포장을 기본형으로 해제 가능.
		int i = x1;
		double d2 = x4;
		
		//AutoBoxing 이후에 wrapper 클래스는 문자열을 기본형으로 변환하는데 많이 쓴다.
		
		String s2 = "3.14";
		Double.parseDouble(s2);
		//해당 타입으로 변환할수 없는 문자열 시도햇을때 nuberformatexception 예외 발생
		System.out.println(Double.parseDouble(s2));
		
		
		
		
	}
}
