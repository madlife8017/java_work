package oop.poly.player;

public class Warrior extends Player {

	int rage;
	
	Warrior(String name){
		super(name);
		this.rage = 60;
	}

	 public void rush(Player target) {
		/*
		 - 전사의 고유 기능인 rush 메서드를 작성합니다.
		 - rush의 대상은 모든 직업들 입니다. 
		 - rush 대상 전사면 10피해/법사면 20피해/냥꾼이면 15피해
		 - instanceof
		 - 남은체력 출력
		 - main에 객체를 생성한후 호출 적
		 */

		if (target instanceof Warrior) { 
			target.hp -=10;
			System.out.printf("[%s](이)가 [%s]에게 돌진했습니다.\n",this.name,target.name);
			System.out.printf("[%s]의 남은 체력 : %d\n",target.name,target.hp);
		}
		if (target instanceof Mage) { 
			target.hp -=20;
			System.out.printf("[%s](이)가 [%s]에게 돌진했습니다.\n",this.name,target.name);
			System.out.printf("[%s]의 남은 체력 : %d\n",target.name,target.hp);
		}
		if (target instanceof Hunter) { 
			target.hp -=15;
			System.out.printf("[%s](이)가 [%s]에게 돌진했습니다.\n",this.name,target.name);
			System.out.printf("[%s]의 남은 체력 : %d\n",target.name,target.hp);
		}


	}

	@Override
	void characterInfo() {
		super.characterInfo();
		System.out.println("# 분노 : " +rage);

	}

	




}
