package model.element.mobile;


import model.element.Element;

public class Mobile extends Element {
	

	public Mobile() {
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

}
