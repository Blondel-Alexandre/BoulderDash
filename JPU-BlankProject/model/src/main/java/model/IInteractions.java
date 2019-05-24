package model;

import java.util.Observer;

public interface IInteractions extends Observer {

	public static void updateStatus()
	{
if(Player.x == Rock.x && Player.y == Rock.y);
{
	if (Player.numberLife>1)
{
		Player.numberLife--;
	}
	else
	{
		// dead
	}
}
	}
	public static void updateEnnemy()
	{
		if(Ennemy.x == Rock.x && Ennemy.y == Rock.y);
		{
			
		}
		
		// ennemi en diamant
	}
	public static void updateScore()
	{
		// score diamant
	}
	public static void updateDirt()
	{
		// terre -> terre cassée
	}
	public static void updatePosition()
	{
		// gravité
	}
	public static void blockPosition()
	{
		// position mur/rocher
	}
}
