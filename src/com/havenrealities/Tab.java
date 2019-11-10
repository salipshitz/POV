package com.havenrealities;

import java.awt.Graphics;
import java.awt.Graphics2D;

public class Tab implements Clickable {
	String title;
	
	public Tab(String title) {
		this.title = title;
	}

	@Override
	public void Draw(int x, int y, Graphics g) {
		Graphics2D g2d = (Graphics2D)g;
		
		
	}

	@Override
	public void Click() {
		// TODO Auto-generated method stub
		
	}
}
