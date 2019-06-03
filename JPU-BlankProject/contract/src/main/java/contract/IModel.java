package contract;

import java.util.ArrayList;
import java.util.Observable;
import contract.IElement;
import entity.Level;

/**
 * The Interface IModel.
 *
 * @author Groupe 4 A1 - Arras
 */
public interface IModel {

	/**
	 * Gets the level.
	 *
	 * @return the level entity
	 */
	Level getHelloWorld();

	/**
	 * Load the message.
	 *
	 * @param code
	 *          the code
	 */
	
	void loadHelloWorld(String code);

	/**
	 * Gets the observable.
	 *
	 * @return the observable
	 * 
	 *
	 */

	Observable getObservable();
	
	/**
	 * Gets the score.
	 *
	 * @return the score
	 * 
	 *
	 */
	
	int getScore();

	/**
	 * Sets the score.
	 *
	 * @param Score
	 *          the score
	 */
	
	void setScore(int Score);

	/**
	 * Modify the score
	 * 
	 *
	 */
	
	void collectDiamond();
	
	/**
	 * Gets the dwarf in IMobile.
	 *
	 * @return the dwarf
	 * 
	 *
	 */
	
	IMobile getDwarf();

	/**
	 * Gets the dwarf in IElement.
	 *
	 * @return the dwarf
	 * 
	 *
	 */
	
	IElement getElement();
	
	/**
	 * Create a Broken Dirt.
	 *
	 * @param x
	 * 			the x position
	 * 
	 * @param y
	 * 			the y position
	 * 
	 * @return
	 * 			return brokenDirt
	 *
	 */

	IElement createBrokenDirt(int x, int y);

	/**  Implements the elements in the map 
	 * 
	 * @return
	 * 			return getSprites
	 *
	 */
	ArrayList<IElement> getSprites();
	
	/**  The ArrayList of the elements in the map 
	 * 
	 * @return
	 * 			return elementList
	 *
	 */
	ArrayList<IElement> elementList();
	

}
