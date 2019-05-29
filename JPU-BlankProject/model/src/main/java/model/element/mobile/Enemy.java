package model.element.mobile;

public class Enemy extends Mobile{
	private int x;
	private int y;
	//private float speed;
	
	public Enemy(int x, int y) {
		this.x = x;
		this.y = y;
	}
	public int getX()
	{
		return x;
	}
	public int getY()
	{
		return y;
	}
	public void move()
	{
		int NombreAle;
		//choisir un nombre aléatoire pour le comportement 
		NombreAle = (int)(Math.random()*4);
		 switch (NombreAle) {
		 
			  //deplacement à droite
              case '1' :
              x = x + 1;
			  break;
		
		//deplacement à gauche
              case '2' :
                x = x - 1;
                break;
				
			  // deplacement en haut	  
              case '3' :
                y = y - 1;
                break;
				
			  //deplacement en bas
              case '4' :
                y = y + 1 ;
                break;
            }
	}
}
