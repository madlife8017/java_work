package etc.api.util.random;

import java.util.ArrayList;
import java.util.Arrays;
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
	static Set<Integer> wLotto = new HashSet<>();
	static int Bonus=0;
	static long money =0;

	public static Set createLotto(){
		/*
		 -1~45 범위의 난수 6개를 생성하셔서 컬렉션 자료형에 모아서 리턴
		 무엇을 쓰던 노상관
		 중복이 발생하면 안됨
		 */
		wLotto = new HashSet<>();
		while(wLotto.size()<6) {
			int num = r.nextInt(45)+1;
			wLotto.add(num);
		}

		return wLotto;
	}

	//보너스 번호생성 메서드
	public static void createBonusNum(List<Integer> w) {
		/*
		 -매개값으로 전달되는 당첨 번호 집합을 전달 받으신 후 당첨번호 피해서 보너스번호 하나만
		 1~45사이 난수
		 */
		while(true) {
			int bonus = r.nextInt(45)+1;
			if(w.contains(bonus)) {
				continue;
			} else {
				System.out.println(" + bonus : "+bonus);
				w.add(bonus);//bonus);
				Bonus=bonus;
				break;			
			}
		}
	}

	//당첨 등수를 알려주는 메서드
	public static void checklottoNumber(List<Integer> w,List<Integer> p,int bonus) {
		/*
			 매개값으로 1등번호, 구매한 로또번호집합, 보너스 번호 
			 내로또 번호와 당첨번호를 비교하여 일치하는 횟수를 세주신 후 등수를 판단하세요.
			 판단된 등수에 해당하는 static 변수의 값을 올려주시면 됩니다.
			 6개 1등
			 5+보너스 2등
			 5개 3등
			 4개 4등
		     3개 5등
			 나머지 꽝
		 */

		int count=0;
		for(int i=0;i<p.size();i++) {
			if(w.contains(p.get(i))){
				count++;					
			}
		}

		if(count==6) {

			if(p.contains(bonus) ){prize2++;} 
			else prize1++;
		}
		else if(count==5 && !(p.contains(bonus))) {prize3++;}
		if(count==4 && !(p.contains(bonus))) {prize4++;}
		if(count==3 && !(p.contains(bonus))) {prize5++;}
		if(count<3 && !(p.contains(bonus))) {prize6++;}


	}


	public static void main(String[] args) {
		//당첨번호하나 고정시키자
		//보너스 번호도 하나 고정

		createLotto();
		List<Integer> w = new ArrayList<>(wLotto);

		/*
		 ****테스트용****
		w.add(1);
		w.add(2);
		w.add(3);
		w.add(4);
		w.add(5);
		w.add(6);
		 */

		System.out.print(w);
		createBonusNum(w);
		List<Integer> pp = new ArrayList<>();



		while(true) {
			/*
			 * 1등당첨될때까지 반복문을 돌립니다.
			 * 1등이 당첨되면 1등이 되기까지 누적 당첨횟수를 출력하고 반복문을 종료합니다.
			 * 1등 당첨금액도 출력 long
			 */
			if(prize1==1) {
				break;
			}
			createLotto();
			List<Integer> p = new ArrayList<>(wLotto);
			/*
			 ****테스트용****
			p.add(1);
			p.add(2);
			p.add(3);
			p.add(4);
			p.add(5);
			p.add(9);
			 */
			System.out.println(p);
			checklottoNumber(w, p, Bonus);
			pp=p;
		}
		System.out.println();
		System.out.println("==============================================");
		System.out.println("당첨 번호 : "+w);
		System.out.println("추첨한 번호 : "+ pp);
		System.out.println("1등 당첨횟수 : "+prize1);
		System.out.println("2등 당첨횟수 : "+prize2);
		System.out.println("3등 당첨횟수 : "+prize3);
		System.out.println("4등 당첨횟수 : "+prize4);
		System.out.println("5등 당첨횟수 : "+prize5);
		System.out.println("총 도전 횟수 : "+(prize5+prize4+prize3+prize2+prize1));
		System.out.println("1등 당첨까지 비용 : "+((prize5+prize4+prize3+prize2+prize1)*1000)+"원");		
		System.out.println("==============================================");




	}

}
