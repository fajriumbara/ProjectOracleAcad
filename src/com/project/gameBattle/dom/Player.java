package com.project.gameBattle.dom;

public class Player extends Hero implements HeroMovements {

	public Player(String string, String string2, int i, int j) {
		// TODO Auto-generated constructor stub
		name = string;
		classHero = string2;
		hp = i;
		mp = j;
	}

	@Override
	public void attackWithWeapon(Hero h, Weapon w) {
		// TODO Auto-generated method stub
		Player.this.hp -= h.attackPoint;

	}

	@Override
	public void attackWithMagic(Hero h, Magic m) {
		// TODO Auto-generated method stub
		Player.this.hp -= h.magicPoint;
		Player.this.mp -= m.manaPoinReduction;

	}

	@Override
	public void defendWithArmor(Hero h, Armor a) {
		// TODO Auto-generated method stub
		Player.this.hp -= h.defendPoint;
	}

}
