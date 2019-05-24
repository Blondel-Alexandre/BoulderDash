package model;

import java.awt.Image;

import javax.swing.ImageIcon;

public class Wall extends MotionLessElement  {
	
	public MotionLessElement wall;

	public Wall() {
		super();
		MotionLessElement wall = new MotionLessElement();
		ImageIcon i = new ImageIcon("C:/Users/Avantro/Desktop/a.png");
		Image image = i.getImage();
		wall = this.wall;
		
	}
}
