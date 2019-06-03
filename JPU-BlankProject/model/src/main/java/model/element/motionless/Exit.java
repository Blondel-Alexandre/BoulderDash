package model.element.motionless;

import contract.ElementType;
import contract.Permeability;
import model.element.Sprite;

public class Exit extends MotionlessElement  {
	
	/** The sprite */
    private static final Sprite SPRITE = new Sprite('p', "PortalWithBrokendirt.png");
	
	/**
	 * Instantiates a new exit.
	 */
    
	public Exit() {
		super(SPRITE, Permeability.BLOCKING, ElementType.Exit);
		this.getSprite().loadImage();
	}
}
