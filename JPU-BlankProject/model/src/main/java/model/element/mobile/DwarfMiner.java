package model.element.mobile;


import contract.IDwarfMiner;
import contract.IMobile;
import model.element.Permeability;
import model.element.Sprite;

public class DwarfMiner extends Mobile implements IDwarfMiner

{

static int numberLife =2;


public int getNumberLife() {
	return numberLife;
}
public void setNumberLife(int numberLife) {
	DwarfMiner.numberLife = numberLife;
}

    private static final Sprite SPRITE = new Sprite('c', "C:\\Users\\Avantro\\Desktop\\Character.png");
	
	public DwarfMiner() {
		super(SPRITE, Permeability.BLOCKING);
	}
		

/*public void setNumberLife(int numberLife) {
	this.numberLife = numberLife;
}*/

@Override
public void moveUpPlayer() {
	super.moveUp();
	
}

@Override
public void moveLeftPlayer() {
super.moveLeft();	
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



