package model.element;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import contract.ElementType;
import contract.Permeability;
import model.element.mobile.DwarfMiner;

/**
 * The Test DBConnectionTest.
 * @author Groupe 4 A1 - Arras
 */

public class ElementTest {
	/**
	 * Create a DwarfMiner
	 */
	private DwarfMiner dwarf;
	private Sprite sprite = new Sprite('c',"Character.png") ;

	@Before
	public void setUp() throws Exception {
		/**
		 * Set up the DwarfMiner
		 */
		this.dwarf = new DwarfMiner();
		this.dwarf.setX(1);
		this.dwarf.setY(1);
		this.dwarf.setSprite(sprite);
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testElement() {
		/**
		 * Test if setPermeability(),setSprite() and setElementType() works
		 */
		Permeability permeability = Permeability.BLOCKING;
		ElementType elementType = ElementType.DwarfMiner;
		Sprite sprite = new Sprite('c',"Character.png") ;
		this.dwarf.setSprite(sprite);
		this.dwarf.setPermeability(permeability);
		this.dwarf.setElementType(elementType);
		
		assertNotNull(this.dwarf.getSprite());
		assertNotNull(this.dwarf.getPermeability());
		assertNotNull(this.dwarf.getElementType());
		
		assertEquals(permeability,this.dwarf.getPermeability());
		assertEquals(sprite, this.dwarf.getSprite());
		assertEquals(elementType,this.dwarf.getElementType());
	}

	@Test
	public void testGetSprite() {
	/**
	 * Test if dwarf has the good sprite
	 */
		assertNotNull(sprite);
		assertEquals(sprite,this.dwarf.getSprite());
		
		
	}

	@Test
	public void testGetPermeability() {
		/**
		 * Test if dwarf has the good permeability
		 */
		Permeability permeability = Permeability.BLOCKING;
		assertNotNull(permeability);
		assertEquals(permeability, this.dwarf.getPermeability());
	}

	@Test
	public void testGetElementType() {
		/**
		 * Test if dwarf has the good ElementType
		 */
		ElementType elementType = ElementType.DwarfMiner;
		assertNotNull(elementType);
		assertEquals(elementType, this.dwarf.getElementType());
	}


	@Test
	public void testGetX() {
		/**
		 * Test if dwarf has the good position (x)
		 */
		int expected = 1;
		assertEquals(expected, this.dwarf.getX());
	}



	@Test
	public void testGetY() {
		/**
		 * Test if dwarf has the good position (y)
		 */
		int expected = 1;
		assertEquals(expected, this.dwarf.getY());
	}

	@Test
	public void testGetObservable() {
		/**
		 * Test if the observable exists
		 */
		assertNotNull(this);
		
	}

	@Test
	public void testGetFileName() {
		/**
		 * Test if the dwarf has the good filename
		 */
		
		assertNotNull(this.dwarf.getSprite().getImageName());
		String test ="Character.png";
		assertEquals(test, this.dwarf.getSprite().getImageName());
		
	}

}
