package model;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Observable;

import contract.IElement;
import contract.IMobile;
import contract.IModel;
import entity.Level;
import model.element.mobile.*;
import model.element.motionless.*;


/**
 * The Class Model.
 *
 * @author Groupe 4 A1 - Arras
 */

public class BoulderDashModel extends Observable implements IModel {


	/** The choice of the level */
	public String levelChoice = "1";
	
	/** The level */

	public Level helloWorld;
	
	/** The size of the level */
	public Level levelSize ;
	
	/** The score */
	public int Score =10;
	
	/** The dwarf in IMobile */
	IMobile dwarfs;
	
	/** The dwarf in IElement */
	IElement elements;
	
	
	/** The Array List of the elements in the map */
	public ArrayList<IElement> sprites;
	
	
	/**
	 * Instantiates a new model.
	 */
	public BoulderDashModel() {
		this.sprites = new ArrayList<>();
		this.loadHelloWorld(levelChoice);
		this.levelSize = new Level();
		this.sprites = this.getSprites();
	}
	
	/**
     * Gets the level.
     *
     * @return the level
     */
	/*
	 * (non-Javadoc)
	 *
	 * @see contract.IModel#getMessage()
	 */
	public Level getHelloWorld() {
		return this.helloWorld ;
	}

	/**
	 * Sets the level
	 * 
	 * @param helloWorld
	 */
	
	private void setHelloWorld(final Level helloWorld) {
		this.helloWorld = helloWorld;

	}

	/**
	 * Loads the level.
	 * 
	 * 
	 */
	
	public void loadHelloWorld(final String code) {
		try {
			final DAOHelloWorld daoHelloWorld = new DAOHelloWorld(DBConnection.getInstance().getConnection());
			this.setHelloWorld(daoHelloWorld.find(code));
		} catch (final SQLException e) {
			e.printStackTrace();
		}
	}


	/**
	 * Get sprites of the level.
	 * 
	 * 
	 */
	
	@Override
	public ArrayList<IElement> getSprites() {
		char[][] map = this.helloWorld.getLevel();
		for(int y = 0, mapSize = this.levelSize.getLevelSize(); y < mapSize ; y++) {
			for (int x = 0; x < mapSize ; x++) {
				char c = map[y][x];
				switch (c) {
				case 'w':
					// Loads the walls.
					Wall wall = new Wall();
					wall.setX(x);
					wall.setY(y);
					this.sprites.add(wall);
					break;
				case 'd':
					// Loads the dirts.
					Dirt dirt = new Dirt();
					dirt.setX(x);
					dirt.setY(y);
					this.sprites.add(dirt);
					break;
				case 'b':
					//Loads the broken dirts.
	                BrokenDirt brokenDirt = new BrokenDirt();
	                brokenDirt.setX(x);
	                brokenDirt.setY(y);
	                this.sprites.add(brokenDirt);
	                break;
	            case 'r':
	            	//Loads the rocks.
	                Rock rock = new Rock();
	                rock.setX(x);
	                rock.setY(y);
	                this.sprites.add(rock);
	                break;
	            case 'i':
	            	//Loads the diamonds.
	                Diamond diamond = new Diamond();
	                diamond.setX(x);
	                diamond.setY(y);
	                this.sprites.add(diamond);
	                break;
	            case 'p':
	            	//Loads the exit.
	                Exit exit = new Exit();
	                exit.setX(x);
	                exit.setY(y);
	                this.sprites.add(exit);
	                break;
	            case 'e':
	            	//Loads the enemy.
	                Enemy enemy = new Enemy();
	                BrokenDirt brokenDirt1 = new BrokenDirt();
	             	brokenDirt1.setX(x);
	             	brokenDirt1.setY(y);
	                enemy.setX(x);
	                enemy.setY(y);
	                this.sprites.add(enemy);
	                this.sprites.add(brokenDirt1);
	                break;
	            case 'c':
	            	// Loads the dwarf.
	             	DwarfMiner dwarf = new DwarfMiner();
	             	BrokenDirt brokenDirt2 = new BrokenDirt();
	             	brokenDirt2.setX(x);
	             	brokenDirt2.setY(y);
	              	dwarf.setX(x);
	               	dwarf.setY(y);
	               	this.sprites.add(brokenDirt2);
	               	this.dwarfs=dwarf;
	               	this.elements=dwarf;
	               	break;					
			}
		}
	}
	return this.sprites;
	}

	/**
	 * The elements of the level in the map.
	 * 
	 * @return the elements.
	 */
	public ArrayList<IElement> elementList() {
		return this.sprites;
	}

	/**
	 * Gets the dwarf in IMobile.
	 *
	 * @return the dwarf
	 * 
	 *
	 */
	
	@Override
	public IMobile getDwarf() {
		return this.dwarfs;
	}
	
	/**
	 * Gets the dwarf in IElement.
	 *
	 * @return the dwarf
	 * 
	 *
	 */
	
	@Override
	public IElement getElement() {
		return this.elements;
	}

	/**
	 * Gets the observable.
	 *
	 * @return the observable
	 * 
	 *
	 */
	
	@Override
	public Observable getObservable() {
		return this;
	}
	
	/**
	 * Create a Broken Dirt.
	 *
	 * @param x, y
	 * 			the position
	 * 
	 *
	 */

	public IElement createBrokenDirt(int x, int y) {
        BrokenDirt brokenDirt = new BrokenDirt();
		brokenDirt.setX(x);
        brokenDirt.setY(y);
		return brokenDirt;
	}
	
	/**
	 * Gets the score.
	 *
	 * @return the score
	 * 
	 *
	 */
	
	public int getScore() {
		return Score;
	}
	
	/** Sets the score.
	 *
	 * @param score
	 *          the score
	 */
	public void setScore(int score) {
		this.Score = score;
		this.setChanged();
		this.notifyObservers();
		
	}
	
	/**
	 * Modify the score
	 * 
	 */
	
	public void collectDiamond()
	{
		this.setScore(this.getScore()-1);
		if(getScore()<=0)
		{
			this.setScore(0);
		}
	}

}
