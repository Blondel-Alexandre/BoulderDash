package model.element.mobile;

import contract.ElementType;
import contract.Permeability;
import model.element.Sprite;

public class DwarfMiner extends Mobile{


	/** The sprite */
    private static final Sprite SPRITE = new Sprite('c', "Character.png");

	/**
	 * Instantiates a new Dwarf Miner.
	 */
    
	public DwarfMiner() {
		super(SPRITE, Permeability.BLOCKING, ElementType.DwarfMiner);
		this.getSprite().loadImage();
	}
		

}
	




