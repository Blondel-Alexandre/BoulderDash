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
	
	/**
	* Create new BoulderDahModel() in model
	* Create new model.getElement() in elements
	*/
	@Before
	public void setUp() throws Exception {
		
		this.model = new BoulderDashModel();
		this.elements=model.getElement();
	}

	@After
	public void tearDown() throws Exception {
	}

	/**
	* Test if model.helloWorld exist
	*/
	@Test
	public void testGetHelloWorld() {
		
		assertNotNull(this.model.helloWorld);
	}
	/**
	* Test if the message in the database is equals to this message
	*/
	@Test
	public void testLoadHelloWorld() { 
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
	
	/**
	* Test if the sprites exist and load
	*/
	@Test
	public void testGetSprites() {
		assertNotNull(this.model.sprites);
	}
	
	/**
	* Test the elements of the level in the map
	*/
	@Test
	public void testElementList() {
		assertNotNull(this.model.sprites);
	}
	
	/**
	* Test if DwarfMiner exists
	*/
	@Test
	public void testGetDwarf() {
		assertNotNull(this.model.dwarfs);
	}
	
	/**
 	*Test if elements exist 
	*/
	@Test
	public void testGetElement() {
		assertNotNull(this.model.elements);
		
	}
	
	/**
	* Test if the observable exists
	*/
	@Test
	public void testGetObservable() {
		assertNotNull(this);
	}
	
	
}
