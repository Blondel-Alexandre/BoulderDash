package model.element.mobile;

import contract.ElementType;
import contract.Permeability;
import model.element.Sprite;

public class Enemy extends Mobile{


    private static final Sprite SPRITE = new Sprite('e', "enemy1.png");

	//public void Enemyint (int x, int y){
	//	this.x = x;
	//	this.y = y;
	//}
	
	public void move(){
		int NombreAle;
		//choisir un nombre aléatoire pour le comportement 
		NombreAle = (int)(Math.random()*4);
		 switch (NombreAle) {
		 
			  //deplacement à droite
              case '1' :
              moveRight();
			  break;
		
			  //deplacement à gauche
              case '2' :
              moveLeft();
              break;
				
			  // deplacement en haut	  
              case '3' :
               moveUp();
                break;
				
			  //deplacement en bas
              case '4' :
              moveDown();
               break;
                }
            }
	
	public Enemy() {
		super(SPRITE, Permeability.BLOCKING, ElementType.Enemy);
		this.getSprite().loadImage();
	}

}
