package model.element.motionless;

import model.element.Permeability;
import model.element.Sprite;

public class BrokenDirt extends MotionlessElement{


    private static final Sprite SPRITE = new Sprite('b', "E:\\Java\\BoulderDash\\BoulderDash\\JPU-BlankProject\\model\\resource\\Brokendirt.png");
	
	public BrokenDirt() {
		super(SPRITE, Permeability.BLOCKING);
		
	}
	}


