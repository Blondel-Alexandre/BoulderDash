package model.element.mobile;


import contract.IDwarfMiner;
import contract.IMobile;
import model.element.Permeability;
import model.element.Sprite;

public class DwarfMiner extends Mobile implements IDwarfMiner{

static int numberLife =2;


public int getNumberLife() {
	return numberLife;
}
public void setNumberLife(int numberLife) {
	DwarfMiner.numberLife = numberLife;
}

    private static final Sprite SPRITE = new Sprite('c', "Character.png");

	
	public DwarfMiner() {
		super(SPRITE, Permeability.BLOCKING);
		this.getSprite().loadImage();
	}
		

/*public void setNumberLife(int numberLife) {
	this.numberLife = numberLife;
}*/

@Override
public void moveUpPlayer() {
	super.moveUp();
	System.out.println(getY());

	
}

@Override
public void moveLeftPlayer() {
super.moveLeft();
System.out.println(getY());

}

@Override
public void moveDownPlayer() {
super.moveDown();	
}
@Override
public void moveRightPlayer() {
super.moveRight();	
}

	
}



