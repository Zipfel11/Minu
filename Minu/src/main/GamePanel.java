package main;


import javax.swing.*;

import inputs.KeyboardInputs;
import inputs.MouseInputs;

import java.awt.*;

public class GamePanel extends JPanel{
	private MouseInputs mouseInputs;
	private Game game;

	public GamePanel(Game game) {
		mouseInputs = new MouseInputs(this);
		this.game = game;

		setPanelSize();
		addKeyListener(new KeyboardInputs(this));
		addMouseListener(mouseInputs);
		addMouseMotionListener(mouseInputs);
		
	}


	public void paintComponent(Graphics g) {
		super.paintComponent(g);

		game.render(g);
	}

	private void setPanelSize() {
		Dimension size = new Dimension(1280, 800);
		setMinimumSize(size);
		setPreferredSize(size);
		setMaximumSize(size);
	}

	public Game getGame() {
		return game;
	}

}

