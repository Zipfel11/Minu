package main;

import javax.swing.*;

import inputs.KeyboardInputs;
import inputs.MouseInputs;

import java.awt.*;

public class GamePanel extends JPanel{
	
	private MouseInputs mouseInputs;
	
	public GamePanel() {
		
		addKeyListener(new KeyboardInputs());
		
		mouseInputs = new MouseInputs();
		addMouseListener(mouseInputs);
		addMouseMotionListener(mouseInputs);
		
	}
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		g.fillRect(100, 100, 30, 30);
	}
}
