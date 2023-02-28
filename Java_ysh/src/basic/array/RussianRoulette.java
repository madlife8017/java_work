package basic.array;

import java.util.Arrays;
import java.util.Scanner;

public class RussianRoulette {

	public static void main(String[] args) {
		/*
        - 게임 인원은 2 ~ 4명 입니다.
        - 실탄 개수는 6개 미만으로 설정하겠습니다.
        - 게임이 시작되면, 시작 인원은 랜덤으로 순서가 설정됩니다.
         또한 총알의 위치도 랜덤으로 설정됩니다.
        - 총알의 위치는 boolean 타입의 배열로 선언하여 배치하였습니다.
        ex)  [false, false, false, true, false, false]
        - 룰은 정해진 것은 없지만, 한명이 사망하면 총알의 위치를 
         랜덤으로 바꿔서 남은 인원으로 다시 진행을 할 생각입니다.
         원하는 규칙이 있다면 자유롭게 커스텀해서 작성해 보세요.
		 */
		// 게임 인원 입력
		// 플레이어 이름 등록
		// 배열을 하나 생서해서 플레이어들을 배치
		// 배열의 크기는 게임 참가자의 명수와 동일합니다.
		// 실탄개수 입력 (1미만 x , 5초과 안됩니다)
		// 실탄 탄창배치
		//난수를 생성해서 실탄을 탄창에 배치
		// false -> true로 바꾸는게 실탄 장전
		// 중복방지
		//실행순서 정하기
		//난수를 이용해서 실행 순서
		//시작인덱스를 난수로 정해서 돌아가게 해도되고 아예 배치를 섞어도 됨
		//  sc.nextLine(); 이 입력값은 일부러 흐름을 잠시 끊어줌
		//최후의 1인이 남을때ㅣ까지 게임을 진행해 주세요. 또는 총알소비 다 소비할때까지 게임 진행
		//총알을 소모하면 true값을 false로 변경
		//사람이 한명 아웃되면 배열의 크기를 줄여주세요

		Scanner sc = new Scanner(System.in);

		System.out.print("게임 인원을 입력해주세요 (2 ~ 4명) : ");
		int playNums = sc.nextInt();
		String[] players = new String[playNums];
		
		String[] temp = new String[playNums];
		
		int r= 0;
		
		for(int i =0 ;i<playNums;i++) {
			System.out.printf("%d번 플레이어 이름을 입력해주세요 : ",i+1);
			String name = sc.next();
			
			players[i] = name;
		}
		
		for(int j=0; j<playNums;j++) {
			int nw = (int)(Math.random()*playNums);
			String tmp = players[nw];
			players[nw] = players[j];
			players[j] = tmp;
			
		}
		for(int i=0;i<playNums;i++) {
			temp[i] = players[i];
		}
		
		System.out.println();
		System.out.println("======================");
		System.out.println("플레이어 순서가 배치되었습니다.");
		System.out.println(Arrays.toString(players));
		System.out.println("======================");


		System.out.println();
		System.out.print("실탄 갯수를 입력해주세요 (6개 미만) : ");
		int bNums = sc.nextInt();
		boolean[] bulletPos = new boolean[6];
		System.out.println();

		System.out.print("실탄 위치 : ");
		for(int i=0;i<bNums;i++) {
			int w = (int) (Math.random()*5);
			for(int j=0;j<6;j++) {
				if(bulletPos[w]==true) {
					i--;
					break;
				}else {
					bulletPos[w]=true;
					break;
				}
			}
		}
		System.out.println(Arrays.toString(bulletPos));
		System.out.println("\n==게임을 시작하겠습니다==\n");
		String bb = sc.nextLine();

		outer : while(true) {
			
			for(int n=0;n<players.length;n++) {
				if(playNums==1){
					System.out.print("=================\n");
					System.out.printf("생존자 : %s",players[n]);
					System.out.print("\n================");
					break outer;
				}
				if(bNums==0) {
					System.out.print("=================\n");
					System.out.print("생존자 : ");
					for(int q=0;q<players.length;q++)System.out.print(players[q]+" ");
					System.out.print("\n================");
					break outer;
				}
				System.out.printf("[%s]의 턴! ",players[n]);
				System.out.println("\nEnter를 누르시면 발사됩니다.");


				System.out.println("발사하겠습니까?");
				sc.nextLine();
				System.out.println("빵!!");
				if(bulletPos[r]==true) {
					playNums--;
					bNums--;
					r=0;
					System.out.printf("[%s] 사망...\n",players[n]);
					System.out.printf("남은 총알 수 : %d발\n",bNums);
					System.out.printf("생존 인원 : %d명\n",playNums);
					for(int k=n;k<playNums;k++) {
						temp[k]=temp[k+1];
					}
					players = new String[playNums];
					for(int z=0;z<playNums;z++) {
						players[z]=temp[z];
					}
				
					System.out.print("생존자 : [ ");
					for(int m=0; m<playNums;m++) {
						System.out.printf("%s ",players[m]);
					}
					System.out.print("]\n");
					System.out.println("남은인원이 게임을 진행합니다.");
					System.out.println("탄창이 무작위로 돌아갑니다.");
					System.out.println();
					for(int p=0;p<6;p++) {
						bulletPos[p]=false;
					}
					for(int i=0;i<bNums;i++) {
						int w = (int) (Math.random()*5);
						for(int j=0;j<6;j++) {
							if(bulletPos[w]==true) {
								i--;
								break;
							}else {
								bulletPos[w]=true;
								break;
							}
						}
					}
					n--;
					System.out.print("실탄 위치 : ");
					System.out.println(Arrays.toString(bulletPos));
					System.out.println();



				}else {

					System.out.printf("[%s] 생존!\n",players[n]);
					System.out.printf("남은 총알 수 : %d발\n",bNums);
					System.out.printf("생존 인원 : %d명\n",playNums);
					System.out.print("생존자 : [ ");
					for(int m=0; m<playNums;m++) {
						System.out.printf("%s ",players[m]);
					}
					System.out.print("]\n");
					System.out.println("남은인원이 게임을 진행합니다.");
					System.out.println();
					System.out.print("실탄 위치 : ");
					System.out.println(Arrays.toString(bulletPos));
					System.out.println();
					r++;


				}

			}
		}
		sc.close();
	}
}

