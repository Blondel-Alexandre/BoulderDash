package model.element;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import model.element.motionless.Wall;
import model.element.*;

public class ElementTest  {
	private Sprite sprite;
	private Permeability permeability;
	protected int x = 3;
	protected int y = 2;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		Wall wall = new Wall();
	}

	@After
	public void tearDown() throws Exception {
	}

	/*@Test
	public void testElement() {
		fail("Not yet implemented");
	}
	**/

	@Test
	public void testGetSprite() {
		assertNotNull(this.sprite);
	}

	@Test
	public void testGetPermeability() {
		assertNotNull(this.permeability);
	}

	/*@Test
	public void testGetImage() {
		assertNotNull(this.getSprite().getImage());
	}
	**/

	@Test
	public void testGetX() {
		assertNotNull(x);
	}

	@Test
	public void testGetY() {
		assertNotNull(y);
	}
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