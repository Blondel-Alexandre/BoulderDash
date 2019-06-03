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

public class MobileTest  {
	private DwarfMiner dwarf;
	private Sprite sprite = new Sprite('c',"Character.png") ;
	private Permeability permeability = Permeability.BLOCKING;
	private ElementType elementType = ElementType.DwarfMiner;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		this.dwarf = new DwarfMiner();
		this.dwarf.setX(1);
		this.dwarf.setY(1);
	
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testMobile() {
		assertNotNull(sprite);
		assertNotNull(permeability);
		assertNotNull(elementType);
	}

	@Test
	public void testMoveUp() {
		this.dwarf.moveUp();
		int expected = 0;
		assertEquals(expected,this.dwarf.getY());
	}

	@Test
	public void testMoveDown() {
		this.dwarf.moveDown();
		int expected = 2;
		assertEquals(expected,this.dwarf.getY());
	}

	@Test
	public void testMoveRight() {
		this.dwarf.moveRight();
		int expected = 2;
		assertEquals(expected,this.dwarf.getX());
		
	}

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
