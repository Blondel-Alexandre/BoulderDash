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
		
	
		assertNotNull(this.wall.getSprite());
		
		Permeability expected1 = Permeability.BLOCKING;
		assertEquals(expected1, this.wall.getPermeability());
		
		ElementType expected2 =  ElementType.Wall;
		assertEquals(expected2, this.wall.getElementType());
	}

}
