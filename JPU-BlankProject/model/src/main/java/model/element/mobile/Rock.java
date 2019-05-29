package model.element.mobile;

import model.element.Permeability;
import model.element.Sprite;

public class Rock extends Mobile {

    private static final Sprite SPRITE = new Sprite('w', "Wall.jpg");
	
	public Rock() {
		super(SPRITE, Permeability.BLOCKING);
		
	}
}
