package oop.poly.player;

public class MainClass {

	public static void main(String[] args) {
		
		Warrior w1 = new Warrior("전사1");
		Warrior w2 = new Warrior("전사2");
		Mage m = new Mage("법사1");
		Hunter h = new Hunter("냥꾼1");
		
		System.out.println("===================================");
		w1.rush(w2);
		w1.rush(m);
		w1.rush(h);

	}

}
