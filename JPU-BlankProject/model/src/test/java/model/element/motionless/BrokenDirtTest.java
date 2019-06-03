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

public class BrokenDirtTest  {
	/**
	 * Create the BrokenDirt
	 */
	private BrokenDirt brokenDirt;

	@Before
	public void setUp() throws Exception {
		/**
		 * Update brokenDirt
		 */
		this.brokenDirt = new BrokenDirt();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testBrokenDirt() {
		/**
		 * test if the brokenDirt exists
		 * test if the permeability of brokenDirt is BLOCKING
		 * test if the brokenDirt is a BrokenDirt
		 */
		assertNotNull(this.brokenDirt.getSprite());
		
		Permeability expected1 = Permeability.BLOCKING;
		assertEquals(expected1, this.brokenDirt.getPermeability());
		
		ElementType expected2 =  ElementType.BrokenDirt;
		assertEquals(expected2, this.brokenDirt.getElementType());
		
	}

}
