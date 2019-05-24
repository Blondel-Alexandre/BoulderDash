package model;

import java.util.Observer;

public interface IInteractions extends Observer {

	public static void updateStatus()
	{
//if(x.Player.player==x.Rock.rock );
//{
//	if (Player.numberLife>1)
//{
//		Player.numberLife--;
//	}
//	else
//	{
//		// dead
//	}
//}
	}
	public static void updateEnnemy()
	{
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
