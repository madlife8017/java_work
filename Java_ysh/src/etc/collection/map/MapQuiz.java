package etc.collection.map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

/*
1. engKor이라는 이름으로 Map을 생성해 주세요.
 이 Map은 key로 영단어, value로 한글 뜻을 삽입할 겁니다.

2. 사용자에게 영단어를 입력받아서, 이미 Map에 존재하는 단어라면
 다시 입력받으세요. (이미 존재한다는 메세지 출력)
 영단어 입력창에 '그만' 이라고 입력하면 입력을 종료해 주세요.

3. 영단어 입력 후에는 한글 뜻을 입력받아서 Map에 삽입해 주세요.

4. 입력이 종료되면, 반복문을 이용해서 
영단어 : 뜻
영단어 : 뜻
영단어 : 뜻.... 형태로 입력받은 영단어와 뜻을 모두 출력해 주세요.
 */

public class MapQuiz {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int count=1;
		Map<String, String> engKor = new HashMap<>();
		List<String> list = new ArrayList<>();
		while(true) {
			System.out.printf("%d번째 영단어를 입력해주세요 : ",count);
			String eng = sc.next();
			if(list.contains(eng)) {
				System.out.println("중복된 영단어 입니다. 다시입력해주세요");
				System.out.println();
				continue;				
			}else if (eng.equals("그만"))	break;
			else{
				list.add(eng);
				System.out.printf("%d번째 영단어의 뜻을 입력해주세요 : ",count);
				count++;
				String kor = sc.next();
				engKor.put(eng, kor);
				System.out.println();
			}
		}

		Set<String> keys = engKor.keySet();
		System.out.println("==================");
		System.out.println("영어\t뜻");
		System.out.println("==================");
		for(String n :keys) {
			System.out.printf("%s\t%s\n",n,engKor.get(n));
		}
		
		sc.close();
	}
}
