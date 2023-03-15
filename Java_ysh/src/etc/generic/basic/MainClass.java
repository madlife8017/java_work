package etc.generic.basic;

public class MainClass {

	public static void main(String[] args) {
		
		
		/*
		 # 제네릭
		 -클래스 내부에서 타입을 지정하는것이 아니라 외부에서 객체를
		 생성할때 타입이 지정될수있게하는 문법
		 제네릭을 사용하면 객체로 생성할 때 사용할 타입을 지정할 수 있고
		 따로 타입을 체크하고 변환해줄 필요가 없습니다.
		 관리가 용이하고 잘못된 타입이 들어올수있는것을 방지하기 때문에
		 유지보수성, 코드의 재사용이 높아집니다.
		 */
		
		Box<String> box = new Box<>();//자바7이후로 생성자 타입은 생략 가능
		box.setT("홍길동");
		String name = box.getT();// 형변환이 따로 필요가 없다...
		
		
		//제네릭에는 기본 데이터 타입을 지정할 수없으
		//Box<Int> intBox = new Box<>();
		Box<Integer> intBox = new Box<>();
		intBox.setT(4);
		int num = intBox.getT();
		
		Box<Person> pBox = new Box<>();
		pBox.setT(new Person());
		Person p = pBox.getT();
		
		
	}

}