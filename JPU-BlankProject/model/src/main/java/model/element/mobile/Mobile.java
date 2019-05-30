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

@Override
	public void moveUp()
	{
		this.setY(this.getY()-1);
	}
@Override
	
	public void moveDown()
	{
		this.setY(this.getY()+1);
	}
@Override
	
	public void moveRight()
	{
		this.setY(this.getY()-1);
	}
@Override	
	public void moveLeft()
	{
		this.setY(this.getY()+1);
	}


	@Override
	public void doNothing() {
		// TODO Auto-generated method stub
		
	}


}
