package controller;

import java.awt.event.KeyAdapter;

import contract.ControllerOrder;
import contract.IController;
import contract.IModel;
import contract.IView;
import java.awt.event.KeyEvent;



/**
 * The Class Controller.
 */
public final class Controller extends KeyAdapter implements IController  {

	/** The view. */
	private IView view;

	/** The model. */
	private IModel model;

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

		this.view.printMessage("BoulderDash");


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
			Character.moveUp();
		}
		if (key == KeyEvent.VK_RIGHT) {
			Character.moveRight();
		}
		if (key == KeyEvent.VK_LEFT) {
			Character.moveLeft();
		}
		if(key == KeyEvent.VK_DOWN){	
			Character.moveDown();
		}
	}
	public void KeyRealeased(KeyEvent motion)
	{
		int key =motion.getKeyCode();
		if (key == KeyEvent.VK_UP)
		{
			Character.doNothing();
		}
		if (key == KeyEvent.VK_RIGHT) {
			Character.doNothing();
		}
		if (key == KeyEvent.VK_LEFT) {
			Character.doNothing();
		}
		if(key == KeyEvent.VK_DOWN){	
			Character.doNothing();
		}
	}
	

}
