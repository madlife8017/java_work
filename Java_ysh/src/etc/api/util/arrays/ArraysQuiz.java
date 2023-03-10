package etc.api.util.arrays;

import java.util.Arrays;

public class ArraysQuiz {
	/*
    - 참가한 사람의 이름이 담긴 배열 participant와
    완주한 사람의 이름이 담긴 배열 completion이 주어질 때
    완주하지 못한 선수의 이름을 return하는 solution 함수를 완성하세요.
    */
	
	public static String solution(String[] participant,String[] completion){
		
		Arrays.sort(participant);
		Arrays.sort(completion);
		String b = null;
		for(int i = 0; i<participant.length;i++) {
			int a = Arrays.binarySearch(completion,participant[i]);
			if (a<0) {
				b=participant[i];
				break;
			}
		}
		return b;
	}

	public static void main(String[] args) {
		
		String[] participant = {"홍길동","김길동","김철수","최철수", "박영희"};//참가자
		String[] completion = {"홍길동","김길동","박영희","김철수"};//완주자
		
		System.out.println("참가자 : "+Arrays.toString(participant));
		System.out.println("완주자 : "+Arrays.toString(completion));
		System.out.println("==============================");
		System.out.printf("탈락자 : %s",solution(participant, completion));
		
		
		
	}

}
