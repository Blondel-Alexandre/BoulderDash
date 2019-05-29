package contract;

import java.awt.Image;
import java.util.Observer;

public interface IElement {
	
	int getX();
	int getY();
	void setX(int x);
	void setY(int y);
	Image getImage();
	String getFileName();
	void setObserver(Observer observer);

}
