package controller;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import contract.ControllerOrder;
import contract.IController;
import contract.IDwarfMiner;
import contract.IMobile;
import contract.IModel;
import contract.IView;
//import java.awt.event.KeyEvent;



/**
 * The Class Controller.
 */
public final class Controller extends KeyAdapter implements IController, IDwarfMiner  {

	/** The view. */
	private IView view;

	/** The model. */
	private IModel model;

	private IDwarfMiner dwarfminer;

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
			case UP:
				this.dwarfminer.moveUp();
				break;
			case DOWN:
				this.dwarfminer.moveDown();
				break;
			case LEFT:
				this.dwarfminer.moveLeft();
				break;
			case RIGHT:
				this.dwarfminer.moveRight();
				break;
			default:
				break;
		}
	}

	@Override
	public void moveUp() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void moveLeft() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void moveDown() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void moveRight() {
		// TODO Auto-generated method stub
		
	}




/*	
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
	*/

}
