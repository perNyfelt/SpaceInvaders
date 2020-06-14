package se.alipsa.spaceinvaders;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.swing.JFrame;

public class SpaceInvaders extends JFrame {

	private static final Logger log = LogManager.getLogger();

	public static void main(String[] args) {
		new SpaceInvaders();
	}

	public SpaceInvaders() {
		log.info("Starting space invaders");
		add(new Board());
		setTitle("Space Invaders");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(Settings.BOARD_WIDTH, Settings.BOARD_HEIGTH);
		setLocationRelativeTo(null);
		setVisible(true);
		setResizable(false);
	}

}
