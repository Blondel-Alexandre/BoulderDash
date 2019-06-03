package model.element;

import java.awt.Image;
import java.util.Observable;

import contract.ElementType;
import contract.IElement;
import contract.Permeability;



public class Element extends Observable implements IElement {

	private Sprite sprite;
	private Permeability permeability;
	private ElementType elementType;
	protected int x;
	protected int y;

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

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
		this.setChanged();
		this.notifyObservers();
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
		this.setChanged();
		this.notifyObservers();
	}
	
	public Observable getObservable() {
        return this;
    }

	@Override
	public String getFileName() {
		return this.getSprite().getImageName();
	}




}


	
	

