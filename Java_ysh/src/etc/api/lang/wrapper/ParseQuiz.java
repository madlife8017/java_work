package etc.api.lang.wrapper;

import java.util.Scanner;

public class ParseQuiz {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.print("주민등록 번호를 입력해주세요 : ");
			String n = sc.next();
			if(n.charAt(6)!='-') {
				System.out.println("주민등록번호는 하이픈을 포함해야합니다.");
			} else if(!(n.charAt(7)=='1' || n.charAt(7)=='2' ||n.charAt(7)=='3' ||n.charAt(7)=='4')){
				System.out.println("뒷자리 첫번째 숫자는 1,2,3,4,중에 하나여야합니다.");
			} else if(n.length()!=14) {
				System.out.println("주민등록번호 길이가 맞지 않습니다.");
			} else {
				String gender = null;
				int year = Integer.parseInt(n.substring(0, 2));
				if(n.charAt(7)=='1'||n.charAt(7)=='2') {
					year= year+1900;
					if (n.charAt(7)=='1') gender = "남자";
					else if (n.charAt(7)=='2') gender = "여자";
				}else if(n.charAt(7)=='3'||n.charAt(7)=='4') {
					year= year+2000;
					if (n.charAt(7)=='3') gender = "남자";
					else if (n.charAt(7)=='4') gender = "여자";
				}
				String month = n.substring(2,4);
				String day = n.substring(4,6);

				System.out.printf("%d년 %s월 %s일 만%d세 %s",year,month,day,(2023-year),gender);
				break;
			}
		}
		sc.close();
	}
}


//try {
//String test = n.substring(0,6);
//String test2 = n.substring(7);
//Integer.parseInt(test);
//Integer.parseInt(test2);
//break;
//}
//catch(NumberFormatException e){
//System.out.println("숫자를 정확하게 입력하셔야합니다.");
//}

