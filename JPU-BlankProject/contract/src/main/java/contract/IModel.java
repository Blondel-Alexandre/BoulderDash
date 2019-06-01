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

	
	ArrayList<IElement> getSprites();
<<<<<<< HEAD

	ArrayList<IElement> elementList();

=======
	ArrayList<IElement> elementList();
>>>>>>> c7abc14db61243a9d52256eac4cce22f5fe95c6f
	IMobile getDwarf();
	Observable getObservable();
	IElement getElement();
	IElement createBrokenDirt(int x, int y);


}
