package model.element.motionless;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import contract.ElementType;
import contract.Permeability;
/**
 * The Test DBConnectionTest.
 * @author Groupe 4 A1 - Arras
 */
public class MotionlessElementTest  {
	/**
	 * Create the wall
	 */
	private Wall wall;

	@Before
	public void setUp() throws Exception {
		/**
		 * Update wall
		 */
		this.wall = new Wall();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testMotionlessElement() {
		
		/**
		 * test if the wall exists
		 * test if the permeability of wall is BLOCKING
		 * test if the wall is a Wall
		 */
		assertNotNull(this.wall.getSprite());
		Permeability expected1 = Permeability.BLOCKING;
		assertEquals(expected1, this.wall.getPermeability());
		ElementType expected2 =  ElementType.Wall;
		assertEquals(expected2, this.wall.getElementType());
	}

}
