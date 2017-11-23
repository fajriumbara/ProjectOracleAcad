package com.project.gameBattle.dom;

public interface HeroMovements {

	void attackWithWeapon(Hero h, Weapon w);

	void attackWithMagic(Hero h, Magic m);

	void defendWithArmor(Hero h, Armor a);

}
