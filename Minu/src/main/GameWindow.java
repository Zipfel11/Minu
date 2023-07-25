package main;
import javax.swing.*;


public class GameWindow{
	private JFrame jframe;
	
	public GameWindow(GamePanel gamePanel) {
		jframe = new JFrame();
		
		
		jframe.setSize(400, 400);
		jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jframe.setTitle("Game"); 
		jframe.setLocationRelativeTo(null);

		
		jframe.add(gamePanel);
		
		//don't move!
		jframe.setVisible(true);
	}
	
}
