package com.project.gameBattle.dom;

public abstract class Hero {
	public String name;
	public String classHero;
	public int hp;
	public int mp;
	public int attackPoint;
	public int magicPoint;
	public int defendPoint;
	public Weapon wp;
	public Armor ar;
	public Magic m;

	public void equip(Weapon wp, Armor ar, Magic m) {
		attackPoint = wp.attackPointWeapon;
		defendPoint = ar.defendPointArmor;
		magicPoint = m.attackPontMagic;
		this.wp = wp;
		this.ar = ar;
		this.m = m;
	}

	@Override
	public String toString() {
		return "Hero [name=" + name + ", classHero=" + classHero + ", hp=" + hp + ", mp=" + mp + ", attackPoint="
				+ attackPoint + ", magicPoint=" + magicPoint + ", defendPoint=" + defendPoint + "]";
	}

}
