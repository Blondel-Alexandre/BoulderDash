package model.element.mobile;


import contract.ElementType;
import contract.Permeability;
import model.element.Sprite;

public class DwarfMiner extends Mobile{

static int numberLife =2;


public int getNumberLife() {
	return numberLife;
}
public void setNumberLife(int numberLife) {
	DwarfMiner.numberLife = numberLife;
}

    private static final Sprite SPRITE = new Sprite('c', "Character.png");

	
	public DwarfMiner() {
		super(SPRITE, Permeability.BLOCKING, ElementType.DwarfMiner);
		this.getSprite().loadImage();
	}
		

/*public void setNumberLife(int numberLife) {
	this.numberLife = numberLife;
}*/
/*
@Override
public void moveUpPlayer() {
	super.moveUp();
	//System.out.println(getY());

	
}

@Override
public void moveLeftPlayer() {
super.moveLeft();
//System.out.println(y);

}

@Override
public void moveDownPlayer() {
super.moveDown();	
}
@Override
public void moveRightPlayer() {
super.moveRight();	
}
*/
	
}



