package main;

import javax.imageio.ImageIO;
import javax.swing.*;

import inputs.KeyboardInputs;
import inputs.MouseInputs;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.InputStream;

public class GamePanel extends JPanel{
	private MouseInputs mouseInputs;
	private float xDelta = 150, yDelta = 50;
	private BufferedImage img, subImg;

	public GamePanel() {
		addKeyListener(new KeyboardInputs(this));

		importImg();

		setPanelSize();
		mouseInputs = new MouseInputs(this);
		addMouseListener(mouseInputs);
		addMouseMotionListener(mouseInputs);
		
	}

	public void paintComponent(Graphics g) {
		super.paintComponent(g);

		subImg = img.getSubimage(1*64, 8*40, 64, 40);
		g.drawImage(subImg, (int)xDelta, (int)yDelta, 120, 80, null);
	}

	private void importImg(){
		InputStream is = getClass().getResourceAsStream("/player_sprites.png");
		try {
			img = ImageIO.read(is);
		} catch (IOException e) {
			throw new RuntimeException(e);
		}

	}

	private void setPanelSize() {
		Dimension size = new Dimension(1280, 800);
		setMinimumSize(size);
		setPreferredSize(size);
		setMaximumSize(size);
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
	

}

