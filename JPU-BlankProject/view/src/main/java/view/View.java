package view;

import java.awt.event.KeyEvent;
import java.util.Observer;

import javax.swing.SwingUtilities;

import contract.ControllerOrder;
import contract.IController;
import contract.IElement;
import contract.IModel;
import contract.IView;

/**
 * The Class View.z
 *
 * @author Jean-Aymeric Diet
 */
public final class View implements IView, Runnable {

	/** The frame. */
	private final ViewFrame viewFrame;

	/**
	 * Instantiates a new view.
	 *
	 * @param model
	 *          the model
	 */
	public View(final IModel model) {
		this.viewFrame = new ViewFrame(model);
		SwingUtilities.invokeLater(this);
	}

	/**
	 * Key code to controller order.
	 *
	 * @param keyCode
	 *          the key code
	 * @return the controller order
	 */
	protected static ControllerOrder keyCodeToControllerOrder(final int keyCode) {
		switch (keyCode) {
			case KeyEvent.VK_UP:
				return ControllerOrder.UP;
			case KeyEvent.VK_1:
				return ControllerOrder.A;
			case KeyEvent.VK_2:
				return ControllerOrder.B;
			case KeyEvent.VK_3:
				return ControllerOrder.C;
			case KeyEvent.VK_4:
				return ControllerOrder.D;
			case KeyEvent.VK_5:
				return ControllerOrder.E;
			case KeyEvent.VK_DOWN:
				return ControllerOrder.DOWN;
			case KeyEvent.VK_LEFT:
				return ControllerOrder.LEFT;
			case KeyEvent.VK_RIGHT:
				return ControllerOrder.RIGHT;
			default:
				return ControllerOrder.NO;
				//doNothing
		}
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see contract.IView#printMessage(java.lang.String)
	 */
	public void printMessage(final String message) {
		this.viewFrame.printMessage(message);
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see java.lang.Runnable#run()
	 */
	public void run() {
		this.viewFrame.setVisible(true);
	}

	/**
	 * Sets the controller.
	 *
	 * @param controller
	 *          the new controller
	 */
	public void setController(final IController controller) {
		this.viewFrame.setController(controller);
		
	}
		@Override
		public Observer getObserver() {
			return this.viewFrame.getObserver();
		}

		/**
		 * Method to set the controller
		 * @param controller
		 * 		Controller interface
		 */
	}

