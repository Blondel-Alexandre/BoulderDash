package model.element.mobile;

import contract.ElementType;
import contract.Permeability;
import model.element.Sprite;

public class Diamond extends Mobile {

	/** The sprite */
    private static final Sprite SPRITE = new Sprite('i', "Diamond.png");
    
	/**
	 * Instantiates a new diamond.
	 */
    
	public Diamond() {
		super(SPRITE, Permeability.BLOCKING, ElementType.Diamond);
		this.getSprite().loadImage();
	}
}
