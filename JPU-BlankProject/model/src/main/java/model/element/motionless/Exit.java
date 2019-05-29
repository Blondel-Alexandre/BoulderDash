package model.element.motionless;

import model.element.Permeability;
import model.element.Sprite;

public class Exit extends MotionlessElement  {

    private static final Sprite SPRITE = new Sprite('p', "E:\\Java\\BoulderDash\\BoulderDash\\JPU-BlankProject\\model\\resource\\Monster1.png");
	
	public Exit() {
		super(SPRITE, Permeability.BLOCKING);
		
	}
}
