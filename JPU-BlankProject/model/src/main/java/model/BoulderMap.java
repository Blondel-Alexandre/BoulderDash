package model;

import java.awt.Point;
import java.util.HashMap;

import contract.IBoulderMap;
import contract.IModel;
import model.element.motionless.MotionlessElement;

public class BoulderMap implements IBoulderMap{
	
	//private int width = 0, height = 0;
	private HashMap<Point, MotionlessElement> walls;
	
	public BoulderMap() {
		walls = new HashMap<>();
		this.loadLevel();
		
	}
	//private BuffuredImage image;

	
	public void loadLevel() {

	String mapCharacter = "";
	final String SEPARATEUR = "@";
	String mot[] = mapCharacter.split(SEPARATEUR);
	final int tile = 16;
	char map[][] = new char[tile][tile];
    for (int y = 0; y < mot.length; y++) {
    	String temp = mot[y];
    	int tempLenght = temp.length();
    	for(int x = 0; x < tempLenght; x++) {
    		char c = temp.charAt(x);
    		map[x][y] = c;
    		System.out.println(c + " x : " + x  + " y : " + y );
    		
    		}
      }

}
    
    public HashMap<Point, MotionlessElement> getWalls() {
        return this.walls;
    }
}