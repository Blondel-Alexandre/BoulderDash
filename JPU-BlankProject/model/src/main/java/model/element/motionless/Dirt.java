package model.element.motionless;

import model.element.Permeability;
import model.element.Sprite;

public class Dirt extends MotionlessElement  {
	
    private static final Sprite SPRITE = new Sprite('d', "E:\\Java\\BoulderDash\\BoulderDash\\JPU-BlankProject\\model\\resource\\Dirt.png");
	
	public Dirt() {
		super(SPRITE, Permeability.BLOCKING);
		
	}
}
