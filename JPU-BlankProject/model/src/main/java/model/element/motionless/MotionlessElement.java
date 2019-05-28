package model.element.motionless;

import model.element.Element;
import model.element.Permeability;
import model.element.Sprite;

abstract class MotionlessElement extends Element{
/*
	int x;
	int y;
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	*/
    public MotionlessElement(final Sprite sprite, final Permeability permeability) {
        super(sprite, permeability);
    }
	}
