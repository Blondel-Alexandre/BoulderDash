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
public class DirtTest {
	/**
	 * Create the Dirt
	 */
	private Dirt dirt;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}
	
	/**
	* Update brokenDirt
	*/
	@Before
	public void setUp() throws Exception {
		this.dirt = new Dirt();
	}

	@After
	public void tearDown() throws Exception {
	}
	
	/**
	* test if the Dirt exists
	* test if the permeability of Dirt is BLOCKING
	* test if the dirt is a Dirt
	*/
	@Test	
	public void test() {
	
		assertNotNull(this.dirt.getSprite());
		Permeability expected1 = Permeability.BLOCKING;
		assertEquals(expected1, this.dirt.getPermeability());
		ElementType expected2 =  ElementType.Dirt;
		assertEquals(expected2, this.dirt.getElementType());
		
	}

}
