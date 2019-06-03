package model.element.mobile;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import contract.ElementType;
import contract.Permeability;
import model.element.Sprite;
/**
 * The Test DBConnectionTest.
 * @author Groupe 4 A1 - Arras
 */
public class MobileTest  {
	/**
	*Create the dwarf
	*/
	private DwarfMiner dwarf;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}
	/**
	*Create a dwarf with position equal to (1;1)
	*/
	@Before
	public void setUp() throws Exception {
		this.dwarf = new DwarfMiner();
		this.dwarf.setX(1);
		this.dwarf.setY(1);
	}

	@After
	public void tearDown() throws Exception {
	}
	
	/**
	* Test if Mobile worked
	*/
	@Test
	public void testMobile() {
		assertNotNull(this.dwarf.getSprite());
		assertNotNull(this.dwarf.getPermeability());
		assertNotNull(this.dwarf.getElementType());
	}
	/**
	* Test if dwarf has a good position (Y)
	*/
	@Test
	public void testMoveUp() {
		this.dwarf.moveUp();
		int expected = 0;
		assertEquals(expected,this.dwarf.getY());
	}
	/**
	* Test if dwarf has a good position (Y)
	*/
	@Test
	public void testMoveDown() {	
		this.dwarf.moveDown();
		int expected = 2;
		assertEquals(expected,this.dwarf.getY());
	}
	
	/**
	* Test if dwarf has a good position (X)
	*/
	@Test
	public void testMoveRight() {	
		this.dwarf.moveRight();
		int expected = 2;
		assertEquals(expected,this.dwarf.getX());
	}
	
	/**
	* Test if dwarf has a good position (X)
	*/
	@Test
	public void testMoveLeft() {
		this.dwarf.moveLeft();
		int expected = 0;
		assertEquals(expected,this.dwarf.getX());
	}

	@Test
	public void testDoNothing() {
	}

}
