package contract;

import java.util.Observer;

/**
 * The Interface IView.
 *
 * @author Groupe 4 A1 - Arras
 */

public interface IView {

	/**
	 * Prints the message.
	 *
	 * @param message
	 *          the message
	 */
	
	void printMessage(final String message);

	/**
	 * Gets the observer
	 *
	 * @return observer
	 * 
	 */
	
	Observer getObserver();
}
