package model.element.motionless;

import contract.ElementType;
import contract.Permeability;
import model.element.Sprite;

public class Wall extends MotionlessElement  {
	

  private static final Sprite SPRITE = new Sprite('w', "Wall.png");
	
	public Wall() {
		super(SPRITE, Permeability.BLOCKING, ElementType.Wall);
		this.getSprite().loadImage();
	}
}
