package contract;

import java.awt.Image;
import java.util.Observable;

public interface IElement{
	
	int getX();
	int getY();
	void setX(int x);
	void setY(int y);
	Image getImage();
	String getFileName();
	Observable getObservable();
	ElementType getElementType();
	
}
