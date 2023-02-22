package basic.operator;

public class logicalOpertator {

	public static void main(String[] args) {
		//비교(관계) 연산자 (<,<=,>,>=,==.!=)
		//좌항과 우항의 크기를 비교하여, 결과값으로 항상 논리형 타입의 값을 도출합니다.
		
		int x = 10, y= 20;
		
		System.out.println(x>y);
		
		/*
		 논리연산자 (&,&&,|,||)
		 좌항과 우항의 논리값을 연산하여 하나의 논리값을 도출합니다.
		 
		 1. &, && : 양쪽항의 논리값이 모두 true 일경우 true가 도출되니다.
		 2. |, || : 양쪽 항의 논리값 중 한 쪽만 true여도 true를 도출합니다. 
		 
		 */
		
		//System.out.println(x>10 && (y/=10));
		System.out.println(x>=10 || y<30);
		
		/*
		 & 한개는 좌항 true여도 우항 시행
		 && 두개는 좌항 true 면 우항 생략 (연산속도 빠름)
		 
		 &&, || => 단축 평가 연산 (short circuit operation)
		 좌항의 연산 결과가 전체 연산 결과에 영향을 미칠 경우 우항의 연산을 진행하지 않습니다.  
		 
		 */
		
		//논리 바넌 연산자 (!:단항)
		//단순히 논리값을 반전시킬 때 사용합니다.
		//true - false, false -> true
		
		int z = 10;
		System.out.println(!(z == 10));
		

	}

}
