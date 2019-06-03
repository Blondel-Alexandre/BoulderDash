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
 * @author Jean-Aymeric Diet
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
     * Gets the hello world.
     *
     * @return the hello world
     */
	/*
	 * (non-Javadoc)
	 *
	 * @see contract.IModel#getMessage()
	 */
	public Level getHelloWorld() {
		return this.helloWorld ;
	}

	private void setHelloWorld(final Level helloWorld) {
		this.helloWorld = helloWorld;

	}


	
	public void loadHelloWorld(final String code) {
		try {
			final DAOHelloWorld daoHelloWorld = new DAOHelloWorld(DBConnection.getInstance().getConnection());
			this.setHelloWorld(daoHelloWorld.find(code));
		} catch (final SQLException e) {
			e.printStackTrace();
		}
	}


	
	@Override
	public ArrayList<IElement> getSprites() {
		char[][] map = this.helloWorld.getLevel();
		for(int y = 0, mapSize = this.levelSize.getLevelSize(); y < mapSize ; y++) {
			for (int x = 0; x < mapSize ; x++) {
				char c = map[y][x];
				switch (c) {
				case 'w':
					Wall wall = new Wall();
					wall.setX(x);
					wall.setY(y);
					this.sprites.add(wall);
					break;
				case 'd':
					Dirt dirt = new Dirt();
					dirt.setX(x);
					dirt.setY(y);
					this.sprites.add(dirt);
					break;
				case 'b':
	                BrokenDirt brokenDirt = new BrokenDirt();
	                brokenDirt.setX(x);
	                brokenDirt.setY(y);
	                this.sprites.add(brokenDirt);
	                break;
	            case 'r':
	                Rock rock = new Rock();
	                rock.setX(x);
	                rock.setY(y);
	                this.sprites.add(rock);
	                break;
	            case 'i':
	                Diamond diamond = new Diamond();
	                diamond.setX(x);
	                diamond.setY(y);
	                this.sprites.add(diamond);
	                break;
	            case 'p':
	                Exit exit = new Exit();
	                exit.setX(x);
	                exit.setY(y);
	                this.sprites.add(exit);
	                break;
	            case 'e':
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

	public ArrayList<IElement> elementList() {
		return this.sprites;
	}

	@Override
	public IMobile getDwarf() {
		return this.dwarfs;
	}
	
	
	@Override
	public IElement getElement() {
		return this.elements;
	}

	@Override
	public Observable getObservable() {
		return this;
	}

	public IElement createBrokenDirt(int x, int y) {
        BrokenDirt brokenDirt = new BrokenDirt();
		brokenDirt.setX(x);
        brokenDirt.setY(y);
		return brokenDirt;
	}

	public int getScore() {
		return Score;
	}

	public void setScore(int score) {
		this.Score = score;
		this.setChanged();
		this.notifyObservers();
		
	}
	
	public void collectDiamond()
	{
		this.setScore(this.getScore()-1);
		if(getScore()<=0)
		{
			this.setScore(0);
		}
	}

}
