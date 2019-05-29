package model.element.mobile;

import contract.IDwarfMiner;
import model.element.Permeability;
import model.element.Sprite;

public class DwarfMiner extends Mobile implements IDwarfMiner
{

static int numberLife =2;


    private static final Sprite SPRITE = new Sprite('c', "E:\\Java\\BoulderDash\\BoulderDash\\JPU-BlankProject\\model\\resource\\Character.png");
	
	public DwarfMiner() {
		super(SPRITE, Permeability.BLOCKING);
	}
		
public void setNumberLife(int numberLife) {
	DwarfMiner.numberLife = numberLife;
}
/*public void setNumberLife(int numberLife) {
	this.numberLife = numberLife;
}*/

@Override
public void moveUp() {
	// TODO Auto-generated method stub
	
}

@Override
public void moveLeft() {
	// TODO Auto-generated method stub
	
}

@Override
public void moveDown() {
	// TODO Auto-generated method stub
	
}

@Override
public void moveRight() {
	// TODO Auto-generated method stub
	
}

}

