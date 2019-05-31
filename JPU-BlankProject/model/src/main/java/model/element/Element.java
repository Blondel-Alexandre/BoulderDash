package model.element;

import java.awt.Image;
import java.util.Observable;

import contract.IElement;



public class Element extends Observable implements IElement {

	private Sprite sprite;
	private Permeability permeability;
	protected int x;
	protected int y;

    public Element(final Sprite sprite, final Permeability permeability) {
        this.setSprite(sprite);
        this.setPermeability(permeability);
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
    private void setSprite(final Sprite sprite) {
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
    private void setPermeability(final Permeability permeability) {
        this.permeability = permeability;
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
		System.out.println(x + "je suis X");
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


	
	

