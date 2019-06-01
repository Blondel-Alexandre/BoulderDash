package model.element.motionless;

import contract.ElementType;
import contract.Permeability;
import model.element.Sprite;

public class Exit extends MotionlessElement  {

    private static final Sprite SPRITE = new Sprite('p', "Monster1.png");
	
	public Exit() {
		super(SPRITE, Permeability.BLOCKING, ElementType.Exit);
		this.getSprite().loadImage();
	}
}
