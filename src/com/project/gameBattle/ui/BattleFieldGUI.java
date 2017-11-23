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
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.TextArea;
import java.awt.event.ActionEvent;

public class BattleFieldGUI extends JFrame {
	private JTextField textField;
	private JTextField textField_1;

	public BattleFieldGUI() {
		// environment

		Player p1 = new Player("Ali", "Elf", 100, 100);
		CPU cpu1 = new CPU("Udin", "Goblin", 100, 100);
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
		// end environment

		getContentPane().setLayout(null);

		JLabel lblHero = new JLabel("Hero 1 : Player");
		lblHero.setBounds(122, 134, 99, 14);
		getContentPane().add(lblHero);

		JLabel lblVs = new JLabel("VS");
		lblVs.setBounds(245, 134, 46, 14);
		getContentPane().add(lblVs);

		JLabel lblHero_1 = new JLabel("Hero 2 : CPU");
		lblHero_1.setBounds(315, 134, 70, 14);
		getContentPane().add(lblHero_1);

		System.out.println(p1);
		System.out.println(cpu1);

		GameBattleRules gb = new GameBattleRules();

		JButton btnAttackWithWeapon = new JButton("Attack With Weapon");
		btnAttackWithWeapon.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				p1.attackWithWeapon(cpu1, p1.wp);
				cpu1.attackWithWeapon(p1, cpu1.wp);
				System.out.println("Player menyerang dengan senjata");
				System.out.println(p1.hp);
				System.out.println(cpu1.hp);

				if (gb.checkLifeHero(p1, cpu1) == -1) {
					JOptionPane.showMessageDialog(rootPane, "PLAYER WINS!");
				} 
				if (gb.checkLifeHero(p1, cpu1) == 1) {
					JOptionPane.showMessageDialog(rootPane, "CPU WINS!");
				} 
				if (gb.checkLifeHero(p1, cpu1) == 0) {
					JOptionPane.showMessageDialog(rootPane, "DRAW");
				}
				textField.setText(Integer.toString(p1.hp));
				textField_1.setText(Integer.toString(cpu1.hp));

			}
		});
		btnAttackWithWeapon.setBounds(69, 175, 152, 23);
		getContentPane().add(btnAttackWithWeapon);

		JButton btnAttackWithMagic = new JButton("Attack With Magic");
		btnAttackWithMagic.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				p1.attackWithMagic(cpu1, p1.m);
				cpu1.attackWithMagic(p1, cpu1.m);
				System.out.println("Player menyerang dengan sihir");
				System.out.println(p1.hp);
				System.out.println(cpu1.hp);
				if (gb.checkLifeHero(p1, cpu1) == -1) {
					JOptionPane.showMessageDialog(rootPane, "PLAYER WINS!");
				} 
				if (gb.checkLifeHero(p1, cpu1) == 1) {
					JOptionPane.showMessageDialog(rootPane, "CPU WINS!");
				} 
				if (gb.checkLifeHero(p1, cpu1) == 0) {
					JOptionPane.showMessageDialog(rootPane, "DRAW");
				}
				textField.setText(Integer.toString(p1.hp));
				textField_1.setText(Integer.toString(cpu1.hp));
			}
		});
		btnAttackWithMagic.setBounds(69, 209, 152, 23);
		getContentPane().add(btnAttackWithMagic);

		JButton btnDefendWithArmor = new JButton("Defend With Armor");
		btnDefendWithArmor.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				p1.defendWithArmor(p1, p1.ar);
				cpu1.defendWithArmor(cpu1, cpu1.ar);
				System.out.println("Player bertahan dengan armor");
				System.out.println(p1.hp);
				System.out.println(cpu1.hp);
				if (gb.checkLifeHero(p1, cpu1) == -1) {
					JOptionPane.showMessageDialog(rootPane, "PLAYER WINS!");
				} 
				if (gb.checkLifeHero(p1, cpu1) == 1) {
					JOptionPane.showMessageDialog(rootPane, "CPU WINS!");
				} 
				if (gb.checkLifeHero(p1, cpu1) == 0) {
					JOptionPane.showMessageDialog(rootPane, "DRAW");
				}
				textField.setText(Integer.toString(p1.hp));
				textField_1.setText(Integer.toString(cpu1.hp));
			}
		});
		btnDefendWithArmor.setBounds(69, 243, 152, 23);
		getContentPane().add(btnDefendWithArmor);
		
		JLabel lblHeroHp = new JLabel("Hero Hp :");
		lblHeroHp.setBounds(46, 67, 99, 20);
		getContentPane().add(lblHeroHp);
		
		JLabel lblCpuHp = new JLabel("CPU Hp :");
		lblCpuHp.setBounds(333, 67, 69, 20);
		getContentPane().add(lblCpuHp);
		
		textField = new JTextField();
		textField.setBounds(122, 64, 70, 26);
		getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(417, 64, 70, 26);
		getContentPane().add(textField_1);
		textField_1.setColumns(10);
		setSize(800, 600);
		textField.setText(Integer.toString(p1.hp));
		textField_1.setText(Integer.toString(cpu1.hp));

	}
}
