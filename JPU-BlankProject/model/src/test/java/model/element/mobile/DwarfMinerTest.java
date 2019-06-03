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
*The test DwarfMiner
*
*@author Group 4 A1 - Arras
*/


/**
*Create the dwarf
*/
public class DwarfMinerTest extends DwarfMiner {
	private DwarfMiner dwarf;
	
/**
*Create a dwarf with position equal to (1;1)
*/	
	@Before
	public void setUp() throws Exception {
		this.dwarf = new DwarfMiner();
		this.dwarf.setX(1);
		this.dwarf.setY(1);
		} ;

	@After
	public void tearDown() throws Exception {
	}


	
/**
*Test if the sprite of the dwarf exists
*Test if the permeability of dwarf is BLOCKING
*Test if the dwarf is a DwarfMiner
*/
	@Test
	public void testDwarfMiner() {
		assertNotNull(this.dwarf.getSprite());
		
		Permeability expected1 = Permeability.BLOCKING;
		assertEquals(expected1, this.dwarf.getPermeability());
		
		ElementType expected2 =  ElementType.DwarfMiner;
		assertEquals(expected2, this.dwarf.getElementType());
		
	}
/*
	@Test
	public void testMoveUpPlayer() {
		this.dwarf.moveUpPlayer();
		int expected = 0;
		assertEquals(expected,this.dwarf.getY());
	}

	@Test
	public void testMoveLeftPlayer() {
		this.dwarf.moveLeftPlayer();
		int expected = 0;
		assertEquals(expected,this.dwarf.getX());
	}

	@Test
	public void testMoveDownPlayer() {
		this.dwarf.moveDownPlayer();
		int expected = 2;
		assertEquals(expected,this.dwarf.getY());
	}

	@Test
	public void testMoveRightPlayer() {
		this.dwarf.moveRightPlayer();
		int expected = 2;
		assertEquals(expected,this.dwarf.getX());
		
	}*/

}
