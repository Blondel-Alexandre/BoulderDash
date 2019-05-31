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

		this.view.printMessage("JOUE");


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
				boolean canMove = true;
				Point p = new Point(this.getModel().getDwarf().getX(), this.getModel().getDwarf().getY()-1);
				for(IElement elem: this.getModel().elementLoader()) {
					if(elem.getX() == p.getX() && elem.getY() == p.getY()) {
						switch(elem.getTYpe()) {
						case Type.DIRT:
							canMove = false;
							break;
						}
					}
				}
				if(canMove) {
					((IDwarfMiner) this.getModel().getDwarf()).moveUpPlayer();
				}
				break;
			case DOWN:
				((IDwarfMiner) this.getModel().getDwarf()).moveDownPlayer();	
				break;
			case LEFT:
				((IDwarfMiner) this.getModel().getDwarf()).moveLeftPlayer();
				break;
			case RIGHT:
				((IDwarfMiner) this.getModel().getDwarf()).moveRightPlayer();	
				break;
			default:
				break;
		}
		

	}


















}
