package model.element;

import javax.imageio.ImageIO;

import contract.ISprite;

import java.awt.Image;
import java.io.File;
import java.io.IOException;

public class Sprite implements ISprite{

    private String filename;
    
    private char consoleImage;

    private Image image;

    public Sprite(final char character, final String filename) {
        this.setConsoleImage(character);
        this.setImageName(filename);
    }

	public void loadImage() {
        try {
            this.setImage(ImageIO.read(new File("images/" + this.getImageName())));
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
	
    private void setImage(final Image image) {
        this.image = image;
    }

    public Image getImage() {
        return this.image;
    }
    private void setConsoleImage(final char consoleImage) {
        this.consoleImage = consoleImage;
    }
    
    public final char getConsoleImage() {
        return this.consoleImage;
    }
    
    public final String getImageName() {
        return this.filename;
    }
    
    private void setImageName(final String imageName) {
       // this.filename = filename;
    }

}
