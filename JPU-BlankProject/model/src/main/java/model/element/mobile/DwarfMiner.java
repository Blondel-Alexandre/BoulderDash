package model.element.mobile;

import model.element.Permeability;
import model.element.Sprite;

public class DwarfMiner extends Mobile{

static int numberLife =2;

    private static final Sprite SPRITE = new Sprite('c', "E:\\Java\\BoulderDash\\BoulderDash\\JPU-BlankProject\\model\\resource\\Character.png");
	
	public DwarfMiner() {
		super(SPRITE, Permeability.BLOCKING);
		
	}
public int getNumberLife() {
	return numberLife;
}
/*public void setNumberLife(int numberLife) {
	this.numberLife = numberLife;
}*/

}
