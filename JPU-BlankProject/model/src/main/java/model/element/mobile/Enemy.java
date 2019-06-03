package model.element.mobile;

import contract.ElementType;
import contract.Permeability;
import model.element.Sprite;

public class Enemy extends Mobile{


	/** The sprite */
    private static final Sprite SPRITE = new Sprite('e', "enemy1.png");

	
	/**
	 * Instantiates a new diamond.
	 */
            
	
	public Enemy() {
		super(SPRITE, Permeability.BLOCKING, ElementType.Enemy);
		this.getSprite().loadImage();
	}

}
