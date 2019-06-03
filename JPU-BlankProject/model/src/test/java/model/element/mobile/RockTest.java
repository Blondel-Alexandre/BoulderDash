package model.element.mobile;

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

public class RockTest {
	/**
	 * Create the rock
	 */
	private Rock rock;
	
	/**
	* Update rock
	*/
	@Before
	public void setUp() throws Exception {
		
		this.rock = new Rock();
	}

	@After
	public void tearDown() throws Exception {
	}
	/**
	* test if the rock exists
	* test if the permeability of rock is BLOCKING
	* test if the rock is a Rock
	*/
	@Test
	public void test() {
		
		assertNotNull(this.rock.getSprite());
		Permeability expected1 = Permeability.BLOCKING;
		assertEquals(expected1, this.rock.getPermeability());
		ElementType expected2 =  ElementType.Rock;
		assertEquals(expected2, this.rock.getElementType());

	}
}	
