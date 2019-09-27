package com.tutorial.main;

import java.awt.Graphics;
import java.awt.Rectangle;

public abstract class GameObject {

	protected  float x;
	protected  float y;
	protected ID id;
	protected float velX, velY;

	public GameObject (final float x, final float y, final ID id) {
		this.x = x;
		this.y = y;
		this.id = id;
	}

	public abstract void tick();   
	public abstract void render(Graphics g); 
	public abstract Rectangle getBounds();

	
	public  float getX() {
		return x;
	}

	
	public void setX(final int x) {
		this.x = x;
	}

	
	public  float getY() {
		return y;
	}

	
	public void setY(final int y) {
		this.y = y;
	}

	
	public ID getId() {
		return id;
	}

	
	public void setId(final ID id) {
		this.id = id;
	}

	
	public float getVelX() {
		return velX;
	}

	
	public void setVelX(final int velX) {
		this.velX = velX;
	}

	
	public float getVelY() {
		return velY;
	}

	
	public void setVelY(final int velY) {
		this.velY = velY;
	}


}