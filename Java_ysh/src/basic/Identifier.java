package basic;

public class Identifier {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 안지키면 에러가능함.
		// 식별자으 ㅣ이름은 중복하지 않는다. 대/소문자를 철저하게 구분합니다.
		
		int age = 35;
		
//		int age =40;
		int Age = 40;
		
		
		System.out.println(age);
		System.out.println(Age);
		
		//2. 식별자 이름은 숫자로 지정하거나 숫자로 시작하시면 안됩니다.
		//3. 식별자 이름에 공백을 포함할 수 없습니다.
		//4. 식별자 이름에 쓸수있는 특수문자는 밑줄(_), 달러기호($)
		//뿐입니다. 하지만 사용권장 하지는 않습니다.
		// 저 특수무자들은 사용하기로 약속한 곳이 지정되어 있습니다.
		
		String $hello = "안녕";
		
		System.out.println($hello);
		
		//5. 키워드는 식별자 이름으로 사용이 불가능; 키워드는 이미 어떤기능 가지고있는 문자
		//6. 한글이나 한자 같은 식별자 이름도 지정이 가능합니다. 하지만 사용 권장 x
		
		
		System.out.println("ㅇㅇㅇ");
		
		
		

	}

}
