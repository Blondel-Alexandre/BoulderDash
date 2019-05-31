package model.element;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import model.element.motionless.Wall;
import model.element.*;
import model.element.mobile.DwarfMiner;

public class ElementTest  {
	private DwarfMiner dwarf;
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

	/*@Test
	public void testElement() {
	
	}
	**/
	




	/*@Test
	public void testGetImage() {
		assertNotNull(this.getSprite().getImage());
	}
	**/

	@Test
	public void testGetX() {
		int expected = 1;
		assertEquals(expected, this.dwarf.getX());
	}

	@Test
	public void testGetY() {
		int expected = 1;
		assertEquals(expected, this.dwarf.getY());	}
}


	/*@Test
	public void testGetFileName() {
		fail("Not yet implemented");
	}

	@Test
	public void testSetObserver() {
		fail("Not yet implemented");
	}

}
**/