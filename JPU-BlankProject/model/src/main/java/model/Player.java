package model;

<<<<<<< HEAD
public class Player {
	
	/**
	 * Method to move player
	 * @param x
	 * 		move to x direction
	 * @param y
	 * 		move to y direction
	 */
	public void move(int x, int y) {
		
	}
=======

import java.awt.Image;
import javax.swing.ImageIcon;

public class Player extends MotionElement implements IInteractions {

	public MotionElement player;
	static int numberLife;
	public Player(int x, int y) {
		super();
		MotionElement player = new MotionElement();
		ImageIcon i = new ImageIcon("C:/Users/Avantro/Desktop/a.png");
		Image image = i.getImage();
		player = this.player;
	}
	public int getNumberLife() {
		return numberLife;
	}
	public void setNumberLife(int numberLife) {
		this.numberLife = numberLife;
	}

>>>>>>> 3d6ded7eca201512c6192ef41113777aa7554099

}
