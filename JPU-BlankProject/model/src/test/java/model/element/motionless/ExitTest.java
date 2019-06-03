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

public class ExitTest {
	/**
	 * Create the exit
	 */
	private Exit exit;
	
	/**
	* Update the exit
	*/
	@Before
	public void setUp() throws Exception {
		this.exit = new Exit();
	}

	@After
	public void tearDown() throws Exception {
	}
	
	/**
	* test if the exit exists
	* test if the permeability of exit is BLOCKING
	* test if the exit is a Exit
	*/
	@Test
	public void test() {
		assertNotNull(this.exit.getSprite());
		Permeability expected1 = Permeability.BLOCKING;
		assertEquals(expected1, this.exit.getPermeability());
		ElementType expected2 =  ElementType.Exit;
		assertEquals(expected2, this.exit.getElementType());
	}

}
