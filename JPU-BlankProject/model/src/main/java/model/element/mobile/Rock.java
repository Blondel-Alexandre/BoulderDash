package model.element.mobile;

import model.element.Permeability;
import model.element.Sprite;

public class Rock extends Mobile {

    private static final Sprite SPRITE = new Sprite('r', "E:\\Java\\BoulderDash\\BoulderDash\\JPU-BlankProject\\model\\resource\\Stone.png");
	
	public Rock() {
		super(SPRITE, Permeability.BLOCKING);
		
	}
}
