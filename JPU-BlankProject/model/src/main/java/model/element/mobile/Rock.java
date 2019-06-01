package model.element.mobile;

import contract.ElementType;
import contract.Permeability;
import model.element.Sprite;

public class Rock extends Mobile {

    private static final Sprite SPRITE = new Sprite('r', "Stone.png");
	
	public Rock() {
		super(SPRITE, Permeability.BLOCKING, ElementType.Rock);
		this.getSprite().loadImage();
	}
}
