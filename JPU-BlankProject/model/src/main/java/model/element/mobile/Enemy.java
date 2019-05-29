package model.element.mobile;

import model.element.Permeability;
import model.element.Sprite;

public class Enemy extends Mobile{

    private static final Sprite SPRITE = new Sprite('e', "enemy1.png");
	
	public Enemy() {
		super(SPRITE, Permeability.BLOCKING);
		this.getSprite().loadImage();
	}

}
