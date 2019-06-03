package model.element.motionless;

import contract.ElementType;
import contract.Permeability;
import model.element.Sprite;

public class BrokenDirt extends MotionlessElement{

    private static final Sprite SPRITE = new Sprite('b', "Brokendirt.png");
	
	public BrokenDirt() {
		super(SPRITE, Permeability.BLOCKING, ElementType.BrokenDirt);
		this.getSprite().loadImage();
	}
	}


