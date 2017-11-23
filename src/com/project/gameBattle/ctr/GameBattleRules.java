package com.project.gameBattle.ctr;

import java.util.Random;

import com.project.gameBattle.dom.Hero;
import com.project.gameBattle.dom.Player;

public class GameBattleRules {

	public int checkLifeHero(Hero h1, Hero h2) {

		if (h1.hp <= 0) {
			return 1;
		} else if (h2.hp <= 0) {
			return -1;
		}else if (h2.hp == 0 && h1.hp ==0) {
			return 0;
		}else {
			return 999;
		}

	}
	
	public int randCritical() {
		Random rn = new Random();
		int n = rn.nextInt((3 - (-3)) + 1) + (-3);
		return n;
	}
	


}
