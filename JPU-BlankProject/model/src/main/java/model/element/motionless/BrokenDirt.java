package model.element.motionless;

import model.element.Permeability;
import model.element.Sprite;

public class BrokenDirt extends MotionlessElement{

<<<<<<< HEAD
    private static final Sprite SPRITE = new Sprite('b', "C:\\Users\\Avantro\\Desktop\\BrokenDirt.png");
=======
    private static final Sprite SPRITE = new Sprite('w', "Wall.jpg");
>>>>>>> 91b3597abdf1779749cdc7bebced5060c1ad4046
	
	public BrokenDirt() {
		super(SPRITE, Permeability.BLOCKING);
		
	}
	}


