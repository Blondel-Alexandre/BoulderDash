package contract;

/**
 * The Interface IMobile
 *
 * @author Groupe 4 A1 - Arras
 */

public interface IMobile  {

	/**
	 * Gets the x.
	 *
	 * @return the x
	 */
	
	int getX();
		
	/**
	 * Gets the y.
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
	 * Move up the element
	 */
	
	void moveUp();
	
	/**
	 * Move to the left the element
	 */
	
	void moveLeft();
	
	/**
	 * Move down the element
	 */
	
	void moveDown();
	
	/**
	 * Move to the right the element
	 */
	
	void moveRight();

}
