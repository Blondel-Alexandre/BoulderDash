package controller;

import java.awt.Point;
import java.awt.event.KeyAdapter;
import contract.ControllerOrder;
import contract.IController;
import contract.IDwarfMiner;
import contract.IElement;
import contract.IModel;
import contract.IView;


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
		this.view.printMessage("Welcome in BoulderDash");
	}
	
	public void gameOver() {
		this.view.printMessage("Game Over");
	}
	
	public void win() {
		this.view.printMessage("You Win");
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

    private IModel getModel() {
        return this.model;
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
		boolean canMove = true;
		Point position = null;
		boolean isBrokenDirt = false;
		switch (controllerOrder) {
			case UP:
				position = new Point(this.getModel().getDwarf().getX(), this.getModel().getDwarf().getY()-1);		
				for(IElement element: this.getModel().elementList()) {
					if(element.getX() == position.getX() && element.getY() == position.getY()) {
						switch(element.getElementType()) {
						case Dirt:
							canMove = true;
							break;
						case Wall:
							canMove = false;
							break;
						case Rock:
							canMove = false;
							break;
						case Diamond:
							canMove = true;
							break;
						case Enemy:
							gameOver();
							break;
						case Exit:
							win();
							break;
						case BrokenDirt:
							canMove = true;
							isBrokenDirt = true;
						break;
						default:
							break;
						}
					}
				}
				if(canMove == true) {
					((IDwarfMiner) this.getModel().getDwarf()).moveUpPlayer();
				}
				break;
			case DOWN:
				position = new Point(this.getModel().getDwarf().getX(), this.getModel().getDwarf().getY()+1);
				for(IElement element: this.getModel().elementList()) {
					if(element.getX() == position.getX() && element.getY() == position.getY()) {
						switch(element.getElementType()) {
						case Dirt:
							canMove = true;
							break;
						case Wall:
							canMove = false;
							break;
						case Rock:
							canMove = false;
							break;
						case Diamond:
							canMove = true;
							break;
						case Enemy:
							gameOver();
							break;
						case BrokenDirt:
							canMove = true;
							isBrokenDirt = true;
						break;
						default:
							break;
						}
					}
				}
				if(canMove == true) {
					((IDwarfMiner) this.getModel().getDwarf()).moveDownPlayer();
				}	
				break;
			case LEFT:
				position = new Point(this.getModel().getDwarf().getX()-1, this.getModel().getDwarf().getY());
				for(IElement element: this.getModel().elementList()) {
					if(element.getX() == position.getX() && element.getY() == position.getY()) {
						switch(element.getElementType()) {
						case Dirt:
							canMove = true;
							break;
						case Wall:
							canMove = false;
							break;
						case Rock:
							canMove = false;
							break;
						case Diamond:
							canMove = true;
							break;
						case Enemy:
							gameOver();
							break;
						case BrokenDirt:
							canMove = true;
							isBrokenDirt = true;
						break;
						default:
							break;
						}
					}
				}
				if(canMove == true) {
					((IDwarfMiner) this.getModel().getDwarf()).moveLeftPlayer();
				}
				break;
			case RIGHT:
				position = new Point(this.getModel().getDwarf().getX()+1, this.getModel().getDwarf().getY());
				for(IElement element: this.getModel().elementList()) {
					if(element.getX() == position.getX() && element.getY() == position.getY()) {
						switch(element.getElementType()) {
						case Dirt:
							canMove = true;
							break;
						case Wall:
							canMove = false;
							break;
						case Rock:
							canMove = false;
							break;
						case Diamond:
							canMove = true;
							break;
						case Enemy:
							gameOver();
							break;
						case BrokenDirt:
							canMove = true;
							isBrokenDirt = true;
						break;
						default:
							break;
						}
					}
				}
				if(canMove == true) {
					((IDwarfMiner) this.getModel().getDwarf()).moveRightPlayer();
				}	
				break;
			default:
				break;
		}if(isBrokenDirt == false) {
			if(canMove == true) {
				this.getModel().elementList().add(this.getModel().createBrokenDirt((int) position.getX(), (int) position.getY()));	
			}			
		}System.out.println(this.getModel().elementList().size() +"oui"+ " : taille de la liste d'éléments");
	}
}
