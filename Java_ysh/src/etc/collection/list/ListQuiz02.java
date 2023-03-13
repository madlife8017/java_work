package etc.collection.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
1. User 클래스를 은닉(캡슐화)된 변수 name, age로 선언해서 구현
 User클래스의 생성자는 모든 필드값을 받는 생성자 1개.

2. User 객체를 모음저장할 수 있는 ArrayList를 선언. (main method)
3. User 객체를 3개 생성해서 리스트에 추가하세요. (main method)

4. 리스트에 저장된 모든 이름, 나이를 for문으로 출력 (향상 for문)
5. 리스트 내부 객체 중 이름이 "홍길동" 이 있다면 
      그 객체를 삭제해 주세요. (일반 for문)
 */
public class ListQuiz02 {

	public static void main(String[] args) {
		List<User> a = new ArrayList<>();

		User b1 = new User("김철수",23);
		User b2 = new User("홍길동",25);
		User b3 = new User("장기하",24);

//		a.add(b1);
//		a.add(b2);
//		a.add(b3);
		
		Collections.addAll(a,b1,b2,b3);

		for (User p : a) {
			System.out.println(p);
		}
		System.out.println("홍길동을 찾습니다.");
/*
 향상for문을 사용해서 순회할때 리스트의 크기를 맘대로 줄이거나 늘릴 수 없습니다.
 향상 for문은 반복문을 시작하 때 구조적으로 컬렉션의 크리 및 사용 가능한 요소들의 개수를 항상
 파악하고 있기 때문에 값의 변경이 일어나면 예외를 발생시키도록 설계되어있습니다.
 */
		
	
		for(int i =0 ; i<a.size() ;i++) {
			if((a.get(i).getName())=="홍길동") {
				System.out.println("홍길동을 발견했습니다.");
				a.remove(i);
				System.out.println("홍길동을 삭제합니다.");
				break;
			}else if (i==(a.size())-1){
				System.out.println("홍길동이 없습니다.");
			}
		}
		for (User p : a) {
			System.out.println(p);
		}
	}
}
