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
public void setNumberLife(int numberLife) {
	DwarfMiner.numberLife = numberLife;
}
}

