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
*The test Diamond
*
*@author Group 4 A1 - Arras
*/


/**
*Create a diamond
*/
public class DiamondTest {
	private Diamond diamond;
	
	
/**
*Create the diamond method
*/
	@Before
	public void setUp() throws Exception {
		this.diamond = new Diamond();
	}

	@After
	public void tearDown() throws Exception {
	}

	
/**
*Test if the diamond Sprite exists
*Test if the permeability of diamond is BLOCKING
*Test if the Diamond is a diamond
*/
	@Test
	public void test() {
		assertNotNull(this.diamond.getSprite());
		
		Permeability expected1 = Permeability.BLOCKING;
		assertEquals(expected1, this.diamond.getPermeability());
		
		ElementType expected2 =  ElementType.Diamond;
		assertEquals(expected2, this.diamond.getElementType());
	}

}
