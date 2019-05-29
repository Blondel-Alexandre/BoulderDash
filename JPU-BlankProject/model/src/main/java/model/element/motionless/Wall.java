package model.element.motionless;

import model.element.Permeability;
import model.element.Sprite;

public class Wall extends MotionlessElement  {
	
    private static final Sprite SPRITE = new Sprite('w', "E:\\Java\\BoulderDash\\BoulderDash\\JPU-BlankProject\\model\\resource\\Wall.png");
	
	public Wall() {
		super(SPRITE, Permeability.BLOCKING);
		
		
	}
}
