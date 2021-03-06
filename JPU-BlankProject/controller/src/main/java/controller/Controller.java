

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
import contract.Permeability;


/**
 * The Class Controller.
 */
public class Controller extends KeyAdapter implements IController, Runnable{

	/** The view. */
	private IView view;

	/** The model. */
	private IModel model;
	
	/** The position of an element. */
	private Point position;
	
	/** The position of the enemy. */
	private Point enemyPosition;
	
	/** The old position of an element. */
	private Point oldPosition;
	
	/** The variable to know if the character is on movement. */
	private boolean characterOnMovement = false;
	
	/** The boolean canMove to know if the character can move. */
	private boolean canMove;

	/** The current element of the list. */
	private IElement currentElement;
	
	/** The enemy of elementList. */
	private IElement enemy;
	
	/** The boolean for the end of the level. */
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
	
	/**
	 * Game over
	 */
	public void gameOver() {
		this.view.printMessage("Game Over");
		System.exit(0);

	}
	
	/**
	 * Win
	 */
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
	/**
	 * Get the model.
	 *
	 * @return
	 *          the model
	 */
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
	 * Gravity
	 */
	public void gravity() {
			for(IElement currentRock : this.getModel().elementList()){
				if(currentRock.getElementType() == ElementType.Rock || currentRock.getElementType() == ElementType.Diamond) {
					position = new Point(currentRock.getX(),currentRock.getY()+1);
						for(IElement nextPos : this.getModel().elementList()) {
							if(nextPos.getX() == position.x && nextPos.getY() == position.y && nextPos.getPermeability() == Permeability.PENETRABLE) {
								System.out.println("je peux bouger");
								currentRock.setY(currentRock.getY()+1);
								
							}
						}
					}
				}
			}
		
		
	/*
	 * (non-Javadoc)
	 *
	 * @see contract.IController#orderPerform(contract.ControllerOrder)
	 */
	/**
	 * orderPereform
	 */
	public void orderPerform(final ControllerOrder controllerOrder) {
		boolean rock = false;
		characterOnMovement = true;
		boolean isBrokenDirt = false;
		switch (controllerOrder) {
			case UP:
				oldPosition = new Point(this.getModel().getDwarf().getX(), this.getModel().getDwarf().getY());
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
						case BrokenDirt:
							if (rock == false) {
								canMove = true;
							}
							isBrokenDirt = true;
						break;
						case Rock:
							canMove = false;
							rock = true;
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

						default:
							break;
						}
					}//this.getModel().elementList().remove(element);
				}if(canMove == true) {
					((IMobile) this.getModel().getDwarf()).moveUp();
				}
				break;
			case DOWN:
				oldPosition = new Point(this.getModel().getDwarf().getX(), this.getModel().getDwarf().getY());
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
							rock = true;
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
							if (rock == false) {
								canMove = true;
							}
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
				oldPosition = new Point(this.getModel().getDwarf().getX(), this.getModel().getDwarf().getY());
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
							rock = true;
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
							if (rock == false) {
								canMove = true;
							}
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
				oldPosition = new Point(this.getModel().getDwarf().getX(), this.getModel().getDwarf().getY());
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
							rock = true;
							break;
						case BrokenDirt:
							if (rock == false) {
								canMove = true;
							}
							isBrokenDirt = true;
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
characterOnMovement = false;
	}
	/**
	 * Replace Element
	 */
	public void replaceElement() {
		if(canMove == true) {
			//characterOnMovement = true;
			this.getModel().elementList().remove(currentElement);
			this.getModel().elementList().add(this.getModel().createBrokenDirt((int) oldPosition.getX(), (int) oldPosition.getY()));
			//characterOnMovement = false;
		}
	}
	/**
	 * Remove Broken Dirt
	 */
	public void removeBrokenDirt() {
			IElement issou = null;
				for(IElement brokenDirtList : this.getModel().elementList()) {
					if(brokenDirtList.getElementType() == ElementType.BrokenDirt)
					for(IElement b : this.getModel().elementList()) {
						if(b.getX() == brokenDirtList.getX() && b.getY() == brokenDirtList.getY() && (b.getElementType() == ElementType.Rock ||b.getElementType() == ElementType.Diamond)) {
							issou = brokenDirtList;							
						}
					}
				}if(issou != null) {
				this.getModel().elementList().remove(issou);
				}
		}
	/**
	 * move Enemy
	 */
	public void moveEnemy(){
		
		Random r = new Random();	
		int random;
		random = r.nextInt(4);
		System.out.println(random);
		switch (random) {
			case 0:
				for(IElement currentEnemy : this.getModel().elementList()){
					if(currentEnemy.getElementType() == ElementType.Enemy) {
						enemy = currentEnemy;
						enemyPosition = new Point(currentEnemy.getX(), currentEnemy.getY()+1);
						for(IElement element : this.getModel().elementList()) {
							if(element.getX() == enemyPosition.getX() && element.getY() == enemyPosition.getY() && element.getElementType() == ElementType.BrokenDirt) {
								currentEnemy.setY(enemyPosition.y);
								}
						}
					}
				}
				break;
			case 1:
				for(IElement currentEnemy : this.getModel().elementList()){
					if(currentEnemy.getElementType() == ElementType.Enemy) {						
						enemy = currentEnemy;
						enemyPosition = new Point(currentEnemy.getX(), currentEnemy.getY()-1);
						for(IElement element : this.getModel().elementList()) {
							if(element.getX() == enemyPosition.getX() && element.getY() == enemyPosition.getY() && element.getElementType() == ElementType.BrokenDirt) {
								currentEnemy.setY(enemyPosition.y);
								}
						}
					}
				}
				break;
			case 2:
				for(IElement currentEnemy : this.getModel().elementList()){
					if(currentEnemy.getElementType() == ElementType.Enemy) {
						
						enemy = currentEnemy;
						enemyPosition = new Point(currentEnemy.getX()+1, currentEnemy.getY());
						for(IElement element : this.getModel().elementList()) {
							if(element.getX() == enemyPosition.getX() && element.getY() == enemyPosition.getY() && element.getElementType() == ElementType.BrokenDirt) {
								currentEnemy.setX(enemyPosition.x);
								}
						}
					}
				}
				break;
			case 3:
				for(IElement currentEnemy : this.getModel().elementList()){
					if(currentEnemy.getElementType() == ElementType.Enemy) {					
						enemy = currentEnemy;
						enemyPosition = new Point(currentEnemy.getX()-1, currentEnemy.getY());
						for(IElement element : this.getModel().elementList()) {
							if(element.getX() == enemyPosition.getX() && element.getY() == enemyPosition.getY() && element.getElementType() == ElementType.BrokenDirt) {
								currentEnemy.setX(enemyPosition.x);	
							}
						}
					}
				}
				break;
			default:
				break;
		}
	}
		
	/**
	 * run the controller
	 */

	@Override
	public void run() {		
		while (end== false && characterOnMovement== false) {

			removeBrokenDirt();

				moveEnemy();
				gravity();
				System.err.println("dqqsd");
				try{
					Thread.sleep(250);
				}
				catch(Exception e) {
					e.printStackTrace();
				
				}
		}
	}
}

