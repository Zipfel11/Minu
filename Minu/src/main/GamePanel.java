package main;

import javax.swing.*;
import java.awt.Graphics;

public class GamePanel extends JPanel{
	
	public GamePanel() {
	}
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		g.fillRect(100, 100, 30, 30);
	}
}