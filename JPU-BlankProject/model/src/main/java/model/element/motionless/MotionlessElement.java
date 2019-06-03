package model.element.motionless;

import contract.Permeability;
import contract.ElementType;
import model.element.Element;
import model.element.Sprite;

public abstract class MotionlessElement extends Element{

	/**
	 * Instantiates a new motionless element.
	 * @param sprite
	 * 		Sprite
	 * 
	 * @param permeability
	 * 		Permeability
	 * 
	 * @param elementType
	 * 		ElementType
	 * 
	 */
    public MotionlessElement(final Sprite sprite, final Permeability permeability, final ElementType elementType) {
        super(sprite, permeability, elementType);
    }
	}
