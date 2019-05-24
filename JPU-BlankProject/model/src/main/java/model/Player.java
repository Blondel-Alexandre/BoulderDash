package model;


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


}
