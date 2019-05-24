package model;

import java.awt.Image;
import java.util.Observable;

public class MotionElement extends Observable implements IInteractions {

	public static int x;
	public static int y;	

	public MotionElement() {
		// TODO Auto-generated constructor stub
	}


	public void moveUp()
	{
		this.setY(y--);
	}
	
	public void moveDown()
	{
		this.setY(y++);
	}
	
	public void moveRight()
	{
		this.setX(x++);
	}
	
	public void moveLeft()
	{
		this.setX(y++);
	}

	public void doNothing()
	{
		this.setX(x);
		this.setY(y);
	}
	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
		this.setChanged();
		this.notifyObservers();
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
		this.setChanged();
		this.notifyObservers();
	}

	@Override
	public void update(Observable arg0, Object arg1) {
		// TODO Auto-generated method stub
		
	}
	
}