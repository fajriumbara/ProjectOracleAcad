package com.project.gameBattle.ui;

import javax.swing.JFrame;

import com.project.gameBattle.ctr.GameBattleRules;
import com.project.gameBattle.dom.Arrow;
import com.project.gameBattle.dom.CPU;
import com.project.gameBattle.dom.Fire;
import com.project.gameBattle.dom.Hero;
import com.project.gameBattle.dom.Mail;
import com.project.gameBattle.dom.Player;
import com.project.gameBattle.dom.Shield;
import com.project.gameBattle.dom.Spear;
import com.project.gameBattle.dom.Sword;
import com.project.gameBattle.dom.Water;
import com.project.gameBattle.dom.Wind;

public class BattleFieldGUI extends JFrame{
	public BattleFieldGUI() {
		//environtment
		Player p1 = new Player("Ali", "Elf", 100, 100);
		CPU cpu1 = new CPU ("Udin", "Goblin", 100, 100);
		Sword w1 = new Sword(4);
		Spear w2 = new Spear(5);
		Arrow w3 = new Arrow(3);
		
		Mail a1 = new Mail(3);
		Shield a2 = new Shield(3);
				
		Fire m1 = new Fire(6);
		Water m2 = new Water(6);
		Wind m3 = new Wind(6);
		
		p1.equip(w1, a1, m1);
		cpu1.equip(w2, a2, m3);
		//end environtment
		
		System.out.println(p1);
		System.out.println(cpu1);
		
	
		
	
		
		getContentPane().setLayout(null);
		setSize(800,600);
	}

}
