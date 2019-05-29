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

<<<<<<< HEAD
    private static final Sprite SPRITE = new Sprite('c', "Character.png");
=======
    private static final Sprite SPRITE = new Sprite('c', "C:\\Users\\Avantro\\Desktop\\Character.png");
>>>>>>> f3afffef53f77dca5acb4527c0a366aae0b607f4
	
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



