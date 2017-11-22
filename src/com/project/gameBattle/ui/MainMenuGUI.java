package com.project.gameBattle.ui;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MainMenuGUI extends JFrame {
	public MainMenuGUI() {
		getContentPane().setLayout(null);
		
		setSize(800, 600);
		
		JButton btnNewButton = new JButton("MULAI");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			new BattleFieldGUI().setVisible(true);
			MainMenuGUI.this.setVisible(false);
			
			}
		});
		btnNewButton.setBounds(344, 409, 115, 29);
		getContentPane().add(btnNewButton);
	}
}
