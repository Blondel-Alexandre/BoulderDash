package model.element;

import java.awt.Image;
import java.util.Observable;

import contract.ElementType;
import contract.IElement;
import contract.Permeability;

/**
 * The Class Element.
 *
 * @author Groupe 4 A1 - Arras
 */

public class Element extends Observable implements IElement {
	
	/** The sprite */
	private Sprite sprite;
	private Permeability permeability;
	/** The Element Type */
	private ElementType elementType;
	/** The x position */
	protected int x;
	/** The y position */
	protected int y;
	
	/**
	 * Instantiates a new element.
	 */

    public Element(final Sprite sprite, final Permeability permeability, final ElementType elementType) {
        this.setSprite(sprite);
        this.setPermeability(permeability);
        this.setElementType(elementType);
    }
    
    /**
     * Gets the sprite.
     *
     * @return the sprite
     */
    public final Sprite getSprite() {
        return this.sprite;
    }
    /**
     * Sets the sprite.
     *
     * @param sprite
     *            the new sprite
     */
    public void setSprite(final Sprite sprite) {
        this.sprite = sprite;
    }

    /**
     * Gets the permeability.
     *
     * @return the permeability
     */
    public final Permeability getPermeability() {
        return this.permeability;
    }

    /**
     * Sets the permeability.
     *
     * @param permeability
     *            the new permeability
     */
    public void setPermeability(final Permeability permeability) {
        this.permeability = permeability;
    }

    /**
     * Gets the elementType.
     *
     * @return the elementType
     */
    public final ElementType getElementType() {
        return this.elementType;
    }

    /**
     * Sets the elementType.
     *
     * @param elementType
     *            the new elementType
     */
    public void setElementType(final ElementType elementType) {
        this.elementType = elementType;
    }

    /*
     * (non-Javadoc)
     * @see fr.exia.showboard.ISquare#getImage()
     */
 
    public final Image getImage() {
        return this.getSprite().getImage();
    }

	/**
	 * Gets the x.
	 * 
	 * @return the x
	 */
	public int getX() {
		return x;
	}
	
	/**
	 * Sets the x.
	 *
	 * @param x
	 *          the new x
	 */
	public void setX(int x) {
		this.x = x;
		this.setChanged();
		this.notifyObservers();
	}
	/**
	 * Gets the y.
	 * 
	 * @return the y
	 */
	public int getY() {
		return y;
	}
	
	/**
	 * Sets the y.
	 *
	 * @param y
	 *          the new y
	 */

	public void setY(int y) {
		this.y = y;
		this.setChanged();
		this.notifyObservers();
	}
	
	/**
	 * Gets the observable.
	 *
	 * @return the observable
	 * 
	 *
	 */
	
	public Observable getObservable() {
        return this;
    }

	/**
	 * Get the filename of the image.
	 * 
	 * @return the filename
	 * 
	 * 
	 */
	
	@Override
	public String getFileName() {
		return this.getSprite().getImageName();
	}
	
}


	
	

