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

	/**
	 * Instantiates a new Dwarf Miner.
	 */
    
	public DwarfMiner() {
		super(SPRITE, Permeability.BLOCKING, ElementType.DwarfMiner);
		this.getSprite().loadImage();
	}
		

/*public void setNumberLife(int numberLife) {
	this.numberLife = numberLife;*/
}
	




