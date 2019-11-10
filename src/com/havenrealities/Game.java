package com.havenrealities;

import javax.swing.JFrame;

public class Game extends JFrame {
	public static Game self;
	
	private Game() {
		add(new Canvas());
		
		setExtendedState(JFrame.MAXIMIZED_BOTH);
		setUndecorated(true);
		
		setTitle("POV");
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		
		setVisible(true);
	}
	
	public static void main(String args[]) {
		self = new Game();
	}
}
