package contract;

import java.util.ArrayList;
import java.util.Observable;

import entity.Level;

/**
 * The Interface IModel.
 *
 * @author Jean-Aymeric Diet
 */
public interface IModel {

	/**
	 * Gets the hello world.
	 *
	 * @return the helloworld entity
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

	int getScore();
	void setScore(int Score);
	
	ArrayList<IElement> getSprites();

	ArrayList<IElement> elementList();
	IMobile getDwarf();
	Observable getObservable();
	IElement getElement();
	IElement createBrokenDirt(int x, int y);
	public void collectDiamond();

}
