package contract;

public interface IMobile  {

	void moveUp();
	void moveLeft();
	void moveDown();
	void moveRight();
	void doNothing();
	int getX();
	int getY();
	void setY(int y);
	void setX(int x);

}
