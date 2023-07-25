package main;

import javax.swing.*;

import inputs.KeyboardInputs;

import java.awt.*;

public class GamePanel extends JPanel{
	
	public GamePanel() {
		
		addKeyListener(new KeyboardInputs());
		
	}
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		g.fillRect(100, 100, 30, 30);
	}
}
