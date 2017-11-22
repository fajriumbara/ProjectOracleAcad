package com.project.gameBattle.ui;

import javax.swing.JFrame;
import javax.swing.JButton;

public class MainMenuGUI extends JFrame {
	public MainMenuGUI() {
		getContentPane().setLayout(null);
		
		setSize(800, 600);
		
		JButton btnNewButton = new JButton("MULAI");
		btnNewButton.setBounds(154, 157, 115, 29);
		getContentPane().add(btnNewButton);
	}
}
