package basic.array;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayDeleteQuiz {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String[] kakao = {"무지","네오","어피치","라이언","춘식이"};
		System.out.println("현재 저장된 친구들 : " + Arrays.toString(kakao));
		System.out.print("삭제할 원하는 친구를 입력하세요 : ");
		String name = sc.next();
		String [] temp = new String [kakao.length-1];
		/*
		 삭제 친구 입력
		 입력 이름 없다면 없다고 얘기ㄱ
		 */
		
		
		for(int i=0; i<kakao.length;i++) {
			if(name.equals(kakao[i])) {
				for(int j=i;j<temp.length;j++) {
					kakao[j] = kakao[j+1];
				}
				for(int k=0;k<temp.length;k++) {
					temp[k]=kakao[k];
				}
				kakao = temp;
				temp = null;
				System.out.println("삭제후 정보 : " + Arrays.toString(kakao));
				break;
			}else if(i==kakao.length-1){
				System.out.println(name + " 은(는) 등록되지 않은 이름입니다.");
				break;
			}
		}
		
	}
}
