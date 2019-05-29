package model.element.mobile;

import model.element.Permeability;
import model.element.Sprite;

public class Enemy extends Mobile{

    private static final Sprite SPRITE = new Sprite('w', "Wall.jpg");
	
	public Enemy() {
		super(SPRITE, Permeability.BLOCKING);
		
	}

}
