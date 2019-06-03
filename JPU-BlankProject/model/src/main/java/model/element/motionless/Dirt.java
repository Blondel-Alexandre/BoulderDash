package model.element.motionless;

import contract.ElementType;
import contract.Permeability;
import model.element.Sprite;

public class Dirt extends MotionlessElement  {
	
    private static final Sprite SPRITE = new Sprite('d', "Dirt.png");
	
	public Dirt() {
		super(SPRITE, Permeability.BLOCKING, ElementType.Dirt);
		this.getSprite().loadImage();
	}
}
