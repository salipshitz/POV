package com.havenrealities;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

public class Tab implements Clickable {
	private String title;
	private boolean isActive;
	
	public static int amountOfTabs;
	
	public Tab(String title) {
		this.title = title;
	}
	
	public Tab(String title, boolean isActive) {
		this(title);
		this.isActive = true;
	}

	@Override
	public void draw(Graphics g) {
		Graphics2D g2d = (Graphics2D)g;
		
		g2d.setColor(Color.WHITE);
		g2d.drawRect(x, y, Game.self.getWidth()/amountOfTabs, 100);
	}

	@Override
	public void click() {
		// TODO Auto-generated method stub
		
	}
}
