package main;
import java.awt.Color;

import javax.swing.*;


public class GameWindow{
	private JFrame jframe;
	private final int SCREENWIDTH = 400, SCREENHEIGHT = 400;  
	
	public GameWindow(GamePanel gamePanel) {
		jframe = new JFrame();

		jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jframe.add(gamePanel);
		jframe.setTitle("Game"); 
		jframe.setLocationRelativeTo(null);
		jframe.setResizable(false);
		jframe.pack();
		

		
		//don't move!
		jframe.setVisible(true);
	}
}
