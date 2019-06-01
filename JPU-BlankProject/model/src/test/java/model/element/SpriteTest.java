package model.element;

import static org.junit.Assert.*;

import java.awt.Image;

import javax.imageio.ImageIO;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import model.element.motionless.Wall;

public class SpriteTest  {
<<<<<<< HEAD
	private String filename = "Wall.png";
=======
	private Wall wall;
    private String filename = "Wall.png";
>>>>>>> c7abc14db61243a9d52256eac4cce22f5fe95c6f
    private String consoleImage ="w";
    private Image image;
    private char character;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		image = ImageIO.read(getClass().getClassLoader().getResourceAsStream("images/" + filename));
<<<<<<< HEAD
		new Wall();
=======
		this.wall = new Wall();
>>>>>>> c7abc14db61243a9d52256eac4cce22f5fe95c6f

	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testSprite() {
		assertNotNull(character);
		assertNotNull(filename);
		
	}

	@Test
	public void testLoadImage() {
		assertNotNull(image);
	}

	@Test
	public void testGetImage() {
		assertNotNull(image);
	}

	@Test
	public void testGetConsoleImage() {
		assertNotNull(consoleImage);
	}

	@Test
	public void testGetImageName() {
		assertNotNull(filename);
	}

}
