package model.element.motionless;

import model.element.Permeability;
import model.element.Sprite;

public class BrokenDirt extends MotionlessElement{

    private static final Sprite SPRITE = new Sprite('b', "Brokendirt.png");
	
	public BrokenDirt() {
		super(SPRITE, Permeability.BLOCKING);
		this.getSprite().loadImage();
	}
	}


