package model.element.motionless;

import contract.ElementType;
import contract.Permeability;
import model.element.Sprite;

public class BrokenDirt extends MotionlessElement{

	/** The sprite */
    private static final Sprite SPRITE = new Sprite('b', "Brokendirt.png");
	
	/**
	 * Instantiates a new broken dirt.
	 */
    
	public BrokenDirt() {
		super(SPRITE, Permeability.PENETRABLE, ElementType.BrokenDirt);
		this.getSprite().loadImage();
	}
	}


