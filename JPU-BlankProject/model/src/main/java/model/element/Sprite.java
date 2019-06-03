package model.element;

import javax.imageio.ImageIO;
import java.awt.Image;
import java.io.IOException;

public class Sprite {

    private String filename;
    
    private char consoleImage;

    private Image image;

    public Sprite(final char character, final String filename) {
        this.setConsoleImage(character);
        this.setImageName(filename);
        
    }

	public void loadImage() {
        try {
            this.setImage(ImageIO.read(getClass().getClassLoader().getResourceAsStream("images/" + this.getImageName())));
            System.err.println("je charge un sprite");
            
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
    
    private void setImageName(String filename) {
        this.filename = filename;
    }
}
