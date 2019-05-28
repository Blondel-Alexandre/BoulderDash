package model;

import java.awt.Point;
import java.util.HashMap;

import contract.IModel;
import model.element.motionless.MotionlessElement;

public class BoulderMap {
	
	//private int width = 0, height = 0;
	private HashMap<Point, MotionlessElement> walls;
	
	public BoulderMap() {
		walls = new HashMap<>();
		this.loadLevel();
		
	}
	//private BuffuredImage image;
	protected IModel getModel() {
		return this.getModel();
	}
	
	public void loadLevel() {
	String str = getModel().getHelloWorld().getMessage();
	/*final Graphics graphics;
	graphics.clearRect(0, 0, this.getWidth(), this.getHeight());
	int y = 20;
	for(String str: this.getModel().getHelloWorld().getMessage().split("@")) {
		graphics.drawString(s, 10, y += graphics.getFontMetrics().getHeight());
	}*/
	int length = str.length();
	{
		
	for(int x = 0 ,y = 0 , i = 0; i < length; i++) {
		char c = str.charAt(i);
		x++;
		switch(c) {
		case 'w':
			MotionlessElement wall = new MotionlessElement("Wall.png");
			Point wallPosition = new Point(x, y);
			walls.put(wallPosition, wall);
			break;
		}

	
	}
	}
}
    
    public HashMap<Point, MotionlessElement> getWalls() {
        return this.walls;
    }
}