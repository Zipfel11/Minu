package main;
import javax.swing.*;


public class GameWindow{
	private JFrame jframe;
	
	public GameWindow(GamePanel gamePanel) {
		jframe = new JFrame();
		
		
		jframe.setSize(400, 400);
		jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jframe.setTitle("Game"); 
		
		jframe.add(gamePanel);
		
		//dont move!
		jframe.setVisible(true);
	}
	
}
