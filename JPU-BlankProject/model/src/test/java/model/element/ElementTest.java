package model.element;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import contract.ElementType;
import contract.Permeability;
import model.element.mobile.DwarfMiner;

public class ElementTest {
	
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
		this.dwarf.setSprite(sprite);
		this.dwarf.setPermeability(permeability);
		this.dwarf.setElementType(elementType);

		
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testElement() {
		assertNotNull(sprite);
		assertNotNull(permeability);
		assertNotNull(elementType);
	}

	@Test
	public void testGetSprite() {
		assertNotNull(sprite);
		assertEquals(sprite,this.dwarf.getSprite());
		
		
	}

	@Test
	public void testGetPermeability() {
		assertNotNull(permeability);
		assertEquals(permeability, this.dwarf.getPermeability());
	}

	@Test
	public void testGetElementType() {
		assertNotNull(elementType);
		assertEquals(elementType, this.dwarf.getElementType());
	}


	@Test
	public void testGetX() {
		int expected = 1;
		assertEquals(expected, this.dwarf.getX());
	}



	@Test
	public void testGetY() {
		int expected = 1;
		assertEquals(expected, this.dwarf.getY());
	}

	@Test
	public void testGetObservable() {
		assertNotNull(this);
		
	}

	@Test
	public void testGetFileName() {
		assertNotNull(this.dwarf.getSprite().getImageName());
		String test ="Character.png";
		assertEquals(test, this.dwarf.getSprite().getImageName());
		
	}

}
