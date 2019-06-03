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

public class DiamondTest {
/**
*Create a diamond
*/
	private Diamond diamond;
	

	@Before
	public void setUp() throws Exception {
/**
*Create the diamond method
*/
		this.diamond = new Diamond();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
/**
*Test if the diamond Sprite exists
*Test if the permeability of diamond is BLOCKING
*Test if the Diamond is a diamond
*/
		assertNotNull(this.diamond.getSprite());
		
		Permeability expected1 = Permeability.BLOCKING;
		assertEquals(expected1, this.diamond.getPermeability());
		
		ElementType expected2 =  ElementType.Diamond;
		assertEquals(expected2, this.diamond.getElementType());
	}

}
