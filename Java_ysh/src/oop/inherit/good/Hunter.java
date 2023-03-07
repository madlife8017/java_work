package oop.inherit.good;

public class  Hunter extends Player{
	int pet;

	@Override
	void characterInfo() {
		super.characterInfo();
		System.out.println("# 펫 : " +pet);
	}


}


