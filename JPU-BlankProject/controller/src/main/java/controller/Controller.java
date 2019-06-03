package controller;

import java.awt.Point;
import java.awt.event.KeyAdapter;
import java.util.Random;
import contract.ControllerOrder;
import contract.ElementType;
import contract.IController;
import contract.IElement;
import contract.IMobile;
import contract.IModel;
import contract.IView;


/**
 * The Class Controller.
 */
public class Controller extends KeyAdapter implements IController, Runnable{

	/** The view. */
	private IView view;

	/** The model. */
	private IModel model;
	
	private Point position;
	
	private Point enemyPosition;
	
	private boolean canMove;
	
	private IElement currentElement;
	
	private IElement enemy;
	
	protected boolean end = false;
	
	

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
		System.exit(0);

	}
	
	public void win() {
		this.view.printMessage("You Win");
		System.exit(0);

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
	
	public void gravity() {

		boolean fall = false ;
		//Point rockPosition;
		do{
			for(IElement element : this.getModel().elementList()){
				if(element.getElementType() == ElementType.Rock) {
					if(element.getX() == element.getX() && element.getY() == element.getY()+1 && element.getElementType() == ElementType.BrokenDirt) {
						System.out.println("je peux deplacer");
				
						fall = true;
						}
					}
				}
			}while(fall == true);
		}
	/*
	 * (non-Javadoc)
	 *
	 * @see contract.IController#orderPerform(contract.ControllerOrder)
	 */
	
	public void orderPerform(final ControllerOrder controllerOrder) {
		//boolean canMove = true;
		boolean isBrokenDirt = false;
		switch (controllerOrder) {
			case UP:
				position = new Point(this.getModel().getDwarf().getX(), this.getModel().getDwarf().getY()-1);		
				for(IElement element: this.getModel().elementList()) {
					if(element.getX() == position.getX() && element.getY() == position.getY()) {
						currentElement = element;
						switch(element.getElementType()) {
						case Dirt:
							canMove = true;
							break;
						case Wall:
							canMove = false;
							break;
						case Rock:
							canMove = false;
							gravity();
							break;
						case Diamond:
							canMove = true;
							this.getModel().collectDiamond();
							break;
						case Enemy:
							gameOver();
							end = true;
							break;
						case Exit:
							canMove = false;
							end = true;
							if(this.getModel().getScore()==0)
							{
							win();
							}
							break;
						case BrokenDirt:
							canMove = true;
							isBrokenDirt = true;
						break;
						default:
							break;
						}
					}//this.getModel().elementList().remove(element);
				}if(canMove == true) {
					((IMobile) this.getModel().getDwarf()).moveUp();
				}
				break;
			case DOWN:
				position = new Point(this.getModel().getDwarf().getX(), this.getModel().getDwarf().getY()+1);
				for(IElement element: this.getModel().elementList()) {
					if(element.getX() == position.getX() && element.getY() == position.getY()) {
						currentElement = element;
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
							this.getModel().collectDiamond();
							break;
						case Enemy:
							gameOver();
							end = true;
							break;
						case Exit:
							canMove = false;
							end = true;
							if(this.getModel().getScore()==0)
							{
							win();
							}
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
					((IMobile) this.getModel().getDwarf()).moveDown();
				}	
				break;
			case LEFT:
				position = new Point(this.getModel().getDwarf().getX()-1, this.getModel().getDwarf().getY());
				for(IElement element: this.getModel().elementList()) {
					if(element.getX() == position.getX() && element.getY() == position.getY()) {
						currentElement = element;
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
							this.getModel().collectDiamond();
							break;
						case Enemy:
							end = true;
							gameOver();
							break;
						case Exit:
							canMove = false;
							end = true;
							if(this.getModel().getScore()==0)
							{
							win();
							}
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
					((IMobile) this.getModel().getDwarf()).moveLeft();
				}
				break;
			case RIGHT:
				position = new Point(this.getModel().getDwarf().getX()+1, this.getModel().getDwarf().getY());
				for(IElement element: this.getModel().elementList()) {
					if(element.getX() == position.getX() && element.getY() == position.getY()) {
						currentElement = element;
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
							this.getModel().collectDiamond();
							break;
						case Enemy:
							end = true;
							gameOver();
							break;
						case Exit:
							end = true;
							canMove = false;
							if(this.getModel().getScore()==0)
							{
							win();
							}
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
					((IMobile) this.getModel().getDwarf()).moveRight();
				}	
				break;
			default:
				break;
		}if(isBrokenDirt == false) {		
		}
		System.out.println(this.getModel().elementList().size() + " : taille de la liste d'éléments");
		replaceElement();
	}
	
	public void replaceElement() {
		if(canMove == true) {
			this.getModel().elementList().remove(currentElement);
			this.getModel().elementList().add(this.getModel().createBrokenDirt((int) position.getX(), (int) position.getY()));
		}
	}
	
	
	public void moveEnemy()
	{
		Random r = new Random();
		int random;
		random = r.nextInt(4);
		boolean isBrokenDirt = false;
		switch (random) {
			case 0:
				for(IElement currentEnemy : this.getModel().elementList()){
					if(currentEnemy.getElementType() == ElementType.Enemy) {
						enemy = currentEnemy;
						enemyPosition = new Point(currentEnemy.getX(), currentEnemy.getY()+1);
						for(IElement element : this.getModel().elementList()) {
							if(element.getX() == enemyPosition.getX() && element.getY() == enemyPosition.getY() && element.getElementType() == ElementType.BrokenDirt) {
								currentEnemy.setY(enemyPosition.y);
								canMove = true;
								try {
									Thread.sleep(250);
								}
								catch (Exception e) {
									e.printStackTrace();							
								}
								
							}
						}
					}
				}
				break;
			case 1:
				for(IElement currentEnemy : this.getModel().elementList()){
					if(currentEnemy.getElementType() == ElementType.Enemy) {
						System.out.println(currentEnemy);
						enemy = currentEnemy;
						enemyPosition = new Point(currentEnemy.getX(), currentEnemy.getY()-1);
						for(IElement element : this.getModel().elementList()) {
							if(element.getX() == enemyPosition.getX() && element.getY() == enemyPosition.getY() && element.getElementType() == ElementType.BrokenDirt) {
								currentEnemy.setY(enemyPosition.y);
								canMove = true;
								try {
									Thread.sleep(250);
								}
								catch (Exception e) {
									e.printStackTrace();							
								}
								
							}
						}
					}
				}
				break;
			case 2:
				for(IElement currentEnemy : this.getModel().elementList()){
					if(currentEnemy.getElementType() == ElementType.Enemy) {
						System.out.println(currentEnemy);
						enemy = currentEnemy;
						enemyPosition = new Point(currentEnemy.getX()+1, currentEnemy.getY());
						for(IElement element : this.getModel().elementList()) {
							if(element.getX() == enemyPosition.getX() && element.getY() == enemyPosition.getY() && element.getElementType() == ElementType.BrokenDirt) {
								currentEnemy.setX(enemyPosition.x);
								canMove = true;
								try {
									Thread.sleep(250);
								}
								catch (Exception e) {
									e.printStackTrace();							
								}
								
							}
						}
					}
				}
				break;
			case 3:
				for(IElement currentEnemy : this.getModel().elementList()){
					if(currentEnemy.getElementType() == ElementType.Enemy) {
						System.out.println(currentEnemy);
						enemy = currentEnemy;
						enemyPosition = new Point(currentEnemy.getX()-1, currentEnemy.getY());
						for(IElement element : this.getModel().elementList()) {
							if(element.getX() == enemyPosition.getX() && element.getY() == enemyPosition.getY() && element.getElementType() == ElementType.BrokenDirt) {
								currentEnemy.setX(enemyPosition.x);
								canMove = true;
								try {
									Thread.sleep(250);
								}
								catch (Exception e) {
									e.printStackTrace();							
								}
								
							}
						}
					}
				}
				break;
			default:
				break;
		}if(isBrokenDirt == false) {
		}
		}
	public void run() {
		while (end == false) {
			moveEnemy();
		}
	}
	}


