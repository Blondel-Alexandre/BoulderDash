package contract;

import java.awt.Image;
import java.util.Observable;

public interface IElement {
	
	int getX();
	/**
	 * Get x.
	 */
	int getY();
	/**
	 * Get y.
	 */
	void setX(int x);
	/**
	 * Set x.
	 *
	 * @param x the horizontal position.
	 *          x
	 */
	void setY(int y);
	/**
	 * Set Y.
	 *
	 * @param y the vertical position.
	 *          y
	 */
	Image getImage();
	/**
	 * Get the image.
	 */
	String getFileName();
	/**
	 * Get the filename of the image.
	 */
	Observable getObservable();
	/**
	 * Get the observable.
	 */
	ElementType getElementType();
	/**
	 * Get the ElementType from the enum ElementType.
	 */
	
}
