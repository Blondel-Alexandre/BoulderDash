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
	
	/**
	* Set up the DwarfMiner
	*/
	@Before
	public void setUp() throws Exception {
		
		this.dwarf = new DwarfMiner();
		this.dwarf.setX(1);
		this.dwarf.setY(1);
		this.dwarf.setSprite(sprite);
	}

	@After
	public void tearDown() throws Exception {
	}
	
	/**
	* Test if setPermeability(),setSprite() and setElementType() works
	*/
	@Test
	public void testElement() {
		
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
	/**
	* Test if dwarf has the good sprite
	*/
	@Test
	public void testGetSprite() {
	
		assertNotNull(sprite);
		assertEquals(sprite,this.dwarf.getSprite());
		
		
	}
	/**
	* Test if dwarf has the good permeability
	*/
	@Test
	public void testGetPermeability() {
		Permeability permeability = Permeability.BLOCKING;
		assertNotNull(permeability);
		assertEquals(permeability, this.dwarf.getPermeability());
	}
	
	/**
	* Test if dwarf has the good ElementType
	*/
	@Test
	public void testGetElementType() {
		ElementType elementType = ElementType.DwarfMiner;
		assertNotNull(elementType);
		assertEquals(elementType, this.dwarf.getElementType());
	}

	/**
	* Test if dwarf has the good position (x)
	*/
	@Test
	public void testGetX() {
		int expected = 1;
		assertEquals(expected, this.dwarf.getX());
	}


	/**
	* Test if dwarf has the good position (y)
	*/
	@Test
	public void testGetY() {
		int expected = 1;
		assertEquals(expected, this.dwarf.getY());
	}
	
	/**
	* Test if the observable exists
	*/
	@Test
	public void testGetObservable() {
		assertNotNull(this);
	}
	/**
	* Test if the dwarf has the good filename
	*/
	@Test
	public void testGetFileName() {
		assertNotNull(this.dwarf.getSprite().getImageName());
		String test ="Character.png";
		assertEquals(test, this.dwarf.getSprite().getImageName());
		
	}

}
