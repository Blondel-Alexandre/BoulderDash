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

public class DwarfMinerTest extends DwarfMiner {
/**
*Create the dwarf
*/
	private DwarfMiner dwarf;
	
	
	@Before
	public void setUp() throws Exception {
/**
*Create a dwarf with position equal to (1;1)
*/
		this.dwarf = new DwarfMiner();
		this.dwarf.setX(1);
		this.dwarf.setY(1);
		} ;

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testGetNumberLife() {
/**
*Test if the dwarf number of life exists
*Test if the number of life of the dwarf which are get are equal to the expected one (2)
*/
		assertNotNull(this.dwarf.getNumberLife());
		int expected = 2;
		assertEquals(expected, this.dwarf.getNumberLife());
	}

	@Test
	public void testDwarfMiner() {
/**
*Test if the sprite of the dwarf exists
*Test if the permeability of dwarf is BLOCKING
*Test if the dwarf is a DwarfMiner
*/
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
