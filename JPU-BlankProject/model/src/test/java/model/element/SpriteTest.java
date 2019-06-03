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

	@Before
	public void setUp() throws Exception {
		/**
		 * Load the image
		 */
		image = ImageIO.read(getClass().getClassLoader().getResourceAsStream("images/" + filename));
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testSprite() {
		/**
		 * Test if character and filename exist
		 */
		assertNotNull(character);
		assertNotNull(filename);
		
	}

	@Test
	public void testLoadImage() {
		/**
		 * Test if the image has been load
		 */
		assertNotNull(image);
	}

	@Test
	public void testGetImage() {
		/**
		 * Test if the image exists
		 */
		assertNotNull(image);
	}

	@Test
	public void testGetConsoleImage() {
		/**
		 * Test if the ConsoleImage exists
		 */
		assertNotNull(consoleImage);
	}

	@Test
	public void testGetImageName() {
		/**
		 * Test if the filename exists
		 */
		assertNotNull(filename);
	}

}
