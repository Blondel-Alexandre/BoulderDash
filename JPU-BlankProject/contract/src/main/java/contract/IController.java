package contract;

/**
 * The Interface IController.
 *
 * @author Groupe 4 A1 - Arras
 */

public interface IController {

	/**
	 * Control.
	 */
	public void control();

	/**
	 * Order perform.
	 *
	 * @param controllerOrder
	 *          the controller order
	 */
	
	public void orderPerform(ControllerOrder controllerOrder);
}
