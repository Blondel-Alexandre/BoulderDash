package model.element.motionless;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import contract.ElementType;
import contract.Permeability;

public class BrokenDirtTest  {
	private BrokenDirt brokenDirt;

	@Before
	public void setUp() throws Exception {
		this.brokenDirt = new BrokenDirt();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testBrokenDirt() {
		assertNotNull(this.brokenDirt.getSprite());
		
		Permeability expected1 = Permeability.BLOCKING;
		assertEquals(expected1, this.brokenDirt.getPermeability());
		
		ElementType expected2 =  ElementType.BrokenDirt;
		assertEquals(expected2, this.brokenDirt.getElementType());
		
	}

}
