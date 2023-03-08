package oop.poly.player;

public class Player {
	

	String name;
	int level;
	int atk;
	int hp;
	String pet;
	
	
	Player(){
		System.out.println("Player의 기본 생성자 호출!");
		
		level = 1;
		atk = 3;
		hp = 50;
	}
	Player(String name){
		this (); //같은 클래스의 다른 생성자를 부르는 문법
		System.out.println("Player의 2번 생성자 호출!");
		
		this.name = name;
	}
	
	Player(String name, int hp){
		this(name); // 다른 생성자의 호출은 생성자 내에서 최상단에 위치해야합니다.
		System.out.println("Player의 3번 생성자 호출");
		//this.name = name;
		this.hp = hp;
	}
	
	void attack(Player target) {
		
	//	System.out.println("target : "+target);
		//System.out.println("this : "+this);
		if(this == target) {
			System.out.println("스스로는 때릴수 없습니다.");
			return;
		}
		
		//출력메세지 : x가y를 공격합니다.
		System.out.printf("%s가 %s를 공격합니다.\n" ,this.name,target.name);
		//상대방의 체력을 10 낮추고 나의 체력을 5회복하고 싶어
		target.hp -= 10;
		this.hp +=5;
		System.out.printf("나의 체력 : %d, 상대박 체력 : %d\n",this.hp,target.hp);
		
		
		
	}
	
	void characterInfo() {
		System.out.println("***캐릭터의 정보***");
		System.out.println("# 아이디 : " +name);
		System.out.println("# 레벨 : "+level);
		System.out.println("# 공격력 : " + atk);
		System.out.println("# 체력 : "+hp);
	}
}
