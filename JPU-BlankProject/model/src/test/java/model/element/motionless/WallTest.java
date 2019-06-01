package model.element.motionless;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import contract.ElementType;
import contract.Permeability;
import model.element.Sprite;

public class WallTest {
	private Wall wall;
	public Sprite sprite = new Sprite('w',"Wall.png");
	private Permeability permeability = Permeability.BLOCKING;
	private ElementType elementType = ElementType.Wall;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		this.wall = new Wall();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testWall() {
		assertEquals(sprite, this.wall.getSprite());
		
		
	}

}
