package com.havenrealities;

import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;

import javax.swing.JPanel;

public class Canvas extends JPanel {
	ArrayList<GameObject> objs = new ArrayList<>();

	public Canvas() {
		setBackground(Color.BLACK);

		objs.add(new Tab("Contents", false));
	}

	@Override
	public void paintComponent(Graphics g) {
		for (GameObject obj : objs) {
			obj.draw(g);
		}
	}
}
