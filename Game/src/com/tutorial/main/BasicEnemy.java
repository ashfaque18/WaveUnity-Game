package com.tutorial.main;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.RenderingHints;

public class BasicEnemy extends GameObject{
	Handler handler;
	public BasicEnemy(final float x, final float y, final ID id) {
		super(x, y, id);
		velY = 3;
		velX = 3;
	}


	public void tick() {

		x = x + velX;
		y = y + velY;
		if (y <= 0 || y >= Game.HEIGHT - 32) {
			velY = velY * -1;
		} else if (x <= 0 || x >= Game.WIDTH - 16) {
			velX = velX * -1;
		}
	}

	
	public void render(final Graphics g) {
		g.setColor(Color.red);
		final Graphics2D g2d = (Graphics2D) g;
		g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
				RenderingHints.VALUE_ANTIALIAS_ON);
		g2d.fillOval((int)x, (int)y, 20, 20);
	}

	
	public Rectangle getBounds() {
		return new Rectangle((int)x, (int)y, 20, 20);
	}

}