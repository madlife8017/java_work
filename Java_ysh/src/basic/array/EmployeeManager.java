package basic.array;

import java.util.Scanner;

public class EmployeeManager {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		//사원의 정보 : 사번, 이름, 나이, 부서명

		String[] userNums = new String[100];
		String[] names = new String[100];
		int[] ages = new int[100];
		String[] deps = new String[100];

		//실제로 입력된 데이터(사원의정보)의 개수를 체크하는 변수;
		int count = 0;

		while(true) {
			System.out.println("\n===========사원관리 프로그램===========");
			System.out.println("# 1 . 사원 정보 신규 등록");
			System.out.println("# 2 . 모든 사원 정보 보기");
			System.out.println("# 3 . 사원 정보 검색");
			System.out.println("# 4 . 사원 정보 수정");
			System.out.println("# 5 . 사원 정보 삭제");
			System.out.println("# 6 . 프로그램 종료");
			System.out.println("# 총 사원수 : " +count);
			System.out.println("==================================");
			System.out.print("> ");
			int menu = sc.nextInt();
			if(menu==1){
				//사원 정보 4가지를 입력받아 각 배열에 저장하는 코드를 작성.
				//사번은 중복되면 안됩니다.
				//(무한루프를 구현해서 중복이 발생하면 다시 입력받기.) 사번만!!!!!
				outer : for(int i=count;i<100;i++) {
					System.out.print("신규 사번을 입력해주세요 : ");
					String inputNum = sc.next();
					for(int j=0;j<100;j++) {
						if(inputNum.equals(userNums[j])){
							System.out.println("사번이 중복되었습니다. 다시입력해주세요");
							i--;
							break;
						}else if (j==99) {
							userNums[i] = inputNum;
							System.out.print("신규 이름을 입력해주세요 : ");
							String inputName = sc.next();
							names[i] = inputName;
							System.out.print("신규 나이을 입력해주세요 : ");
							int inputAge = sc.nextInt();
							ages[i] = inputAge;
							System.out.print("신규 부서명을 입력해주세요 : ");
							String inputdep = sc.next();
							deps[i] = inputdep;
							System.out.println("--------------");
							System.out.println("신규등록 되었습니다.");
							System.out.println("--------------");
							System.out.printf("사번 : %s\n",userNums[i]);
							System.out.printf("이름 : %s\n",names[i]);
							System.out.printf("나이 : %d\n",ages[i]);
							System.out.printf("부서 : %s\n",deps[i]);
							System.out.println();
							count++;
							break outer;
						}
					}
				}


			}else if(menu==2) {
				//각 배열을 반복문을 통해 저장된 데이터까지만 출력하도록 작성. (count)
				//만약 사용자가 사원 등록을 한 명도 하지 않았다면
				//"등록된 사원 정보가 없습니다." 를 출력하시면 됩니다.

				if(count==0) {
					System.out.println("등록된 사원 정보가 없습니다.");
				} else {
					for(int i=0; i<userNums.length;i++) {
						if(userNums[i]==null) break;

						System.out.printf("사번: %s / 이름 : %s / 나이 :%d / 부서 : %s"
								,userNums[i],names[i],ages[i],deps[i]);
						System.out.println();

					}

				}
			}else if(menu==3) {
				//입력한 사번에 일치하는 사원의 4가지 정보를 모두 출력하세요.
				//입력한 사번이 존재하지 않는다면 "조회하신 사원의 정보가 없습니다." 를 출력.
				System.out.print("사번을 입력해주세요 : ");
				outer : while(true) {
					String input = sc.next();
					for(int i=0;i<100;i++) {
						if(input.equals(userNums[i])) {
							System.out.printf("사번 : %s / 이름 : %s / 나이 : %d세 / 부서 : %s "
									,userNums[i],names[i],ages[i],deps[i]);
							System.out.println();
							break outer;

						} else if (i==99) {
							System.out.println("조회하신 사원의 정보가 없습니다.");
							break outer;
						}
					}
				}
			}else if(menu==4) {
				//해당 사번과 일치하는 사원의 나이와 부서를 선택적으로 변경할 수 있도록
				//프로그램을 구성하시고, 나이와 부서를 수정하는 코드를 작성하세요.
				//사번 입력 -> 존재하는 사번이 맞다면 -> [1. 나이변경 | 2. 부서변경 | 3.취소]
				//사번이 존재하지 않는다면 없다고 얘기해 주세요.
				System.out.print("사번을 입력해주세요 : ");
				outer : while(true) {
					String input = sc.next();
					for(int i=0;i<100;i++) {
						if(input.equals(userNums[i])) {
							System.out.println("무엇을 변경하시겠습니까?");
							System.out.println("[1. 나이변경 | 2. 부서변경 | 3.취소]");
							int mod = sc.nextInt();
							if(mod==1) {
								System.out.print("변경할 나이를 입력해주세요 : ");
								int mage = sc.nextInt();
								ages[i]=mage;
								System.out.printf("사번 : %s / 이름 : %s / 나이 : %d세 / 부서 : %s "
										,userNums[i],names[i],ages[i],deps[i]);
								System.out.println("\n변경되었습니다.");
								break outer;

							}else if(mod==2){
								System.out.print("변경할 부서를 입력해주세요 : ");
								String mdeps = sc.next();
								deps[i]=mdeps;
								System.out.printf("사번 : %s / 이름 : %s / 나이 : %d세 / 부서 : %s "
										,userNums[i],names[i],ages[i],deps[i]);
								System.out.println("\n변경되었습니다.");
								break outer;


							}else if(mod==3) {
								System.out.println("취소되었습니다.");
								break outer;

							}

						} else if (i==99) {
							System.out.println("조회하신 사원의 정보가 없습니다.");
							break outer;
						}
					}
				}
			}else if(menu==5) {
				//해당 사번과 일치하는 사원의 4가지 정보를 각 배열에서 모두 삭제하고
				//삭제하기 전에 "정말 삭제하시겠습니까? [Y/N]" 를 입력받아서
				//y를 눌렀을 시에 삭제가 되도록 코드를 구성하세요.
				//배열의 크기는 줄이지 않겠습니다. 삭제할 인덱스를 기준으로 뒤에 있는 값들을
				//앞으로 한칸씩 땡기신 다음 count를 하나 내려주시면 됩니다.
				System.out.print("사번을 입력해주세요 : ");
				outer : while(true) {
					String input = sc.next();
					for(int i=0;i<100;i++) {
						if(input.equals(userNums[i])) {
							System.out.print("정말 삭제하겠습니까? (Y/N) ");
							String yn = sc.next();
							if(yn.equals("Y")||yn.equals("y")) {
								for(int j=i;j<100;j++) {
									userNums[j]=userNums[j+1];
									names [j]= names[j+1];
									ages [j]= ages[j+1];
									deps[j] = deps[j+1];
								}
								System.out.println("사번 : "+input+"번 님의 정보가 삭제되었습니다.");
								count--;
								break outer;
							}else if(yn.equals("N")||yn.equals("n")) {
								break outer;
							}
						}else if (i==99) {
							System.out.println("조회하신 사원의 정보가 없습니다.");
							break outer;
						}
					}
				}
			}else if(menu==6) {
				System.out.println("프로그램을 종료합니다.");
				sc.close();
				break; //while break
			}else {
				System.out.println("메뉴를 잘못 입력하셨습니다.");
			}			
		}//end while 
	}// end main
}
