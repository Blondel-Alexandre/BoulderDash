package model.element.motionless;

import contract.Permeability;
import contract.ElementType;
import model.element.Element;
import model.element.Sprite;

public abstract class MotionlessElement extends Element{

	/**
	 * Instantiates a new motionless element.
	 */
    public MotionlessElement(final Sprite sprite, final Permeability permeability, final ElementType elementType) {
        super(sprite, permeability, elementType);
    }
	}
