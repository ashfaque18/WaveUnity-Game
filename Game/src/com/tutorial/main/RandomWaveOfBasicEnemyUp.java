package com.tutorial.main;


import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.RenderingHints;
import java.util.Random;

public class RandomWaveOfBasicEnemyUp extends GameObject{
	Handler handler;
	Random r = new Random();
	public RandomWaveOfBasicEnemyUp(final float x, final float y, final ID id) {
		super(x, y, id);
		do {
			velX = r.nextInt(9);
			velY = r.nextInt(5);
		} while (velX == 0 || velY == 0);
	}

	
	public void tick() {
		x = x - velX;
		y = y - velY;
	}

	
	public void render(final Graphics g) {
		g.setColor(Color.ORANGE);
		final Graphics2D g2d = (Graphics2D) g;
		g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
				RenderingHints.VALUE_ANTIALIAS_ON);
		g2d.fillOval((int)x, (int)y, 18, 18);
	}

	
	public Rectangle getBounds() {
		return new Rectangle((int)x, (int)y, 18, 18);
	}

}