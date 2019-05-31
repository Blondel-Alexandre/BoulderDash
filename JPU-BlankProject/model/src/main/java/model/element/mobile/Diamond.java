package model.element.mobile;

import contract.Permeability;
import model.element.Sprite;

public class Diamond extends Mobile {

    private static final Sprite SPRITE = new Sprite('i', "Diamond.png");
	
	public Diamond() {
		super(SPRITE, Permeability.BLOCKING);
		this.getSprite().loadImage();
	}
}
