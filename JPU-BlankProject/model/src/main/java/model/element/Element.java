package model.element;

<<<<<<< HEAD
import java.util.Observable;

public class Element extends Observable {
=======
public class Element implements IElement{
>>>>>>> a1dee9a4e8bde644271779bfca6494d3baaf7d0b
	
protected int x;
protected int y;
	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
		this.setChanged();
		this.notifyObservers();
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
		this.setChanged();
		this.notifyObservers();
	}

}
