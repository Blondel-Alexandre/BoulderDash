package model.element;

import javax.imageio.ImageIO;
import java.awt.Image;
import java.io.IOException;

/**
 * The Class Sprite.
 *
 * @author Groupe 4 A1 - Arras
 */

public class Sprite {
	//* The filename of the image */
    private String filename;
    //* The letter for identify the element in BDD */  
    private char consoleImage;
    //* The image of the element */
    private Image image;

	/**
	 * Instantiates a new sprite.
	 * 
	 * @param character 
	 * 		Character
	 * 
	 * @param filename
	 * 		Filename
	 */
    
    public Sprite(final char character, final String filename) {
        this.setConsoleImage(character);
        this.setImageName(filename);
        
    }
 /**
  * Loads the image.
  * 
  */
	public void loadImage() {
        try {
            this.setImage(ImageIO.read(getClass().getClassLoader().getResourceAsStream("images/" + this.getImageName())));           
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
	/**
	 * Sets the image
	 * 
	 * @param image
	 * 			the image
	 * 
	 */
    private void setImage(final Image image) {
        this.image = image;
    }

    /**
     * Gets the image 
     * 
     * @return image
     * 
     */
    
    public Image getImage() {
        return this.image;
        
    /** 
     * Sets the letter
     * 
     * @param consoleImage
     * 				the letter
     * 
     */
        
    }
    private void setConsoleImage(final char consoleImage) {
        this.consoleImage = consoleImage;
    }
    
    /**
     * Gets the letter
     * 
     * @return consoleImage
     * 
     */
    
    public final char getConsoleImage() {
        return this.consoleImage;
    }
    
    /**
     * Gets the filename of the image.
     * 
     * @return filename
     * 
     */
    
    public final String getImageName() {
        return this.filename;
    }
    /**
     * Sets the filename of the image.
     * 
     * @param filename
     * 			the filename of the image.
     */
    private void setImageName(String filename) {
        this.filename = filename;
    }
}
