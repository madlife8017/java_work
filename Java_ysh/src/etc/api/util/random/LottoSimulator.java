package etc.api.util.random;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

public class LottoSimulator {
	
	static Random r = new Random();
	static int prize1 = 0; //1등 당첨횟수를 세주는 변수
	static int prize2 = 0; //2등 당첨횟수를 세주는 변수
	static int prize3 = 0; //3등 당첨횟수를 세주는 변수
	static int prize4 = 0; //4등 당첨횟수를 세주는 변수
	static int prize5 = 0; //5등 당첨횟수를 세주는 변수
	static int prize6 = 0; //꽝 당첨횟수를 세주는 변수
	static Set<Integer> wLotte = new HashSet<>();
	
	public static Set createLotto(){
		/*
		 -1~45 범위의 난수 6개를 생성하셔서 컬렉션 자료형에 모아서 리턴
		 무엇을 쓰던 노상관
		 중복이 발생하면 안됨
		 */
		
		while(wLotte.size()<6) {
			int num = r.nextInt(45)+1;
			wLotte.add(num);
		}
		
		System.out.println(wLotte);
		return wLotte;
	}
	
//	//보너스 번호생성 메서드
//	public static int createBonusNum(???) {
//		/*
//		 -매개값으로 전달되는 당첨 번호 집합을 전달 받으신 후 당첨번호 피해서 보너스번호 하나만
//		 1~45사이 난수
//
//		 */
//		
//	}
//	
//	//당첨 등수를 알려주는 메서드
//	public static void checklottoNumber(???,???,???) {
//		/*
//		 매개값으로 1등번호, 구매한 로또번호집합, 보너스 번호 
//		 내로또 번호와 당첨번호를 비교하여 일치하는 횟수를 세주신 후 등수를 판단하세요.
//		 판단된 등수에 해당하는 static 변수의 값을 올려주시면 됩니다.
//		 6개 1등
//		 5+보너스 2등
//		 5개 3등
//		 4개 4등
//		 3개 5등
//		 나머지 꽝
//		 */
//	}
//	

	public static void main(String[] args) {
		//당첨번호하나 고정시키자
		//보너스 번호도 하나 고정
		List<Integer> w = new ArrayList<>();
		
		createLotto();
		
//		while(true) {
//			/*
//			 * 1등당첨될때까지 반복문을 돌립니다.
//			 * 1등이 당첨되면 1등이 되기까지 누적 당첨횟수를 출력하고 반복문을 종료합니다.
//			 * 1등 당첨금액도 출력 long
//			 */
//		}
//		
	
		

	}

}
