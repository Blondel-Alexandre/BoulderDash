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
import model.element.motionless.Wall;

/**
 * The Class Model.
 *
 * @author Jean-Aymeric Diet
 */
public final class BoulderDashModel extends Observable implements IModel {

	/** The helloWorld. */
	private Level helloWorld;
	//private BoulderMap boulderMap;
	//get Sprite type into arraylist
	private ArrayList<IElement> sprites;
	/**
	 * Instantiates a new model.
	 */
	public BoulderDashModel() {
		this.sprites = new ArrayList<>();
		this.helloWorld = new Level();
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
		char[][] map = this.helloWorld.getLevel();
		for(int y = 0; y < 16; y++) {
			for (int x = 0; x < 16 ; x++) {
				char c = map[y][x];
				switch (c) {
				case 'w':
					Wall wall = new Wall();
					wall.setX(x);
					wall.setY(y);
					this.sprites.add(wall);
					break;
				}
			}
		}
		return this.sprites;
	}
	

}
