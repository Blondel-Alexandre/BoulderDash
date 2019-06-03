package model.element;

import static org.junit.Assert.*;

import java.awt.Image;

import javax.imageio.ImageIO;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
/**
 * The Test DBConnectionTest.
 * @author Groupe 4 A1 - Arras
 */

public class SpriteTest  {
	/** 
	 * Initialization
	 */
    private String filename = "Wall.png";
    private String consoleImage ="w";
    private Image image ;
    private char character;
    
    /**
	* Load the image
	*/
	@Before
	public void setUp() throws Exception {
		image = ImageIO.read(getClass().getClassLoader().getResourceAsStream("images/" + filename));
	}

	@After
	public void tearDown() throws Exception {
	}
	
	/**
	* Test if character and filename exist
	*/
	@Test
	public void testSprite() {
		
		assertNotNull(character);
		assertNotNull(filename);
		
	}
	
	/**
	* Test if the image has been load
	*/
	@Test
	public void testLoadImage() {
		assertNotNull(image);
	}
	
	/**
	* Test if the image exists
	*/
	@Test
	public void testGetImage() {
		assertNotNull(image);
	}
	
	/**
	* Test if the ConsoleImage exists
	*/
	@Test
	public void testGetConsoleImage() {
		assertNotNull(consoleImage);
	}
	/**
	* Test if the filename exists
	*/
	@Test
	public void testGetImageName() {
		assertNotNull(filename);
	}

}
