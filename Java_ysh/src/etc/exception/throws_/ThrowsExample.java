package etc.exception.throws_;

public class ThrowsExample {
	
	static String[] greetings = {"안녕","헬로","니하오"};
	
	/*
	 #throws
	 - throws는 예외의 원인이 메서드 선언부가 아닌 호출부에 있을 경우
	 예외처리를 메서드의 호출부로 떠넘기는 방식입니다.
	 
	 - throws는 생성자에서도 선언이 가능하며, 메서드나 생성자를 호출햇을 시
	 예외 처리를 강요하고 싶을때 사용합니다.
	 
	 - 또한, 원하는 영역으로 예외를 모아서 한번에 처리하는 것도 가능합니다.
	 
	 
	  
	 */
	static void greet(int idx) throws Exception {
		
		System.out.println(greetings[idx]);
		
	}
	
	public static void main(String[] args) { //main은 throw 붙으면 안됨
		
		try {
			greet(3);
		} catch (Exception e) {
			e.printStackTrace(); // 에러원인 역추적해서 어디서 발생하는지, 이유가 뭔지 띄워줌
		}		
		System.out.println("프로그램 정상 종료!");
	}
}
