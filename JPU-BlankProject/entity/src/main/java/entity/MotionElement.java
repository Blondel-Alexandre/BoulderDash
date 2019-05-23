package entity;

import java.util.Observable;

public class MotionElement extends Observable {

	public int x;
	public int y;
	public int Weight;
	public int Leigth;


	public MotionElement()
	{
		
	}
	
	public void moveUp(int y)
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
	
}