package model.element.mobile;


import contract.ElementType;
import contract.IMobile;
import contract.Permeability;
import model.element.Element;
import model.element.Sprite;

public class Mobile extends Element implements IMobile {
	
	/**
	 * Instantiates a new diamond.
	 * @param sprite
	 * 		Sprite
	 * 
	 * @param permeability
	 * 		Permeability
	 * 
	 * @param elementType
	 * 		ElementType
	 * 
	 */

	public Mobile(final Sprite sprite, final Permeability permeability, final ElementType elementType) {
        super(sprite, permeability, elementType);
	}

	/**
	 * Move up the mobile element
	 * 
	 */
@Override
	public void moveUp()
	{
		this.setY(this.getY()-1);
	}

	/**
	 * Move down the mobile element.
	 * 
	 */

@Override
	public void moveDown()
	{
		this.setY(this.getY()+1);
	}

	/**
	 * Move the mobile element to the right.
	 * 
	 */
@Override
	
	public void moveRight()
	{
		this.setX(this.getX()+1);
	}

	/**
	 * Move the mobile element to the left.
	 * 
	 */

@Override	
	public void moveLeft()
	{
		this.setX(this.getX()-1);
	}

}
