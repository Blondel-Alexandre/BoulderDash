package model.element.mobile;


import contract.IMobile;
import model.element.Element;
import model.element.Permeability;
import model.element.Sprite;

public class Mobile extends Element implements IMobile {
	

	public Mobile(final Sprite sprite, final Permeability permeability) {
        super(sprite, permeability);
		// TODO Auto-generated constructor stub
	}


	public void moveUp()
	{
		this.setY(this.getY()-1*16);
		System.out.println(getY());
	}
	
	public void moveDown()
	{
		this.setY(this.getY()+1*16);
	}
	
	public void moveRight()
	{
		this.setY(this.getY()-1*16);
	}
	
	public void moveLeft()
	{
		this.setY(this.getY()+1*16);
	}

	public void doNothing()
	{
		this.setX(x);
		this.setY(y);
	}

}
