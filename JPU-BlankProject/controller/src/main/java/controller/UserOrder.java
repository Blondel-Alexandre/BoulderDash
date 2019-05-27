package controller;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
 class UserOrder extends KeyAdapter implements IUserOrder
{

	public void KeyPressed(KeyEvent motion)
	{
		int key =motion.getKeyCode();
		if (key == KeyEvent.VK_UP)
		{
			character.moveUp();
		}
		if (key == KeyEvent.VK_RIGHT) {
			character.moveRight();
		}
		if (key == KeyEvent.VK_LEFT) {
			character.moveLeft();
		}
		if(key == KeyEvent.VK_DOWN){	
			character.moveDown();
		}
	}
	public void KeyRealeased(KeyEvent motion)
	{
		int key =motion.getKeyCode();
		if (key == KeyEvent.VK_UP)
		{
			character.doNothing();
		}
		if (key == KeyEvent.VK_RIGHT) {
			character.doNothing();
		}
		if (key == KeyEvent.VK_LEFT) {
			character.doNothing();
		}
		if(key == KeyEvent.VK_DOWN){	
			character.doNothing();
		}
	}
}
	
		
	




		

	
	

		

	

