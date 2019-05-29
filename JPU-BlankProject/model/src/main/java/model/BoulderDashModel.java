package model;

//import java.io.BufferedReader;
//import java.io.BufferedWriter;
//import java.io.File;
//import java.io.FileInputStream;
//import java.io.FileNotFoundException;
//import java.io.FileReader;
//import java.io.FileWriter;
//import java.io.IOException;
//import java.io.InputStream;
//import java.io.InputStreamReader;
//import java.io.PrintWriter;
//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
//import java.sql.Statement;
//import java.time.format.ResolverStyle;
import java.util.Observable;
//import java.util.Scanner;

import contract.IElement;
import contract.IModel;
import entity.Level;
import model.element.mobile.*;
import model.element.motionless.*;


/**
 * The Class Model.
 *
 * @author Jean-Aymeric Diet
 */
public final class BoulderDashModel extends Observable implements IModel {

	/** The helloWorld. */

	private Level helloWorld;
	
	private Level levelSize ;


	//private BoulderMap boulderMap;
	//get Sprite type into arraylist
	private ArrayList<IElement> sprites;
	/**
	 * Instantiates a new model.
	 */
	public BoulderDashModel() {
		this.sprites = new ArrayList<>();
		this.helloWorld = new Level();
		this.levelSize = new Level();
		//this.boulderMap = new BoulderMap();
		
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

	/**
     * Sets the hello world.
     *
     * @param helloWorld
     *            the new hello world
     */
	private void setHelloWorld(final Level helloWorld) {
		this.helloWorld = helloWorld;
		this.setChanged();
		this.notifyObservers();
	}

	
	public void loadHelloWorld(final String code) {
		try {
			final DAOHelloWorld daoHelloWorld = new DAOHelloWorld(DBConnection.getInstance().getConnection());
			this.setHelloWorld(daoHelloWorld.find(code));
		} catch (final SQLException e) {
			e.printStackTrace();
		}
	}
	
	
	/**
     * Gets the observable.
     *
     * @return the observable
     */
	/*
	 * (non-Javadoc)
	 *
	 * @see contract.IModel#getObservable()
	 */
	public Observable getObservable() {
		return this;
	}

	
	@Override
	public ArrayList<IElement> getSprites() {
		System.out.println("aaaa");
		char[][] map = this.helloWorld.getLevel();
		//System.out.println(map);

		for(int y = 0, mapSize = this.levelSize.getLevelSize(); y < mapSize ; y++) {
			for (int x = 0; x < mapSize ; x++) {

				char c = map[y][x];
	    		//System.out.println(c);
	    		//System.out.println(mapSize + "je suis la putain de taille de map ta mere");
	    		System.out.println(x+ "je suis x");	 
	    		//System.out.println(y +"je suis y");
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
	                    BrokenDirt brokendirt = new BrokenDirt();
	                    brokendirt.setX(x);
	                    brokendirt.setY(y);
	                    this.sprites.add(brokendirt);
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
	                case 'm':
	                    Enemy enemy = new Enemy();
	                    enemy.setX(x);
	                    enemy.setY(y);
	                    this.sprites.add(enemy);
	                    break;
	                case 'c':
	                	DwarfMiner dwarf = new DwarfMiner();
	                	dwarf.setX(x);
	                	dwarf.setY(y);
	                	this.sprites.add(dwarf);
	                	break;
					
				}
			}
		}
		return this.sprites;
	}
	
	public ArrayList<IElement> zob() {
		System.out.println("aakvdvdbkxwbxcjkxlvxdjklnaa");
		return this.sprites;
	}

}
