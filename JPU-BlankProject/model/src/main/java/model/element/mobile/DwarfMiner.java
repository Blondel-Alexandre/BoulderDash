package model.element.mobile;

import contract.IDwarfMiner;
import model.element.Permeability;
import model.element.Sprite;

public class DwarfMiner extends Mobile implements IDwarfMiner
{

static int numberLife =2;
private static final Sprite SPRITE = new Sprite('c', "C:\\Users\\Avantro\\Desktop\\Dwarf.png");


public DwarfMiner() {
	super(SPRITE, Permeability.BLOCKING);
}
public int getNumberLife() {
	return numberLife;
}
<<<<<<< HEAD
public void setNumberLife(int numberLife) {
	DwarfMiner.numberLife = numberLife;
}
=======
/*public void setNumberLife(int numberLife) {
	this.numberLife = numberLife;
}*/

>>>>>>> 91b3597abdf1779749cdc7bebced5060c1ad4046
}

