package basic.method;

import java.util.Arrays;

public class methodQuiz02 {

	static String [] foods = { "떡볶이", "치킨", "파스타"};

	//배열의 맨 마지막 위치에 데이터를 추가하는 함수
	//기존 배열보다 크기가 하나 큰 배열 선언해서 값 고대로 내리기
	//매개값으로 온 값을 마지막에 채우기

	static void push (String newFood){
		String[] temp = new String[foods.length+1];
		for(int i =0; i<foods.length;i++) {
			temp[i]=foods[i];
		}
		temp[foods.length] = newFood;
		foods = new String[foods.length+1];
		foods = temp;
	}

	//배열 내부 데이터를 출력하는 함수
	static void printFood() {
		System.out.println(Arrays.toString(foods));
	}

	// 배열 내의 특정 음식의 위치를 찾아주는 함수
	static int indexOf(String targetName){
		int i=0;
		for( i =0; i<foods.length;i++) {
			if(targetName.equals(foods[i])) {
				return i;
			}
			else if(i==foods.length-1) {
				return i=-1;
			}
		}return i;
	}

	// 특정 음식의 배열 포함 여부(참/거짓)
	// indexOf의 리턴값으로 판단하여 리턴
	static void include(String targetName) {
		if(indexOf(targetName)==-1) System.out.println("메뉴에 존재하지 않는 음식입니다.");
		else System.out.println("메뉴에 존재하는 음식입니다."); 
	}

	//특정 음식 제거 함수
	static void remove(String targetName) {
		int n = indexOf(targetName);
		if(n==-1)System.out.println("삭제할 음식이 메뉴에 존재하지 않습니다.");
		else {
			for(int i = n ;i<foods.length-1;i++){
				foods[i]=foods[i+1];
			}
			String[] temp = new String[foods.length-1];
			for(int j=0; j<temp.length;j++) {
				temp[j]=foods[j];
			}
			foods=temp;
		}

	}

	//특점 음식 수정 메서드
	static void modify(int targetIdx, String newFood) {
		foods[targetIdx]=newFood;
	}

	public static void main(String[] args) {
		printFood();
		push("라면");
		push("김치찌개");
		printFood();
		indexOf("파스타");
		System.out.printf("파스타는 %d번째 음식입니다.\n",indexOf("파스타")+1);
		indexOf("김치찌개");
		System.out.printf("김치찌개는 %d번째 음식입니다.\n",indexOf("김치찌개")+1);
		indexOf("짜장면");
		System.out.printf("짜장면는 %d번째 음식입니다.\n",indexOf("짜장면"));
		include("김치찌개");
		include("망고");
		remove("치킨");
		remove("망고");
		printFood();
		modify(2,"초밥");
		printFood();
	}
}
