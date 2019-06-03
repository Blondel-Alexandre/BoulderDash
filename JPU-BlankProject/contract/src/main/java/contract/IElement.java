package contract;

/**
 * The Interface IElement
 *
 * @author Groupe 4 A1 - Arras
 */

import java.awt.Image;
import java.util.Observable;

public interface IElement{
	
	/**
	 * Gets the x.
	 *
	 * @return the x
	 */
	
	int getX();
		
	/**
	 * Gets the y.
	 * 
	 * @return the y
	 */
	
	int getY();
		
	/**
	 * Sets the x.
	 *
	 * @param x
	 *          the new x
	 */
	
	void setX(int x);
	
	/**
	 * Sets the y.
	 *
	 * @param y
	 *          the new y
	 */
	
	void setY(int y);
	
	/**
	 * Gets the image.
	 * 
	 * @return the image
	 * 
	 * 
	 */
	
	Image getImage();

	/**
	 * Get the filename of the image.
	 * 
	 * @return the filename
	 * 
	 * 
	 */
	
	String getFileName();
	
	/**
	 * Gets the observable.
	 *
	 * @return the observable
	 * 
	 *
	 */
	
	Observable getObservable();

	/**
	 * Get the ElementType from the enum ElementType.
	 * 
	 * @return the Element Type
	 * 
	 * 
	 */
	
	ElementType getElementType();
	
	Permeability getPermeability();

	
}
