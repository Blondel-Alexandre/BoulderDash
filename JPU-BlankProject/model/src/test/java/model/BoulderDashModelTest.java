package model;

import static org.junit.Assert.*;


import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import contract.IElement;

/**
 * The Test Model.
 *
 * @author Groupe 4 A1 - Arras
 */

public class BoulderDashModelTest  {
 
	/**
	 * Create model and element
	 */
	private BoulderDashModel model;
	IElement elements;

	@Before
	public void setUp() throws Exception {
		/**
		 * Create new BoulderDahModel() in model
		 * Create new model.getElement() in elements
		 */
		this.model = new BoulderDashModel();
		this.elements=model.getElement();
	}

	@After
	public void tearDown() throws Exception {
	}


	@Test
	public void testGetHelloWorld() {
		/**
		 * Test if model.helloWorld exist
		 */
		assertNotNull(this.model.helloWorld);
	}

	@Test
	public void testLoadHelloWorld() { 
		/**
		 * Test if the message in the database is equals to this message
		 */
		this.model.loadHelloWorld("1");
		assertEquals("wwwwwwwwwwwwwwwwwwwwwwwwwwwwww@wrrrrrddddddddddddddddddddridw@wbbbbbddrddddddrrrrdddrdddrddw@wbbbbbdddddrddddddddddddddrddw@wcddddidddddddddddrddddrddrrrw@wddddddddddddddddddddddddddddw@wdrddddddddrdddddddddrdddddddw@wdddrdddddrddddrddddiddddddddw@wdddrdrddddddrddddddddddrddddw@wdddddddddrddddddrdddddrdddddw@wdrdddddrddddddddddddddddddddw@wddddddddddrdddrddidddrddddddw@wddrddrdrddddidddddddddrdddddw@wdddidddddddrdddrddddddddddddw@wdddrdddrdddddddddddiddrddiddw@wdddddddddrddddddrdddddrdddddw@wddrddidddrddddddddrddddrddddw@wddrdddidddddrdddddrdddddddddw@wrrrddddrdddrddddddrrrrdddrddw@wddddddddidddddddddddddddddddw@wddddiddrddddrdddiddddrddddddw@wddrdddddidddddddddddddddddddw@wddddddddddddddddrrrdddddddddw@wdddrdddddddddddddiddrdddrdddw@wddrirdddddrdddddrdddirddddddw@wwwwwwwwwwddddddddddddrrdrdddw@wdddddddrwddddddrddddddddrwwww@wdrrrrrrwwdddddddddrdddddddddw@wddddddidddddddddddidddrwbddpw@wwwwwwwwwwwwwwwwwwwwwwwwwwwwww", this.model.getHelloWorld().getMessage());
		this.model.loadHelloWorld("2");
		assertEquals("wwwwwwwwwwwwwwwwwwwwwwwwwwwww@wcdddddrdrdrirrrrrrdddddddriw@wrdddrddddddrdddddddddddddrrw@widdddrrrddddddrddddrdddrdedw@wrdddrdddddbbbddddddddddddddw@wddddddddddbebdrdrdrdddrrdddw@wrddrddddddbbbddddrdrdrddddrw@wdrrdrrrddrrdddddrdddrddddddw@wirddddrrddddddrdddddddrddddw@wddddddddrddrdddddddddddrdddw@wedrrdddddddddddddddddddiwwww@wbwwwwwwwwwwwdddwwwwwwwwwwwww@wbwrdddddddrrrirddddddddddddw@wbwidddddddddddddddrddirrrddw@wwwwwwwwwwwdrddddddidddddddww@wirrrrdddddddddddddrdddddwwww@wddddddddddddddddddddddddwirw@wwwwwwwwrwwwddddddrdrdddddddw@wrdddddddddwddrrddddddddddddw@wddwwwwwwddwddddddddddddrrrrw@wddwrrrrwddwddwdwwwwwwwddddiw@wrdwddddwdrwddwbbbbbbewwwwwdw@wddwdwddwddwddwbbbbbbiwdddddw@wdrwdwiiwddwddwbbbbbbbwdddddw@wddwdwwwwddwddwwwwwwwwwdddddw@wddwdrdrdddwddddddddddwwwwwww@wddwdddddddwrrrrrrrrrdwebpbrw@wdddwwwwwwwwddddddddddwbbbddw@wddddddddddddbbbbbbbbddbbbbiw@wwwwwwwwwwwwwwwwwwwwwwwwwwwww", this.model.getHelloWorld().getMessage());
		this.model.loadHelloWorld("3");
		assertEquals("wwwwwwwwwwwwwwwwwwwwwwwwwwwww@wcdddddddddddddddddddddrrrriw@wdwwwwwwwwwwwwwdddddddddddddw@wdwdddddddddddwwrrddddrrrdrrw@wdwddddwwwwwrdwddddwwdddddddw@wdwdrddwrrrwddwdddwwwwdwdwdww@wdwddddwddddddwdrrrrrrdwdwddw@wdwrdddwddbwwdwddddddddwdwddw@wdwdrddwddbwddwwrrrrrwdwdwddw@wdwddddwddbwdrwidddddddwdwddw@wdwirdddddewddwdddddddwwdwddw@wdwwwwdwwwwwwdwddddddrdwdwddw@wbbbbwdrdddiwbbbbbbbbrdwdwddw@wbbebwddrdddwbbbebbbbriwdwddw@wbbbiwdddrddwbbbbbbbbdwwwwwww@wwwwwdddddrdwwwddddddwbbbbbbw@wirrrdddrrrrwwwwwwwwwwbbpbbew@wddddwdddddrdddddddddwbbbbbbw@wdrrrwdddddrrdrwrrrddwbbbbbbw@wdrrrwdddddrdrrdddddrwbbbbbbw@wdrrrwdddddrddrirdrrdwdrddddw@wdddrwdwwwwrdrrdrrrdrwwdddddw@wddddwbbbbbrrwrddirdddddwwwww@wbbbbwbbebbrrrdrrrrrwwddddddw@wbbbbwbbbbbrddrddrrdwwdwddddw@wbbbbwbbbbbrddwwrddwdwddddddw@wbebbwbbebbrdddddwdddwddddddw@wbbbbwrbbbbrdddddddddwddddddw@wbbbbddbbbbdddddddddddddddddw@wwwwwwwwwwwwwwwwwwwwwwwwwwwww", this.model.getHelloWorld().getMessage());
		this.model.loadHelloWorld("4");
		assertEquals("wwwwwwwwwwwwwwwwwwwwwwwwwwwwww@wcdddddddddddddddddddbbbebbbiw@wddddddddddddddddddddbbbbebbiw@wddddddddddddddddddddbbbbbebbw@wddddddddddddddddddddbbbbbbebw@wwwwwwwwwwwwwwwwwwwwwwwwdddddw@wrddrdirddrddrddrddrddrddddddw@wdrddrddrddrddrddrddrddrdddddw@wddddddddddddddddddddddddddddw@wrddddddddrddddddddddrrrdddddw@wwwwwwwwwwwdddddddddddddddebbw@wbbbbbbbbrwdddddddddddddddbibw@wbbbbbbbbdddddddddddddddddbbbw@wbbbbbbbbwwwwwwwwwwwwwwwwwwwww@wbbbeeebbbwddddddddddddbbbpbbw@wbbbeiebbbwdddddddddddwbbbbbbw@wbbbeeebbbwdddddrrddddwbbbbbbw@wbbbbbbbbbwddddrddrdddwbbebbbw@wbbbbbbbbbwddddrdirdddwbbbbbbw@wbbbbbbbbbwddddrddrdddwbbbbbbw@wbbbbbbbbbwdddddrrddddwbbebbbw@wbbbbbbbbbwdddddddddddwbbbbbbw@wwwwwwddddwdddddddddddwddbbddw@wdrrrrrrrdwrrrrdddddddwbbebbbw@wdddddddddwrdddrddddddwbbbbbbw@wdbbbbbbbdddrdddrdddddwbbebbbw@wdbbbbbbbddrdddddddrddwddddddw@wdebebebeddddddrrdddddwddddddw@wdddddddddddddddddddddwdddiddw@wwwwwwwwwwwwwwwwwwwwwwwwwwwwww", this.model.getHelloWorld().getMessage());
		this.model.loadHelloWorld("5");
		assertEquals("wwwwwwwwwwwwwwwwwwwwwwwwwwwwww@wcbbbbibwddddrrrrrrrrrrrrrrriw@wbbbbbebwddwdddddddddddddddddw@wbbbbbbbwddwrrrrrrrrrrrrrrrrdw@wbbebbbbwddwiddddddddddddddddw@wbbbbbbbwrdwddrrrrrrrrrrrrrrdw@wbbebbbbdddwdddddddddddddddddw@wwwwwwwwwwwwwwwwwwwwwwwwwwwwdw@wbbbbebbbbbbbbbbbbbebbbbbbbbbw@wbbbbebbbbebbbbbbbbebbbbbbbbbw@wbbbbibbbbebbbbibbbbbbbebbbbbw@wwbbbwbbbbbbbbbwbbbbbbbebbbbbw@wdbbbbbebbbbbbbebbbbbbbbbbbbbw@wdwwwwwwwwwwwwwwwwwwwwwwwwwwww@wdddddddrdddddddddddrddrddbbiw@wddddrddrdddrdddddrddddddrrbdw@wddddddddddddrddddddddrdrddbdw@wdddrddrdrddddrddddrddddddrbdw@wdddddddddddddrdddddddddrddedw@wdwwwwwwwwwwwwwwwwwwwwwwwwwwww@wbbbbbbbbbbbbbrbbbbbbbbbbbbbbw@wbbbbbbbbbbbbbdbbbbbbbbbbibbbw@wbbbbbbbbbeeeeeebbbbbbbbbwbbbw@wbbbbbbbbbbbbbbbbbbbbbbbbbbbbw@wbbeeeeeeeeeeeeeeeeeeeeeeebbbw@wbbbbbibbbbbbbbbbbbibbbbbbbbbw@wbbbbbwbbbbbbbbbbbbwbbbbbbbbbw@wbbbbbbbbbbbbbbeeeeeebbbbbbbbw@wbbbbbbbbbbbbbbbbbbbbbbbbbbbpw@wwwwwwwwwwwwwwwwwwwwwwwwwwwwww", this.model.getHelloWorld().getMessage());
	}

	@Test
	public void testGetSprites() {
		/**
		 * Test if the sprites exist and load
		 */
		assertNotNull(this.model.sprites);
	}

	@Test
	public void testElementList() {
		/**
		 * Test the elements of the level in the map
		 */
		assertNotNull(this.model.sprites);
	}

	@Test
	public void testGetDwarf() {
		/**
		 * Test if DwarfMiner exists
		 */
		assertNotNull(this.model.dwarfs);
	}

	@Test
	public void testGetElement() {
		/**
		 * Test if elements exist 
		 */
		assertNotNull(this.model.elements);
		
	}

	@Test
	public void testGetObservable() {
		/**
		 * Test if the observable exists
		 */
		assertNotNull(this);
	}
	
	
}
