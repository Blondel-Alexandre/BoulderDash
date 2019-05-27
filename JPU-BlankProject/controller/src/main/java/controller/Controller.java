package controller;

import java.awt.event.KeyAdapter;

import contract.ControllerOrder;
import contract.IController;
import contract.IModel;
import contract.IView;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;



/**
 * The Class Controller.
 */
public final class Controller extends KeyAdapter implements IController  {

	/** The view. */
	private IView		view;

	/** The model. */
	private IModel	model;

	/**
	 * Instantiates a new controller.
	 *
	 * @param view
	 *          the view
	 * @param model
	 *          the model
	 */
	public Controller(final IView view, final IModel model) {
		this.setView(view);
		this.setModel(model);
	}

	/**
     * Control.
     */
	/*
	 * (non-Javadoc)
	 *
	 * @see contract.IController#control()
	 */
	public void control() {
<<<<<<< HEAD
		this.view.printMessage("BoulderDash");
=======
		this.view.printMessage("Appuyer sur les touches '1', '2', '3', '4' ou '5' pour sélectionner le niveau correspondant");
>>>>>>> d1ea8e309193b25a4a785b53c7bdf20d8fbc608e
	}

	/**
     * Sets the view.
     *
     * @param pview
     *            the new view
     */
	private void setView(final IView pview) {
		this.view = pview;
	}

	/**
	 * Sets the model.
	 *
	 * @param model
	 *          the new model
	 */
	private void setModel(final IModel model) {
		this.model = model;
	}

	/**
     * Order perform.
     *
     * @param controllerOrder
     *            the controller order
     */
	/*
	 * (non-Javadoc)
	 *
	 * @see contract.IController#orderPerform(contract.ControllerOrder)
	 */
	public void orderPerform(final ControllerOrder controllerOrder) {
		switch (controllerOrder) {
			case A:
				this.model.loadHelloWorld("GB");
				break;
			case B:
				this.model.loadHelloWorld("FR");
				break;
			case C:
				this.model.loadHelloWorld("DE");
				break;
			case D:
				this.model.loadHelloWorld("ID");
				break;
			case E:
				this.model.loadHelloWorld("ID");
				break;
			default:
				break;
		}
	}
	
	public void KeyPressed(KeyEvent motion)
	{
		int key =motion.getKeyCode();
		if (key == KeyEvent.VK_UP)
		{
			character.moveUp();
		}
		if (key == KeyEvent.VK_RIGHT) {
			character.moveRight();
		}
		if (key == KeyEvent.VK_LEFT) {
			character.moveLeft();
		}
		if(key == KeyEvent.VK_DOWN){	
			character.moveDown();
		}
	}
	public void KeyRealeased(KeyEvent motion)
	{
		int key =motion.getKeyCode();
		if (key == KeyEvent.VK_UP)
		{
			character.doNothing();
		}
		if (key == KeyEvent.VK_RIGHT) {
			character.doNothing();
		}
		if (key == KeyEvent.VK_LEFT) {
			character.doNothing();
		}
		if(key == KeyEvent.VK_DOWN){	
			character.doNothing();
		}
	}
	

}
