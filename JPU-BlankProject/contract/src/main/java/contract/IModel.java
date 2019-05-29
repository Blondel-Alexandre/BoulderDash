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
	 */
	Observable getObservable();
	
	ArrayList<IElement> getSprites();

<<<<<<< HEAD
	ArrayList<IElement> ListLoader();
=======
	ArrayList<IElement> zob();
	
	IMobile getDwarf();
>>>>>>> f3afffef53f77dca5acb4527c0a366aae0b607f4
}
