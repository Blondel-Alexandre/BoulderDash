package model.element.motionless;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import contract.ElementType;
import contract.Permeability;

public class ExitTest {
	private Exit exit;
	

	@Before
	public void setUp() throws Exception {
		this.exit = new Exit();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		assertNotNull(this.exit.getSprite());
		
		Permeability expected1 = Permeability.BLOCKING;
		assertEquals(expected1, this.exit.getPermeability());
		
		ElementType expected2 =  ElementType.Exit;
		assertEquals(expected2, this.exit.getElementType());
	}

}
