package model.element.motionless;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

<<<<<<< HEAD
import contract.ElementType;
import contract.Permeability;

public class BrokenDirtTest {
	
	private BrokenDirt brokenDirt;
=======

public class BrokenDirtTest {
	

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}
>>>>>>> 3d6caa860cd93d3c57b858445bb4b82b68763b0b

	@Before
	public void setUp() throws Exception {
		this.brokenDirt = new BrokenDirt();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
<<<<<<< HEAD
		assertNotNull(this.brokenDirt.getSprite());
		
		Permeability expected1 = Permeability.BLOCKING;
		assertEquals(expected1, this.brokenDirt.getPermeability());
		
		ElementType expected2 =  ElementType.BrokenDirt;
		assertEquals(expected2, this.brokenDirt.getElementType());
=======
		
>>>>>>> 3d6caa860cd93d3c57b858445bb4b82b68763b0b
	}

}
