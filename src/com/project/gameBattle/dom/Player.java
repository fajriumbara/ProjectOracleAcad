package com.project.gameBattle.dom;

public class Player extends Hero {

	public Player(String string, String string2, int i, int j) {
		// TODO Auto-generated constructor stub
		name = string;
		classHero = string2;
		hp = i;
		mp = j;
	}

	@Override
	public void attack(Hero h) {
		// TODO Auto-generated method stub
		System.out.println(this.name + " menyerang " + h.name);
		
	}

	@Override
	public void defend(Hero h) {
		// TODO Auto-generated method stub
		
	}





	

}
