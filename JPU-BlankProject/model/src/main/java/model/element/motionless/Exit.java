package model.element.motionless;

import model.element.Permeability;
import model.element.Sprite;

public class Exit extends MotionlessElement  {

    private static final Sprite SPRITE = new Sprite('w', "Wall.jpg");
	
	public Exit() {
		super(SPRITE, Permeability.BLOCKING);
		
	}
}
