package model.element.mobile;

<<<<<<< HEAD
import model.element.Permeability;
import model.element.Sprite;

public class DwarfMiner extends Mobile{
=======
import contract.IDwarfMiner;
import model.element.Permeability;
import model.element.Sprite;

public class DwarfMiner extends Mobile implements IDwarfMiner
{
>>>>>>> d6bbc594eb66f78b5ff4871a17facf8dab3e2977

static int numberLife =2;
private static final Sprite SPRITE = new Sprite('c', "C:\\Users\\Avantro\\Desktop\\Dwarf.png");


<<<<<<< HEAD
    private static final Sprite SPRITE = new Sprite('c', "E:\\Java\\BoulderDash\\BoulderDash\\JPU-BlankProject\\model\\resource\\Character.png");
	
	public DwarfMiner() {
		super(SPRITE, Permeability.BLOCKING);
		
	}
=======
public DwarfMiner() {
	super(SPRITE, Permeability.BLOCKING);
}
>>>>>>> d6bbc594eb66f78b5ff4871a17facf8dab3e2977
public int getNumberLife() {
	return numberLife;
}
<<<<<<< HEAD
public void setNumberLife(int numberLife) {
	DwarfMiner.numberLife = numberLife;
}
=======
/*public void setNumberLife(int numberLife) {
	this.numberLife = numberLife;
}*/

>>>>>>> 91b3597abdf1779749cdc7bebced5060c1ad4046
}

