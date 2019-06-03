package model.element.mobile;

import contract.ElementType;
import contract.IMobile;
import contract.Permeability;
import model.element.Sprite;

public class Rock extends Mobile implements IMobile{

	/** The sprite */
    private static final Sprite SPRITE = new Sprite('r', "Stone.png");
    
	/**
	 * Instantiates a new rock.
	 */
    
	public Rock() {
		super(SPRITE, Permeability.BLOCKING, ElementType.Rock);
		this.getSprite().loadImage();
	}
	
}
