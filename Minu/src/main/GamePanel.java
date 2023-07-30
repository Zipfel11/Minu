package main;

import javax.swing.*;

import inputs.KeyboardInputs;
import inputs.MouseInputs;

import java.awt.*;
import java.util.Random;

public class GamePanel extends JPanel{

	private MouseInputs mouseInputs;
	private float xDelta = 150, yDelta = 50;
	private float xDir = 1.5f, yDir = 1.5f;
	private Color color = new Color(50, 70, 180);
	private Random random;
	
	public GamePanel() {
		random = new Random();
		addKeyListener(new KeyboardInputs(this));
		
		mouseInputs = new MouseInputs(this);
		addMouseListener(mouseInputs);
		addMouseMotionListener(mouseInputs);
		
	}
	
	public void changeXDelta(int value) {
		this.xDelta += value;
		
	}
	
	public void changeYDelta(int value) {
		this.yDelta += value;
		
	}
	
	public void setRectPosition(int x, int y) {
		this.xDelta = x;
		this.yDelta = y;
		
	}
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		updateRectangle();
		g.setColor(color);
		
		g.fillRect((int) xDelta, (int) yDelta, 30, 30);
		
		
		
	}

	private void updateRectangle() {
		this.xDelta += this.xDir;
		
		if (this.xDelta > 400 - 30 || this.xDelta < 0) { 
			this.xDir *= -1;
			this.color = getRandomColor();
		}
		
		
		this.yDelta += this.yDir;
		
		if (this.yDelta > 400 - 60 || this.yDelta < 0) {
			this.yDir *= -1;
			this.color = getRandomColor();

		}
		
	}

	private Color getRandomColor() {
		return new Color(random.nextInt(255), random.nextInt(255), random.nextInt(255));
	}
}
