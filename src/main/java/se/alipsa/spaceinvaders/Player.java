package se.alipsa.spaceinvaders;

import static se.alipsa.spaceinvaders.Settings.BOARD_WIDTH;
import static se.alipsa.spaceinvaders.Settings.PLAYER_START_X;
import static se.alipsa.spaceinvaders.Settings.PLAYER_START_Y;

import java.awt.event.KeyEvent;

import javax.swing.ImageIcon;

public class Player extends Sprite {

	private final int START_Y = PLAYER_START_Y;
	private final int START_X = PLAYER_START_X;

	private final String player = "/img/player.png";
	private int width;

	public Player() {

		ImageIcon ii = new ImageIcon(this.getClass().getResource(player));

		width = ii.getImage().getWidth(null);

		setImage(ii.getImage());
		setX(START_X);
		setY(START_Y);
	}

	public void act() {
		x += dx;
		if (x <= 2)
			x = 2;
		if (x >= BOARD_WIDTH - 2 * width)
			x = BOARD_WIDTH - 2 * width;
	}

	public void keyPressed(KeyEvent e) {
		int key = e.getKeyCode();

		if (key == KeyEvent.VK_LEFT) {
			dx = -2;
		}

		if (key == KeyEvent.VK_RIGHT) {
			dx = 2;
		}
	}

	public void keyReleased(KeyEvent e) {
		int key = e.getKeyCode();

		if (key == KeyEvent.VK_LEFT) {
			dx = 0;
		}

		if (key == KeyEvent.VK_RIGHT) {
			dx = 0;
		}
	}

}
