package basic.loop;

import java.util.Scanner;

public class BreakQuiz02 {

	public static void main(String[] args) {
		/*
        # UP&DOWN 게임을 제작합니다.
        1. 기준이 되는 수는 난수 범위 1~100까지로 지정해 주세요.
        2. 사용자에게 정답을 입력받아서, 기준이 되는 수보다
        작은 수를 입력하면 UP, 큰 수를 입력하면 DOWN이라고 출력해서
        정답에 근접할 수 있도록 유도해 주세요.
        3. 승리 조건 횟수는 7회로 제한하겠습니다.
        7회가 넘어가도 정답은 계속 맞출 수 있도록 작성해 주세요.
        정답을 맞췄다면, 반복문 종료와 함께 승리/패배 여부를 알려 주세요.
		 */

		System.out.println("*** UP&DOWN 게임***");
		System.out.println("# 1부터 100까지의 정수 중 어느 숫자가 선택되었을까요?");
		System.out.println("# 기회는 총 7번 입니다.");
		System.out.println("============================================");
		Scanner sc = new Scanner(System.in);
		int rn = (int)(Math.random()*100+1);
		System.out.printf("(정답 : %d)\n",rn);
		int cnt = 1;
		int a = 7;

		while(true) {
			System.out.print("> ");
			int input = sc.nextInt();
			if(input <1 || input >100) {
				System.out.println("범위 내의 숫자를 입력하세요!");
				 continue;
			}
			if(rn>input) {
				a--;
				System.out.println("UP!!!");
				if(a>0) System.out.printf("정답 기회 %d번 남음\n",a);
				if(cnt==7) {
					System.out.println("정답기회 모두 소진!");
					System.out.println("마저 정답을 맞춰주세요!");
				}
			} else if(rn<input) {
				a--;
				System.out.println("DOWN!!!");
				if(a>0) System.out.printf("정답 기회 %d번 남음\n",a);
				
				if(cnt==7) {
					System.out.println("정답기회 모두 소진!");
					System.out.println("마저 정답을 맞춰주세요!");
				}
			} else if(rn==input) {
				if(cnt<=7){
					System.out.println("정답입니다!, 승리하셨습니다.");
					System.out.printf("%d번 만에 맞추셨네요",cnt);
					break;
				} else if (cnt>7) {
					System.out.println("정답입니다!, 하지만 패배하였습니다.");
					System.out.printf("%d번 만에 맞추셨네요",cnt);
					break;
				}
			}
			cnt++;
		}
		sc.close();
	}
}
