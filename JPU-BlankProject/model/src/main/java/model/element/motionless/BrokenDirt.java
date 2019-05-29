package model.element.motionless;

import model.element.Permeability;
import model.element.Sprite;

public class BrokenDirt extends MotionlessElement{

    private static final Sprite SPRITE = new Sprite('b', "C:\\Users\\Avantro\\Desktop\\BrokenDirt.png");
	
	public BrokenDirt() {
		super(SPRITE, Permeability.BLOCKING);
		
	}
	}


